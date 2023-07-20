package com.xebia.functional.xef.llm.models.chat

import com.xebia.functional.xef.auto.PromptConfiguration

data class ChatCompletionRequest(
    val model: String,
    val messages: List<Message>,
    // The idea will be to remove all the parameters that could be inside the prompt configuration. Parameters like:
    // - temperature
    // - topP
    // - n
    // ...
    val temperature: Double = 0.0,
    val topP: Double = 1.0,
    val n: Int = 1,
    val stream: Boolean = false,
    val stop: List<String>? = null,
    val maxTokens: Int? = null,
    val presencePenalty: Double = 0.0,
    val frequencyPenalty: Double = 0.0,
    val logitBias: Map<String, Int> = emptyMap(),
    val user: String?,
    val streamToStandardOut: Boolean = false,
    val promptConfiguration: PromptConfiguration = PromptConfiguration.DEFAULTS,
)
