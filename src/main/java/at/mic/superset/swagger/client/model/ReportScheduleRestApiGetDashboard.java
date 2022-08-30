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
 * ReportScheduleRestApiGetDashboard
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ReportScheduleRestApiGetDashboard {
  @SerializedName("dashboard_title")
  private String dashboardTitle = null;

  @SerializedName("id")
  private Integer id = null;

  public ReportScheduleRestApiGetDashboard dashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
    return this;
  }

   /**
   * Get dashboardTitle
   * @return dashboardTitle
  **/
  @Schema(description = "")
  public String getDashboardTitle() {
    return dashboardTitle;
  }

  public void setDashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
  }

  public ReportScheduleRestApiGetDashboard id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportScheduleRestApiGetDashboard reportScheduleRestApiGetDashboard = (ReportScheduleRestApiGetDashboard) o;
    return Objects.equals(this.dashboardTitle, reportScheduleRestApiGetDashboard.dashboardTitle) &&
        Objects.equals(this.id, reportScheduleRestApiGetDashboard.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardTitle, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportScheduleRestApiGetDashboard {\n");
    
    sb.append("    dashboardTitle: ").append(toIndentedString(dashboardTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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