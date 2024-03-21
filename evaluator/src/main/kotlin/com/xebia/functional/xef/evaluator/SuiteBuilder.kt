package com.xebia.functional.xef.evaluator

import com.xebia.functional.openai.models.CreateChatCompletionRequestModel
import com.xebia.functional.xef.AI
import com.xebia.functional.xef.evaluator.models.EvaluateResults
import com.xebia.functional.xef.evaluator.models.OutputDescription
import com.xebia.functional.xef.evaluator.models.OutputResult
import kotlin.jvm.JvmSynthetic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class SuiteBuilder(
  private val description: String,
  private val model: CreateChatCompletionRequestModel
) {

  private val outputsDescription: MutableList<String> = mutableListOf()

  private val items = mutableListOf<ItemSpec>()

  operator fun ItemSpec.unaryPlus() {
    items.add(this)
  }

  operator fun OutputDescription.unaryPlus() {
    outputsDescription.add(this.value)
  }

  fun build() = SuiteSpec(description, outputsDescription, items, model = model)
}

@Serializable
data class SuiteSpec(
  val description: String,
  @SerialName("outputs_description") val outputsDescription: List<String>,
  val items: List<ItemSpec>,
  val model: CreateChatCompletionRequestModel
) {

  fun toJSON(): String = Json.encodeToString(this)

  suspend inline fun <reified E> evaluate(): List<EvaluateResults<E>> where
  E : AI.PromptClassifier,
  E : Enum<E> {
    return items.map { item ->
      val res =
        item.outputs.mapIndexed { index, output ->
          val description = outputsDescription[index] // TODO Validate if index is valid
          val classification = AI.classify<E>(item.input, item.context, output, model = model)
          OutputResult(item.input, description, output, classification)
        }
      EvaluateResults(description, res)
    }
  }

  companion object {
    @JvmSynthetic
    suspend operator fun invoke(
      description: String,
      model: CreateChatCompletionRequestModel,
      block: suspend SuiteBuilder.() -> Unit
    ): SuiteSpec = SuiteBuilder(description, model).apply { block() }.build()
  }
}

@Serializable
data class ItemSpec(
  val input: String,
  val context: String,
  @SerialName("actual_outputs") val outputs: List<String>
) {
  companion object {
    @JvmSynthetic
    suspend operator fun invoke(
      input: String,
      block: suspend TestItemBuilder.() -> Unit
    ): ItemSpec = TestItemBuilder(input).apply { block() }.build()
  }
}
