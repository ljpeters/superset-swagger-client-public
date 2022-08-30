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
 * TableMetadataOptionsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class TableMetadataOptionsResponse {
  @SerializedName("deferrable")
  private Boolean deferrable = null;

  @SerializedName("initially")
  private Boolean initially = null;

  @SerializedName("match")
  private Boolean match = null;

  @SerializedName("ondelete")
  private Boolean ondelete = null;

  @SerializedName("onupdate")
  private Boolean onupdate = null;

  public TableMetadataOptionsResponse deferrable(Boolean deferrable) {
    this.deferrable = deferrable;
    return this;
  }

   /**
   * Get deferrable
   * @return deferrable
  **/
  @Schema(description = "")
  public Boolean isDeferrable() {
    return deferrable;
  }

  public void setDeferrable(Boolean deferrable) {
    this.deferrable = deferrable;
  }

  public TableMetadataOptionsResponse initially(Boolean initially) {
    this.initially = initially;
    return this;
  }

   /**
   * Get initially
   * @return initially
  **/
  @Schema(description = "")
  public Boolean isInitially() {
    return initially;
  }

  public void setInitially(Boolean initially) {
    this.initially = initially;
  }

  public TableMetadataOptionsResponse match(Boolean match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @Schema(description = "")
  public Boolean isMatch() {
    return match;
  }

  public void setMatch(Boolean match) {
    this.match = match;
  }

  public TableMetadataOptionsResponse ondelete(Boolean ondelete) {
    this.ondelete = ondelete;
    return this;
  }

   /**
   * Get ondelete
   * @return ondelete
  **/
  @Schema(description = "")
  public Boolean isOndelete() {
    return ondelete;
  }

  public void setOndelete(Boolean ondelete) {
    this.ondelete = ondelete;
  }

  public TableMetadataOptionsResponse onupdate(Boolean onupdate) {
    this.onupdate = onupdate;
    return this;
  }

   /**
   * Get onupdate
   * @return onupdate
  **/
  @Schema(description = "")
  public Boolean isOnupdate() {
    return onupdate;
  }

  public void setOnupdate(Boolean onupdate) {
    this.onupdate = onupdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableMetadataOptionsResponse tableMetadataOptionsResponse = (TableMetadataOptionsResponse) o;
    return Objects.equals(this.deferrable, tableMetadataOptionsResponse.deferrable) &&
        Objects.equals(this.initially, tableMetadataOptionsResponse.initially) &&
        Objects.equals(this.match, tableMetadataOptionsResponse.match) &&
        Objects.equals(this.ondelete, tableMetadataOptionsResponse.ondelete) &&
        Objects.equals(this.onupdate, tableMetadataOptionsResponse.onupdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deferrable, initially, match, ondelete, onupdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableMetadataOptionsResponse {\n");
    
    sb.append("    deferrable: ").append(toIndentedString(deferrable)).append("\n");
    sb.append("    initially: ").append(toIndentedString(initially)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    ondelete: ").append(toIndentedString(ondelete)).append("\n");
    sb.append("    onupdate: ").append(toIndentedString(onupdate)).append("\n");
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