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
 * RelatedResultResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class RelatedResultResponse {
  @SerializedName("text")
  private String text = null;

  @SerializedName("value")
  private Integer value = null;

  public RelatedResultResponse text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The related item string representation
   * @return text
  **/
  @Schema(description = "The related item string representation")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RelatedResultResponse value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The related item identifier
   * @return value
  **/
  @Schema(description = "The related item identifier")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedResultResponse relatedResultResponse = (RelatedResultResponse) o;
    return Objects.equals(this.text, relatedResultResponse.text) &&
        Objects.equals(this.value, relatedResultResponse.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedResultResponse {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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