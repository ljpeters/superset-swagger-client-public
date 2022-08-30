/*
 * Superset
 * Superset
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package at.mic.superset.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ChartDataAsyncResponseSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataAsyncResponseSchema {
  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("job_id")
  private String jobId = null;

  @SerializedName("result_url")
  private String resultUrl = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("user_id")
  private String userId = null;

  public ChartDataAsyncResponseSchema channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Unique session async channel ID
   * @return channelId
  **/
  @Schema(description = "Unique session async channel ID")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ChartDataAsyncResponseSchema jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Unique async job ID
   * @return jobId
  **/
  @Schema(description = "Unique async job ID")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public ChartDataAsyncResponseSchema resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

   /**
   * Unique result URL for fetching async query data
   * @return resultUrl
  **/
  @Schema(description = "Unique result URL for fetching async query data")
  public String getResultUrl() {
    return resultUrl;
  }

  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }

  public ChartDataAsyncResponseSchema status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status value for async job
   * @return status
  **/
  @Schema(description = "Status value for async job")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ChartDataAsyncResponseSchema userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Requesting user ID
   * @return userId
  **/
  @Schema(description = "Requesting user ID")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataAsyncResponseSchema chartDataAsyncResponseSchema = (ChartDataAsyncResponseSchema) o;
    return Objects.equals(this.channelId, chartDataAsyncResponseSchema.channelId) &&
        Objects.equals(this.jobId, chartDataAsyncResponseSchema.jobId) &&
        Objects.equals(this.resultUrl, chartDataAsyncResponseSchema.resultUrl) &&
        Objects.equals(this.status, chartDataAsyncResponseSchema.status) &&
        Objects.equals(this.userId, chartDataAsyncResponseSchema.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, jobId, resultUrl, status, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataAsyncResponseSchema {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}