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
 * @param id
 * @param deleted
 * @param `object`
 */
@Serializable
data class DeleteThreadResponse(
  @SerialName(value = "id") @Required val id: kotlin.String,
  @SerialName(value = "deleted") @Required val deleted: kotlin.Boolean,
  @SerialName(value = "object") @Required val `object`: DeleteThreadResponse.`Object`
) {

  /** Values: thread_deleted */
  @Serializable
  enum class `Object`(val value: kotlin.String) {
    @SerialName(value = "thread.deleted") thread_deleted("thread.deleted")
  }
}
