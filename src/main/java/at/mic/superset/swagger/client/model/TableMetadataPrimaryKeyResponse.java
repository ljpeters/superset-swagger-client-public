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
 * TableMetadataPrimaryKeyResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class TableMetadataPrimaryKeyResponse {
  @SerializedName("column_names")
  private List<String> columnNames = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public TableMetadataPrimaryKeyResponse columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public TableMetadataPrimaryKeyResponse addColumnNamesItem(String columnNamesItem) {
    if (this.columnNames == null) {
      this.columnNames = new ArrayList<String>();
    }
    this.columnNames.add(columnNamesItem);
    return this;
  }

   /**
   * Get columnNames
   * @return columnNames
  **/
  @Schema(description = "")
  public List<String> getColumnNames() {
    return columnNames;
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  public TableMetadataPrimaryKeyResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The primary key index name
   * @return name
  **/
  @Schema(description = "The primary key index name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TableMetadataPrimaryKeyResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableMetadataPrimaryKeyResponse tableMetadataPrimaryKeyResponse = (TableMetadataPrimaryKeyResponse) o;
    return Objects.equals(this.columnNames, tableMetadataPrimaryKeyResponse.columnNames) &&
        Objects.equals(this.name, tableMetadataPrimaryKeyResponse.name) &&
        Objects.equals(this.type, tableMetadataPrimaryKeyResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNames, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableMetadataPrimaryKeyResponse {\n");
    
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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