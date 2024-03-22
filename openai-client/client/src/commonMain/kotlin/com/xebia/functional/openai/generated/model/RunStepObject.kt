/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package com.xebia.functional.openai.generated.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a step in execution of a run.
 *
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param `object` The object type, which is always `thread.run.step`.
 * @param createdAt The Unix timestamp (in seconds) for when the run step was created.
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) associated with the
 *   run step.
 * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
 * @param runId The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
 * @param type The type of run step, which can be either `message_creation` or `tool_calls`.
 * @param status The status of the run step, which can be either `in_progress`, `cancelled`,
 *   `failed`, `completed`, or `expired`.
 * @param stepDetails
 * @param lastError
 * @param expiredAt The Unix timestamp (in seconds) for when the run step expired. A step is
 *   considered expired if the parent run is expired.
 * @param cancelledAt The Unix timestamp (in seconds) for when the run step was cancelled.
 * @param failedAt The Unix timestamp (in seconds) for when the run step failed.
 * @param completedAt The Unix timestamp (in seconds) for when the run step completed.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful
 *   for storing additional information about the object in a structured format. Keys can be a
 *   maximum of 64 characters long and values can be a maxium of 512 characters long.
 * @param usage
 */
@Serializable
data class RunStepObject(

  /* The identifier of the run step, which can be referenced in API endpoints. */
  @SerialName(value = "id") val id: kotlin.String,

  /* The object type, which is always `thread.run.step`. */
  @SerialName(value = "object") val `object`: RunStepObject.`Object`,

  /* The Unix timestamp (in seconds) for when the run step was created. */
  @SerialName(value = "created_at") val createdAt: kotlin.Int,

  /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
  @SerialName(value = "assistant_id") val assistantId: kotlin.String,

  /* The ID of the [thread](/docs/api-reference/threads) that was run. */
  @SerialName(value = "thread_id") val threadId: kotlin.String,

  /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
  @SerialName(value = "run_id") val runId: kotlin.String,

  /* The type of run step, which can be either `message_creation` or `tool_calls`. */
  @SerialName(value = "type") val type: RunStepObject.Type,

  /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
  @SerialName(value = "status") val status: RunStepObject.Status,
  @SerialName(value = "step_details") val stepDetails: RunStepObjectStepDetails,
  @SerialName(value = "last_error") val lastError: RunStepObjectLastError?,

  /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
  @SerialName(value = "expired_at") val expiredAt: kotlin.Int? = null,

  /* The Unix timestamp (in seconds) for when the run step was cancelled. */
  @SerialName(value = "cancelled_at") val cancelledAt: kotlin.Int?,

  /* The Unix timestamp (in seconds) for when the run step failed. */
  @SerialName(value = "failed_at") val failedAt: kotlin.Int?,

  /* The Unix timestamp (in seconds) for when the run step completed. */
  @SerialName(value = "completed_at") val completedAt: kotlin.Int?,

  /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  @SerialName(value = "metadata") val metadata: kotlinx.serialization.json.JsonObject? = null,
  @SerialName(value = "usage") val usage: RunStepCompletionUsage?
) {

  /**
   * The object type, which is always `thread.run.step`.
   *
   * Values: thread_run_step
   */
  @Serializable
  enum class `Object`(val value: kotlin.String) {
    @SerialName(value = "thread.run.step") thread_run_step("thread.run.step")
  }
  /**
   * The type of run step, which can be either `message_creation` or `tool_calls`.
   *
   * Values: message_creation,tool_calls
   */
  @Serializable
  enum class Type(val value: kotlin.String) {
    @SerialName(value = "message_creation") message_creation("message_creation"),
    @SerialName(value = "tool_calls") tool_calls("tool_calls")
  }
  /**
   * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`,
   * `completed`, or `expired`.
   *
   * Values: in_progress,cancelled,failed,completed,expired
   */
  @Serializable
  enum class Status(val value: kotlin.String) {
    @SerialName(value = "in_progress") in_progress("in_progress"),
    @SerialName(value = "cancelled") cancelled("cancelled"),
    @SerialName(value = "failed") failed("failed"),
    @SerialName(value = "completed") completed("completed"),
    @SerialName(value = "expired") expired("expired")
  }
}
