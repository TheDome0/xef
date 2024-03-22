/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package com.xebia.functional.openai.generated.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param role The role of the entity that is creating the message. Currently only `user` is
 *   supported.
 * @param content The content of the message.
 * @param fileIds A list of [File](/docs/api-reference/files) IDs that the message should use. There
 *   can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and
 *   `code_interpreter` that can access and use files.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful
 *   for storing additional information about the object in a structured format. Keys can be a
 *   maximum of 64 characters long and values can be a maxium of 512 characters long.
 */
@Serializable
data class CreateMessageRequest(

  /* The role of the entity that is creating the message. Currently only `user` is supported. */
  @SerialName(value = "role") val role: CreateMessageRequest.Role,

  /* The content of the message. */
  @SerialName(value = "content") val content: kotlin.String,

  /* A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files. */
  @SerialName(value = "file_ids")
  val fileIds: kotlin.collections.List<kotlin.String>? = arrayListOf(),

  /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  @SerialName(value = "metadata") val metadata: kotlinx.serialization.json.JsonObject? = null
) {

  /**
   * The role of the entity that is creating the message. Currently only `user` is supported.
   *
   * Values: user
   */
  @Serializable
  enum class Role(val value: kotlin.String) {
    @SerialName(value = "user") user("user")
  }
}
