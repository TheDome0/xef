/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package com.xebia.functional.openai.models

import kotlinx.serialization.*

/**
 * One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd`
 *
 * Values: tts_1,tts_1_hd
 */
@Serializable
enum class CreateSpeechRequestModel(val value: kotlin.String) {

  @SerialName(value = "tts-1") tts_1("tts-1"),
  @SerialName(value = "tts-1-hd") tts_1_hd("tts-1-hd");

  /**
   * Override [toString()] to avoid using the enum variable name as the value, and instead use the
   * actual value defined in the API spec file.
   *
   * This solves a problem when the variable name and its value are different, and ensures that the
   * client sends the correct enum values to the server always.
   */
  override fun toString(): kotlin.String = value

  companion object {
    /** Converts the provided [data] to a [String] on success, null otherwise. */
    fun encode(data: kotlin.Any?): kotlin.String? =
      if (data is CreateSpeechRequestModel) "$data" else null

    /** Returns a valid [CreateSpeechRequestModel] for [data], null otherwise. */
    fun decode(data: kotlin.Any?): CreateSpeechRequestModel? =
      data?.let {
        val normalizedData = "$it".lowercase()
        values().firstOrNull { value -> it == value || normalizedData == "$value".lowercase() }
      }
  }
}
