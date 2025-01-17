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
 * ChartDataSelectOptionsSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataSelectOptionsSchema {
  @SerializedName("columns")
  private List<String> columns = null;

  @SerializedName("exclude")
  private List<String> exclude = null;

  @SerializedName("rename")
  private List<Object> rename = null;

  public ChartDataSelectOptionsSchema columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public ChartDataSelectOptionsSchema addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns which to select from the input data, in the desired order. If columns are renamed, the original column name should be referenced here.
   * @return columns
  **/
  @Schema(example = "[\"country\",\"gender\",\"age\"]", description = "Columns which to select from the input data, in the desired order. If columns are renamed, the original column name should be referenced here.")
  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public ChartDataSelectOptionsSchema exclude(List<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  public ChartDataSelectOptionsSchema addExcludeItem(String excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<String>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Columns to exclude from selection.
   * @return exclude
  **/
  @Schema(example = "[\"my_temp_column\"]", description = "Columns to exclude from selection.")
  public List<String> getExclude() {
    return exclude;
  }

  public void setExclude(List<String> exclude) {
    this.exclude = exclude;
  }

  public ChartDataSelectOptionsSchema rename(List<Object> rename) {
    this.rename = rename;
    return this;
  }

  public ChartDataSelectOptionsSchema addRenameItem(Object renameItem) {
    if (this.rename == null) {
      this.rename = new ArrayList<Object>();
    }
    this.rename.add(renameItem);
    return this;
  }

   /**
   * columns which to rename, mapping source column to target column. For instance, &#x60;{&#x27;y&#x27;: &#x27;y2&#x27;}&#x60; will rename the column &#x60;y&#x60; to &#x60;y2&#x60;.
   * @return rename
  **/
  @Schema(example = "[{\"age\":\"average_age\"}]", description = "columns which to rename, mapping source column to target column. For instance, `{'y': 'y2'}` will rename the column `y` to `y2`.")
  public List<Object> getRename() {
    return rename;
  }

  public void setRename(List<Object> rename) {
    this.rename = rename;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataSelectOptionsSchema chartDataSelectOptionsSchema = (ChartDataSelectOptionsSchema) o;
    return Objects.equals(this.columns, chartDataSelectOptionsSchema.columns) &&
        Objects.equals(this.exclude, chartDataSelectOptionsSchema.exclude) &&
        Objects.equals(this.rename, chartDataSelectOptionsSchema.rename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, exclude, rename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataSelectOptionsSchema {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    rename: ").append(toIndentedString(rename)).append("\n");
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
