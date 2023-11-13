package com.xebia.functional.xef.llm

import com.xebia.functional.openai.models.ext.chat.ChatCompletionRequestMessage
import com.xebia.functional.tokenizer.Encoding
import com.xebia.functional.tokenizer.ModelType

sealed interface LLM : AutoCloseable {

  val modelType: ModelType

  @Deprecated("use modelType.name instead", replaceWith = ReplaceWith("modelType.name"))
  val name
    get() = modelType.name

  /**
   * Copies this instance and uses [modelType] for [LLM.modelType]. Has to return the most specific
   * type of this instance!
   */
  fun copy(modelType: ModelType): LLM

  fun tokensFromMessages(
    messages: List<ChatCompletionRequestMessage>
  ): Int { // TODO: naive implementation with magic numbers
    fun Encoding.countTokensFromMessages(tokensPerMessage: Int, tokensPerName: Int): Int =
      messages.sumOf { message ->
        countTokens(message.completionRole().name) +
          countTokens(message.contentAsString() ?: "") +
          tokensPerMessage +
          tokensPerName
      } + 3
    return modelType.encoding.countTokensFromMessages(
      tokensPerMessage = modelType.tokensPerMessage,
      tokensPerName = modelType.tokensPerName
    ) + modelType.tokenPadding
  }

  override fun close() = Unit
}
