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
 * InlineResponse20012ForeignKeys
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class InlineResponse20012ForeignKeys {
  @SerializedName("column_names")
  private List<String> columnNames = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("options")
  private Object options = null;

  @SerializedName("referred_columns")
  private List<String> referredColumns = null;

  @SerializedName("referred_schema")
  private String referredSchema = null;

  @SerializedName("referred_table")
  private String referredTable = null;

  @SerializedName("type")
  private String type = null;

  public InlineResponse20012ForeignKeys columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public InlineResponse20012ForeignKeys addColumnNamesItem(String columnNamesItem) {
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

  public InlineResponse20012ForeignKeys name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20012ForeignKeys options(Object options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }

  public InlineResponse20012ForeignKeys referredColumns(List<String> referredColumns) {
    this.referredColumns = referredColumns;
    return this;
  }

  public InlineResponse20012ForeignKeys addReferredColumnsItem(String referredColumnsItem) {
    if (this.referredColumns == null) {
      this.referredColumns = new ArrayList<String>();
    }
    this.referredColumns.add(referredColumnsItem);
    return this;
  }

   /**
   * Get referredColumns
   * @return referredColumns
  **/
  @Schema(description = "")
  public List<String> getReferredColumns() {
    return referredColumns;
  }

  public void setReferredColumns(List<String> referredColumns) {
    this.referredColumns = referredColumns;
  }

  public InlineResponse20012ForeignKeys referredSchema(String referredSchema) {
    this.referredSchema = referredSchema;
    return this;
  }

   /**
   * Get referredSchema
   * @return referredSchema
  **/
  @Schema(description = "")
  public String getReferredSchema() {
    return referredSchema;
  }

  public void setReferredSchema(String referredSchema) {
    this.referredSchema = referredSchema;
  }

  public InlineResponse20012ForeignKeys referredTable(String referredTable) {
    this.referredTable = referredTable;
    return this;
  }

   /**
   * Get referredTable
   * @return referredTable
  **/
  @Schema(description = "")
  public String getReferredTable() {
    return referredTable;
  }

  public void setReferredTable(String referredTable) {
    this.referredTable = referredTable;
  }

  public InlineResponse20012ForeignKeys type(String type) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012ForeignKeys inlineResponse20012ForeignKeys = (InlineResponse20012ForeignKeys) o;
    return Objects.equals(this.columnNames, inlineResponse20012ForeignKeys.columnNames) &&
        Objects.equals(this.name, inlineResponse20012ForeignKeys.name) &&
        Objects.equals(this.options, inlineResponse20012ForeignKeys.options) &&
        Objects.equals(this.referredColumns, inlineResponse20012ForeignKeys.referredColumns) &&
        Objects.equals(this.referredSchema, inlineResponse20012ForeignKeys.referredSchema) &&
        Objects.equals(this.referredTable, inlineResponse20012ForeignKeys.referredTable) &&
        Objects.equals(this.type, inlineResponse20012ForeignKeys.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnNames, name, options, referredColumns, referredSchema, referredTable, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012ForeignKeys {\n");
    
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    referredColumns: ").append(toIndentedString(referredColumns)).append("\n");
    sb.append("    referredSchema: ").append(toIndentedString(referredSchema)).append("\n");
    sb.append("    referredTable: ").append(toIndentedString(referredTable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}