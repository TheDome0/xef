/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package com.xebia.functional.openai.models

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * The function definition.
 *
 * @param name The name of the function.
 * @param arguments The arguments that the model expects you to pass to the function.
 */
@Serializable
data class RunToolCallObjectFunction(

  /* The name of the function. */
  @SerialName(value = "name") @Required val name: kotlin.String,

  /* The arguments that the model expects you to pass to the function. */
  @SerialName(value = "arguments") @Required val arguments: kotlin.String
)
