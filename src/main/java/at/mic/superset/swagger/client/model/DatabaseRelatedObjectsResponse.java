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
import at.mic.superset.swagger.client.model.DatabaseRelatedCharts;
import at.mic.superset.swagger.client.model.DatabaseRelatedDashboards;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DatabaseRelatedObjectsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class DatabaseRelatedObjectsResponse {
  @SerializedName("charts")
  private DatabaseRelatedCharts charts = null;

  @SerializedName("dashboards")
  private DatabaseRelatedDashboards dashboards = null;

  public DatabaseRelatedObjectsResponse charts(DatabaseRelatedCharts charts) {
    this.charts = charts;
    return this;
  }

   /**
   * Get charts
   * @return charts
  **/
  @Schema(description = "")
  public DatabaseRelatedCharts getCharts() {
    return charts;
  }

  public void setCharts(DatabaseRelatedCharts charts) {
    this.charts = charts;
  }

  public DatabaseRelatedObjectsResponse dashboards(DatabaseRelatedDashboards dashboards) {
    this.dashboards = dashboards;
    return this;
  }

   /**
   * Get dashboards
   * @return dashboards
  **/
  @Schema(description = "")
  public DatabaseRelatedDashboards getDashboards() {
    return dashboards;
  }

  public void setDashboards(DatabaseRelatedDashboards dashboards) {
    this.dashboards = dashboards;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseRelatedObjectsResponse databaseRelatedObjectsResponse = (DatabaseRelatedObjectsResponse) o;
    return Objects.equals(this.charts, databaseRelatedObjectsResponse.charts) &&
        Objects.equals(this.dashboards, databaseRelatedObjectsResponse.dashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charts, dashboards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseRelatedObjectsResponse {\n");
    
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
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