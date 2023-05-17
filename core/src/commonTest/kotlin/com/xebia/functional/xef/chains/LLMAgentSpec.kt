package com.xebia.functional.xef.chains

import arrow.core.raise.either
import com.xebia.functional.xef.AIError
import com.xebia.functional.xef.agents.LLMAgent
import com.xebia.functional.xef.llm.openai.LLMModel
import com.xebia.functional.xef.prompt.PromptTemplate
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.StringSpec

class LLMAgentSpec :
  StringSpec({
    val model = LLMModel.GPT_3_5_TURBO

    "LLMAgent should return a prediction with a simple template" {
      val template = "Tell me {foo}."
      either {
        val promptTemplate = PromptTemplate(template, listOf("foo"))
        val chain = LLMAgent(testLLM, promptTemplate, model)
        with(chain) { call(mapOf("foo" to "a joke")) }
      } shouldBeRight listOf("I'm not good at jokes")
    }

    "LLMAgent should return a prediction with a more complex template" {
      val template = "My name is {name} and I'm {age} years old"
      either {
        val prompt = PromptTemplate(template, listOf("name", "age"))
        val chain = LLMAgent(testLLM, prompt, model)
        with(chain) { call(mapOf("age" to "28", "name" to "foo")) }
      } shouldBeRight listOf("Hello there! Nice to meet you foo")
    }

    "LLMAgent should fail when inputs are not the expected ones from the PromptTemplate" {
      val template = "My name is {name} and I'm {age} years old"
      either {
        val prompt = PromptTemplate(template, listOf("name", "age"))
        val chain = LLMAgent(testLLM, prompt, model)
        with(chain) { call(mapOf("age" to "28", "brand" to "foo")) }
      } shouldBeLeft
        AIError.InvalidInputs(
          "The provided inputs: {age}, {brand} do not match with chain's inputs: {name}, {age}"
        )
    }
  })
