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
 * GetListSchemaFilters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class GetListSchemaFilters {
  @SerializedName("col")
  private String col = null;

  @SerializedName("opr")
  private String opr = null;

  @SerializedName("value")
  private AnyOfgetListSchemaFiltersValue value = null;

  public GetListSchemaFilters col(String col) {
    this.col = col;
    return this;
  }

   /**
   * Get col
   * @return col
  **/
  @Schema(required = true, description = "")
  public String getCol() {
    return col;
  }

  public void setCol(String col) {
    this.col = col;
  }

  public GetListSchemaFilters opr(String opr) {
    this.opr = opr;
    return this;
  }

   /**
   * Get opr
   * @return opr
  **/
  @Schema(required = true, description = "")
  public String getOpr() {
    return opr;
  }

  public void setOpr(String opr) {
    this.opr = opr;
  }

  public GetListSchemaFilters value(AnyOfgetListSchemaFiltersValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public AnyOfgetListSchemaFiltersValue getValue() {
    return value;
  }

  public void setValue(AnyOfgetListSchemaFiltersValue value) {
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
    GetListSchemaFilters getListSchemaFilters = (GetListSchemaFilters) o;
    return Objects.equals(this.col, getListSchemaFilters.col) &&
        Objects.equals(this.opr, getListSchemaFilters.opr) &&
        Objects.equals(this.value, getListSchemaFilters.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(col, opr, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListSchemaFilters {\n");
    
    sb.append("    col: ").append(toIndentedString(col)).append("\n");
    sb.append("    opr: ").append(toIndentedString(opr)).append("\n");
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
