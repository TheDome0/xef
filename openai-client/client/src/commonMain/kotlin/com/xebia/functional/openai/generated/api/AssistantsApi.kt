/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package com.xebia.functional.openai.generated.api

import com.xebia.functional.openai.generated.api.AssistantsApi.*
import com.xebia.functional.openai.generated.model.AssistantFileObject
import com.xebia.functional.openai.generated.model.AssistantObject
import com.xebia.functional.openai.generated.model.CreateAssistantFileRequest
import com.xebia.functional.openai.generated.model.CreateAssistantRequest
import com.xebia.functional.openai.generated.model.CreateMessageRequest
import com.xebia.functional.openai.generated.model.CreateRunRequest
import com.xebia.functional.openai.generated.model.CreateThreadAndRunRequest
import com.xebia.functional.openai.generated.model.CreateThreadRequest
import com.xebia.functional.openai.generated.model.DeleteAssistantFileResponse
import com.xebia.functional.openai.generated.model.DeleteAssistantResponse
import com.xebia.functional.openai.generated.model.DeleteThreadResponse
import com.xebia.functional.openai.generated.model.ListAssistantFilesResponse
import com.xebia.functional.openai.generated.model.ListAssistantsResponse
import com.xebia.functional.openai.generated.model.ListMessageFilesResponse
import com.xebia.functional.openai.generated.model.ListMessagesResponse
import com.xebia.functional.openai.generated.model.ListRunStepsResponse
import com.xebia.functional.openai.generated.model.ListRunsResponse
import com.xebia.functional.openai.generated.model.MessageFileObject
import com.xebia.functional.openai.generated.model.MessageObject
import com.xebia.functional.openai.generated.model.ModifyAssistantRequest
import com.xebia.functional.openai.generated.model.ModifyMessageRequest
import com.xebia.functional.openai.generated.model.ModifyRunRequest
import com.xebia.functional.openai.generated.model.ModifyThreadRequest
import com.xebia.functional.openai.generated.model.RunObject
import com.xebia.functional.openai.generated.model.RunStepObject
import com.xebia.functional.openai.generated.model.SubmitToolOutputsRunRequest
import com.xebia.functional.openai.generated.model.ThreadObject
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.parameter
import io.ktor.client.request.request
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.http.contentType
import io.ktor.http.path
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.Json

/**  */
interface AssistantsApi {

  /**
   * Cancels a run that is &#x60;in_progress&#x60;.
   *
   * @param threadId The ID of the thread to which this run belongs.
   * @param runId The ID of the run to cancel.
   * @return RunObject
   */
  suspend fun cancelRun(threadId: kotlin.String, runId: kotlin.String): RunObject

  /**
   * Create an assistant with a model and instructions.
   *
   * @param createAssistantRequest
   * @return AssistantObject
   */
  suspend fun createAssistant(createAssistantRequest: CreateAssistantRequest): AssistantObject

  /**
   * Create an assistant file by attaching a [File](/docs/api-reference/files) to an
   * [assistant](/docs/api-reference/assistants).
   *
   * @param assistantId The ID of the assistant for which to create a File.
   * @param createAssistantFileRequest
   * @return AssistantFileObject
   */
  suspend fun createAssistantFile(
    assistantId: kotlin.String,
    createAssistantFileRequest: CreateAssistantFileRequest
  ): AssistantFileObject

  /**
   * Create a message.
   *
   * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
   * @param createMessageRequest
   * @return MessageObject
   */
  suspend fun createMessage(
    threadId: kotlin.String,
    createMessageRequest: CreateMessageRequest
  ): MessageObject

  /**
   * Create a run.
   *
   * @param threadId The ID of the thread to run.
   * @param createRunRequest
   * @return RunObject
   */
  suspend fun createRun(threadId: kotlin.String, createRunRequest: CreateRunRequest): RunObject

  /**
   * Create a thread.
   *
   * @param createThreadRequest (optional)
   * @return ThreadObject
   */
  suspend fun createThread(createThreadRequest: CreateThreadRequest? = null): ThreadObject

  /**
   * Create a thread and run it in one request.
   *
   * @param createThreadAndRunRequest
   * @return RunObject
   */
  suspend fun createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest): RunObject

  /**
   * Delete an assistant.
   *
   * @param assistantId The ID of the assistant to delete.
   * @return DeleteAssistantResponse
   */
  suspend fun deleteAssistant(assistantId: kotlin.String): DeleteAssistantResponse

  /**
   * Delete an assistant file.
   *
   * @param assistantId The ID of the assistant that the file belongs to.
   * @param fileId The ID of the file to delete.
   * @return DeleteAssistantFileResponse
   */
  suspend fun deleteAssistantFile(
    assistantId: kotlin.String,
    fileId: kotlin.String
  ): DeleteAssistantFileResponse

  /**
   * Delete a thread.
   *
   * @param threadId The ID of the thread to delete.
   * @return DeleteThreadResponse
   */
  suspend fun deleteThread(threadId: kotlin.String): DeleteThreadResponse

  /**
   * Retrieves an assistant.
   *
   * @param assistantId The ID of the assistant to retrieve.
   * @return AssistantObject
   */
  suspend fun getAssistant(assistantId: kotlin.String): AssistantObject

  /**
   * Retrieves an AssistantFile.
   *
   * @param assistantId The ID of the assistant who the file belongs to.
   * @param fileId The ID of the file we&#39;re getting.
   * @return AssistantFileObject
   */
  suspend fun getAssistantFile(
    assistantId: kotlin.String,
    fileId: kotlin.String
  ): AssistantFileObject

  /**
   * Retrieve a message.
   *
   * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message
   *   belongs.
   * @param messageId The ID of the message to retrieve.
   * @return MessageObject
   */
  suspend fun getMessage(threadId: kotlin.String, messageId: kotlin.String): MessageObject

  /**
   * Retrieves a message file.
   *
   * @param threadId The ID of the thread to which the message and File belong.
   * @param messageId The ID of the message the file belongs to.
   * @param fileId The ID of the file being retrieved.
   * @return MessageFileObject
   */
  suspend fun getMessageFile(
    threadId: kotlin.String,
    messageId: kotlin.String,
    fileId: kotlin.String
  ): MessageFileObject

  /**
   * Retrieves a run.
   *
   * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
   * @param runId The ID of the run to retrieve.
   * @return RunObject
   */
  suspend fun getRun(threadId: kotlin.String, runId: kotlin.String): RunObject

  /**
   * Retrieves a run step.
   *
   * @param threadId The ID of the thread to which the run and run step belongs.
   * @param runId The ID of the run to which the run step belongs.
   * @param stepId The ID of the run step to retrieve.
   * @return RunStepObject
   */
  suspend fun getRunStep(
    threadId: kotlin.String,
    runId: kotlin.String,
    stepId: kotlin.String
  ): RunStepObject

  /**
   * Retrieves a thread.
   *
   * @param threadId The ID of the thread to retrieve.
   * @return ThreadObject
   */
  suspend fun getThread(threadId: kotlin.String): ThreadObject

  /** enum for parameter order */
  @Serializable
  enum class OrderListAssistantFiles(val value: kotlin.String) {

    @SerialName(value = "asc") asc("asc"),
    @SerialName(value = "desc") desc("desc")
  }

  /**
   * Returns a list of assistant files.
   *
   * @param assistantId The ID of the assistant the file belongs to.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and
   *   100, and the default is 20. (optional, default to 20)
   * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60;
   *   for ascending order and &#x60;desc&#x60; for descending order. (optional, default to desc)
   * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch
   *   the next page of the list. (optional)
   * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch
   *   the previous page of the list. (optional)
   * @return ListAssistantFilesResponse
   */
  suspend fun listAssistantFiles(
    assistantId: kotlin.String,
    limit: kotlin.Int? = 20,
    order: OrderListAssistantFiles? = OrderListAssistantFiles.desc,
    after: kotlin.String? = null,
    before: kotlin.String? = null
  ): ListAssistantFilesResponse

  /** enum for parameter order */
  @Serializable
  enum class OrderListAssistants(val value: kotlin.String) {

    @SerialName(value = "asc") asc("asc"),
    @SerialName(value = "desc") desc("desc")
  }

  /**
   * Returns a list of assistants.
   *
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and
   *   100, and the default is 20. (optional, default to 20)
   * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60;
   *   for ascending order and &#x60;desc&#x60; for descending order. (optional, default to desc)
   * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch
   *   the next page of the list. (optional)
   * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch
   *   the previous page of the list. (optional)
   * @return ListAssistantsResponse
   */
  suspend fun listAssistants(
    limit: kotlin.Int? = 20,
    order: OrderListAssistants? = OrderListAssistants.desc,
    after: kotlin.String? = null,
    before: kotlin.String? = null
  ): ListAssistantsResponse

  /** enum for parameter order */
  @Serializable
  enum class OrderListMessageFiles(val value: kotlin.String) {

    @SerialName(value = "asc") asc("asc"),
    @SerialName(value = "desc") desc("desc")
  }

  /**
   * Returns a list of message files.
   *
   * @param threadId The ID of the thread that the message and files belong to.
   * @param messageId The ID of the message that the files belongs to.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and
   *   100, and the default is 20. (optional, default to 20)
   * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60;
   *   for ascending order and &#x60;desc&#x60; for descending order. (optional, default to desc)
   * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch
   *   the next page of the list. (optional)
   * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch
   *   the previous page of the list. (optional)
   * @return ListMessageFilesResponse
   */
  suspend fun listMessageFiles(
    threadId: kotlin.String,
    messageId: kotlin.String,
    limit: kotlin.Int? = 20,
    order: OrderListMessageFiles? = OrderListMessageFiles.desc,
    after: kotlin.String? = null,
    before: kotlin.String? = null
  ): ListMessageFilesResponse

  /** enum for parameter order */
  @Serializable
  enum class OrderListMessages(val value: kotlin.String) {

    @SerialName(value = "asc") asc("asc"),
    @SerialName(value = "desc") desc("desc")
  }

  /**
   * Returns a list of messages for a given thread.
   *
   * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and
   *   100, and the default is 20. (optional, default to 20)
   * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60;
   *   for ascending order and &#x60;desc&#x60; for descending order. (optional, default to desc)
   * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch
   *   the next page of the list. (optional)
   * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch
   *   the previous page of the list. (optional)
   * @return ListMessagesResponse
   */
  suspend fun listMessages(
    threadId: kotlin.String,
    limit: kotlin.Int? = 20,
    order: OrderListMessages? = OrderListMessages.desc,
    after: kotlin.String? = null,
    before: kotlin.String? = null
  ): ListMessagesResponse

  /** enum for parameter order */
  @Serializable
  enum class OrderListRunSteps(val value: kotlin.String) {

    @SerialName(value = "asc") asc("asc"),
    @SerialName(value = "desc") desc("desc")
  }

  /**
   * Returns a list of run steps belonging to a run.
   *
   * @param threadId The ID of the thread the run and run steps belong to.
   * @param runId The ID of the run the run steps belong to.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and
   *   100, and the default is 20. (optional, default to 20)
   * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60;
   *   for ascending order and &#x60;desc&#x60; for descending order. (optional, default to desc)
   * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch
   *   the next page of the list. (optional)
   * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch
   *   the previous page of the list. (optional)
   * @return ListRunStepsResponse
   */
  suspend fun listRunSteps(
    threadId: kotlin.String,
    runId: kotlin.String,
    limit: kotlin.Int? = 20,
    order: OrderListRunSteps? = OrderListRunSteps.desc,
    after: kotlin.String? = null,
    before: kotlin.String? = null
  ): ListRunStepsResponse

  /** enum for parameter order */
  @Serializable
  enum class OrderListRuns(val value: kotlin.String) {

    @SerialName(value = "asc") asc("asc"),
    @SerialName(value = "desc") desc("desc")
  }

  /**
   * Returns a list of runs belonging to a thread.
   *
   * @param threadId The ID of the thread the run belongs to.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and
   *   100, and the default is 20. (optional, default to 20)
   * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60;
   *   for ascending order and &#x60;desc&#x60; for descending order. (optional, default to desc)
   * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch
   *   the next page of the list. (optional)
   * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines
   *   your place in the list. For instance, if you make a list request and receive 100 objects,
   *   ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch
   *   the previous page of the list. (optional)
   * @return ListRunsResponse
   */
  suspend fun listRuns(
    threadId: kotlin.String,
    limit: kotlin.Int? = 20,
    order: OrderListRuns? = OrderListRuns.desc,
    after: kotlin.String? = null,
    before: kotlin.String? = null
  ): ListRunsResponse

  /**
   * Modifies an assistant.
   *
   * @param assistantId The ID of the assistant to modify.
   * @param modifyAssistantRequest
   * @return AssistantObject
   */
  suspend fun modifyAssistant(
    assistantId: kotlin.String,
    modifyAssistantRequest: ModifyAssistantRequest
  ): AssistantObject

  /**
   * Modifies a message.
   *
   * @param threadId The ID of the thread to which this message belongs.
   * @param messageId The ID of the message to modify.
   * @param modifyMessageRequest
   * @return MessageObject
   */
  suspend fun modifyMessage(
    threadId: kotlin.String,
    messageId: kotlin.String,
    modifyMessageRequest: ModifyMessageRequest
  ): MessageObject

  /**
   * Modifies a run.
   *
   * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
   * @param runId The ID of the run to modify.
   * @param modifyRunRequest
   * @return RunObject
   */
  suspend fun modifyRun(
    threadId: kotlin.String,
    runId: kotlin.String,
    modifyRunRequest: ModifyRunRequest
  ): RunObject

  /**
   * Modifies a thread.
   *
   * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
   * @param modifyThreadRequest
   * @return ThreadObject
   */
  suspend fun modifyThread(
    threadId: kotlin.String,
    modifyThreadRequest: ModifyThreadRequest
  ): ThreadObject

  /**
   * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and
   * &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used
   * to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be
   * submitted in a single request.
   *
   * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
   * @param runId The ID of the run that requires the tool output submission.
   * @param submitToolOutputsRunRequest
   * @return RunObject
   */
  suspend fun submitToolOuputsToRun(
    threadId: kotlin.String,
    runId: kotlin.String,
    submitToolOutputsRunRequest: SubmitToolOutputsRunRequest
  ): RunObject
}

fun AssistantsApi(client: HttpClient): AssistantsApi =
  object : AssistantsApi {
    override suspend fun cancelRun(
      threadId: kotlin.String,
      runId: kotlin.String,
    ): RunObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/runs/{run_id}/cancel"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "run_id" + "}", "$runId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun createAssistant(
      createAssistantRequest: CreateAssistantRequest,
    ): AssistantObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url { path("/assistants") }
          setBody(createAssistantRequest)
        }
        .body()

    override suspend fun createAssistantFile(
      assistantId: kotlin.String,
      createAssistantFileRequest: CreateAssistantFileRequest,
    ): AssistantFileObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url {
            path(
              "/assistants/{assistant_id}/files".replace("{" + "assistant_id" + "}", "$assistantId")
            )
          }
          setBody(createAssistantFileRequest)
        }
        .body()

    override suspend fun createMessage(
      threadId: kotlin.String,
      createMessageRequest: CreateMessageRequest,
    ): MessageObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url {
            path("/threads/{thread_id}/messages".replace("{" + "thread_id" + "}", "$threadId"))
          }
          setBody(createMessageRequest)
        }
        .body()

    override suspend fun createRun(
      threadId: kotlin.String,
      createRunRequest: CreateRunRequest,
    ): RunObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url { path("/threads/{thread_id}/runs".replace("{" + "thread_id" + "}", "$threadId")) }
          setBody(createRunRequest)
        }
        .body()

    override suspend fun createThread(
      createThreadRequest: CreateThreadRequest?,
    ): ThreadObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url { path("/threads") }
          setBody(createThreadRequest)
        }
        .body()

    override suspend fun createThreadAndRun(
      createThreadAndRunRequest: CreateThreadAndRunRequest,
    ): RunObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url { path("/threads/runs") }
          setBody(createThreadAndRunRequest)
        }
        .body()

    override suspend fun deleteAssistant(
      assistantId: kotlin.String,
    ): DeleteAssistantResponse =
      client
        .request {
          method = HttpMethod.Delete
          contentType(ContentType.Application.Json)
          url {
            path("/assistants/{assistant_id}".replace("{" + "assistant_id" + "}", "$assistantId"))
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun deleteAssistantFile(
      assistantId: kotlin.String,
      fileId: kotlin.String,
    ): DeleteAssistantFileResponse =
      client
        .request {
          method = HttpMethod.Delete
          contentType(ContentType.Application.Json)
          url {
            path(
              "/assistants/{assistant_id}/files/{file_id}"
                .replace("{" + "assistant_id" + "}", "$assistantId")
                .replace("{" + "file_id" + "}", "$fileId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun deleteThread(
      threadId: kotlin.String,
    ): DeleteThreadResponse =
      client
        .request {
          method = HttpMethod.Delete
          contentType(ContentType.Application.Json)
          url { path("/threads/{thread_id}".replace("{" + "thread_id" + "}", "$threadId")) }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun getAssistant(
      assistantId: kotlin.String,
    ): AssistantObject =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          url {
            path("/assistants/{assistant_id}".replace("{" + "assistant_id" + "}", "$assistantId"))
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun getAssistantFile(
      assistantId: kotlin.String,
      fileId: kotlin.String,
    ): AssistantFileObject =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          url {
            path(
              "/assistants/{assistant_id}/files/{file_id}"
                .replace("{" + "assistant_id" + "}", "$assistantId")
                .replace("{" + "file_id" + "}", "$fileId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun getMessage(
      threadId: kotlin.String,
      messageId: kotlin.String,
    ): MessageObject =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/messages/{message_id}"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "message_id" + "}", "$messageId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun getMessageFile(
      threadId: kotlin.String,
      messageId: kotlin.String,
      fileId: kotlin.String,
    ): MessageFileObject =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/messages/{message_id}/files/{file_id}"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "message_id" + "}", "$messageId")
                .replace("{" + "file_id" + "}", "$fileId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun getRun(
      threadId: kotlin.String,
      runId: kotlin.String,
    ): RunObject =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/runs/{run_id}"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "run_id" + "}", "$runId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun getRunStep(
      threadId: kotlin.String,
      runId: kotlin.String,
      stepId: kotlin.String,
    ): RunStepObject =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/runs/{run_id}/steps/{step_id}"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "run_id" + "}", "$runId")
                .replace("{" + "step_id" + "}", "$stepId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun getThread(
      threadId: kotlin.String,
    ): ThreadObject =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          url { path("/threads/{thread_id}".replace("{" + "thread_id" + "}", "$threadId")) }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun listAssistantFiles(
      assistantId: kotlin.String,
      limit: kotlin.Int?,
      order: OrderListAssistantFiles?,
      after: kotlin.String?,
      before: kotlin.String?,
    ): ListAssistantFilesResponse =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          parameter("limit", listOf("$limit"))
          parameter("order", listOf("$order"))
          parameter("after", listOf("$after"))
          parameter("before", listOf("$before"))
          url {
            path(
              "/assistants/{assistant_id}/files".replace("{" + "assistant_id" + "}", "$assistantId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun listAssistants(
      limit: kotlin.Int?,
      order: OrderListAssistants?,
      after: kotlin.String?,
      before: kotlin.String?,
    ): ListAssistantsResponse =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          parameter("limit", listOf("$limit"))
          parameter("order", listOf("$order"))
          parameter("after", listOf("$after"))
          parameter("before", listOf("$before"))
          url { path("/assistants") }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun listMessageFiles(
      threadId: kotlin.String,
      messageId: kotlin.String,
      limit: kotlin.Int?,
      order: OrderListMessageFiles?,
      after: kotlin.String?,
      before: kotlin.String?,
    ): ListMessageFilesResponse =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          parameter("limit", listOf("$limit"))
          parameter("order", listOf("$order"))
          parameter("after", listOf("$after"))
          parameter("before", listOf("$before"))
          url {
            path(
              "/threads/{thread_id}/messages/{message_id}/files"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "message_id" + "}", "$messageId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun listMessages(
      threadId: kotlin.String,
      limit: kotlin.Int?,
      order: OrderListMessages?,
      after: kotlin.String?,
      before: kotlin.String?,
    ): ListMessagesResponse =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          parameter("limit", listOf("$limit"))
          parameter("order", listOf("$order"))
          parameter("after", listOf("$after"))
          parameter("before", listOf("$before"))
          url {
            path("/threads/{thread_id}/messages".replace("{" + "thread_id" + "}", "$threadId"))
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun listRunSteps(
      threadId: kotlin.String,
      runId: kotlin.String,
      limit: kotlin.Int?,
      order: OrderListRunSteps?,
      after: kotlin.String?,
      before: kotlin.String?,
    ): ListRunStepsResponse =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          parameter("limit", listOf("$limit"))
          parameter("order", listOf("$order"))
          parameter("after", listOf("$after"))
          parameter("before", listOf("$before"))
          url {
            path(
              "/threads/{thread_id}/runs/{run_id}/steps"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "run_id" + "}", "$runId")
            )
          }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun listRuns(
      threadId: kotlin.String,
      limit: kotlin.Int?,
      order: OrderListRuns?,
      after: kotlin.String?,
      before: kotlin.String?,
    ): ListRunsResponse =
      client
        .request {
          method = HttpMethod.Get
          contentType(ContentType.Application.Json)
          parameter("limit", listOf("$limit"))
          parameter("order", listOf("$order"))
          parameter("after", listOf("$after"))
          parameter("before", listOf("$before"))
          url { path("/threads/{thread_id}/runs".replace("{" + "thread_id" + "}", "$threadId")) }
          setBody(io.ktor.client.utils.EmptyContent)
        }
        .body()

    override suspend fun modifyAssistant(
      assistantId: kotlin.String,
      modifyAssistantRequest: ModifyAssistantRequest,
    ): AssistantObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url {
            path("/assistants/{assistant_id}".replace("{" + "assistant_id" + "}", "$assistantId"))
          }
          setBody(modifyAssistantRequest)
        }
        .body()

    override suspend fun modifyMessage(
      threadId: kotlin.String,
      messageId: kotlin.String,
      modifyMessageRequest: ModifyMessageRequest,
    ): MessageObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/messages/{message_id}"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "message_id" + "}", "$messageId")
            )
          }
          setBody(modifyMessageRequest)
        }
        .body()

    override suspend fun modifyRun(
      threadId: kotlin.String,
      runId: kotlin.String,
      modifyRunRequest: ModifyRunRequest,
    ): RunObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/runs/{run_id}"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "run_id" + "}", "$runId")
            )
          }
          setBody(modifyRunRequest)
        }
        .body()

    override suspend fun modifyThread(
      threadId: kotlin.String,
      modifyThreadRequest: ModifyThreadRequest,
    ): ThreadObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url { path("/threads/{thread_id}".replace("{" + "thread_id" + "}", "$threadId")) }
          setBody(modifyThreadRequest)
        }
        .body()

    override suspend fun submitToolOuputsToRun(
      threadId: kotlin.String,
      runId: kotlin.String,
      submitToolOutputsRunRequest: SubmitToolOutputsRunRequest,
    ): RunObject =
      client
        .request {
          method = HttpMethod.Post
          contentType(ContentType.Application.Json)
          url {
            path(
              "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"
                .replace("{" + "thread_id" + "}", "$threadId")
                .replace("{" + "run_id" + "}", "$runId")
            )
          }
          setBody(submitToolOutputsRunRequest)
        }
        .body()
  }
