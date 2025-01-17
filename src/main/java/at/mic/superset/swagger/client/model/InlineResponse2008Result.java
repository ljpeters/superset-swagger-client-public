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
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse2008Result
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class InlineResponse2008Result {
  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("errors")
  private List<Object> errors = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("job_id")
  private String jobId = null;

  @SerializedName("result_url")
  private String resultUrl = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public InlineResponse2008Result channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @Schema(description = "")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public InlineResponse2008Result errors(List<Object> errors) {
    this.errors = errors;
    return this;
  }

  public InlineResponse2008Result addErrorsItem(Object errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Object>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<Object> getErrors() {
    return errors;
  }

  public void setErrors(List<Object> errors) {
    this.errors = errors;
  }

  public InlineResponse2008Result id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2008Result jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @Schema(description = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public InlineResponse2008Result resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

   /**
   * Get resultUrl
   * @return resultUrl
  **/
  @Schema(description = "")
  public String getResultUrl() {
    return resultUrl;
  }

  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }

  public InlineResponse2008Result status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse2008Result userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
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
    InlineResponse2008Result inlineResponse2008Result = (InlineResponse2008Result) o;
    return Objects.equals(this.channelId, inlineResponse2008Result.channelId) &&
        Objects.equals(this.errors, inlineResponse2008Result.errors) &&
        Objects.equals(this.id, inlineResponse2008Result.id) &&
        Objects.equals(this.jobId, inlineResponse2008Result.jobId) &&
        Objects.equals(this.resultUrl, inlineResponse2008Result.resultUrl) &&
        Objects.equals(this.status, inlineResponse2008Result.status) &&
        Objects.equals(this.userId, inlineResponse2008Result.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, errors, id, jobId, resultUrl, status, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Result {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
