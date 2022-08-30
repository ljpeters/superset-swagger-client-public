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
import at.mic.superset.swagger.client.model.ReportScheduleRestApiGetDashboard;
import at.mic.superset.swagger.client.model.ReportScheduleRestApiGetDatabase;
import at.mic.superset.swagger.client.model.ReportScheduleRestApiGetReportRecipients;
import at.mic.superset.swagger.client.model.ReportScheduleRestApiGetSlice;
import at.mic.superset.swagger.client.model.ReportScheduleRestApiGetUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ReportScheduleRestApiGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ReportScheduleRestApiGet {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("chart")
  private ReportScheduleRestApiGetSlice chart = null;

  @SerializedName("context_markdown")
  private String contextMarkdown = null;

  @SerializedName("creation_method")
  private String creationMethod = null;

  @SerializedName("crontab")
  private String crontab = null;

  @SerializedName("dashboard")
  private ReportScheduleRestApiGetDashboard dashboard = null;

  @SerializedName("database")
  private ReportScheduleRestApiGetDatabase database = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("force_screenshot")
  private Boolean forceScreenshot = null;

  @SerializedName("grace_period")
  private Integer gracePeriod = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("last_eval_dttm")
  private OffsetDateTime lastEvalDttm = null;

  @SerializedName("last_state")
  private String lastState = null;

  @SerializedName("last_value")
  private Float lastValue = null;

  @SerializedName("last_value_row_json")
  private String lastValueRowJson = null;

  @SerializedName("log_retention")
  private Integer logRetention = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owners")
  private ReportScheduleRestApiGetUser owners = null;

  @SerializedName("recipients")
  private ReportScheduleRestApiGetReportRecipients recipients = null;

  @SerializedName("report_format")
  private String reportFormat = null;

  @SerializedName("sql")
  private String sql = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("validator_config_json")
  private String validatorConfigJson = null;

  @SerializedName("validator_type")
  private String validatorType = null;

  @SerializedName("working_timeout")
  private Integer workingTimeout = null;

  public ReportScheduleRestApiGet active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ReportScheduleRestApiGet chart(ReportScheduleRestApiGetSlice chart) {
    this.chart = chart;
    return this;
  }

   /**
   * Get chart
   * @return chart
  **/
  @Schema(description = "")
  public ReportScheduleRestApiGetSlice getChart() {
    return chart;
  }

  public void setChart(ReportScheduleRestApiGetSlice chart) {
    this.chart = chart;
  }

  public ReportScheduleRestApiGet contextMarkdown(String contextMarkdown) {
    this.contextMarkdown = contextMarkdown;
    return this;
  }

   /**
   * Get contextMarkdown
   * @return contextMarkdown
  **/
  @Schema(description = "")
  public String getContextMarkdown() {
    return contextMarkdown;
  }

  public void setContextMarkdown(String contextMarkdown) {
    this.contextMarkdown = contextMarkdown;
  }

  public ReportScheduleRestApiGet creationMethod(String creationMethod) {
    this.creationMethod = creationMethod;
    return this;
  }

   /**
   * Get creationMethod
   * @return creationMethod
  **/
  @Schema(description = "")
  public String getCreationMethod() {
    return creationMethod;
  }

  public void setCreationMethod(String creationMethod) {
    this.creationMethod = creationMethod;
  }

  public ReportScheduleRestApiGet crontab(String crontab) {
    this.crontab = crontab;
    return this;
  }

   /**
   * Get crontab
   * @return crontab
  **/
  @Schema(required = true, description = "")
  public String getCrontab() {
    return crontab;
  }

  public void setCrontab(String crontab) {
    this.crontab = crontab;
  }

  public ReportScheduleRestApiGet dashboard(ReportScheduleRestApiGetDashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

   /**
   * Get dashboard
   * @return dashboard
  **/
  @Schema(description = "")
  public ReportScheduleRestApiGetDashboard getDashboard() {
    return dashboard;
  }

  public void setDashboard(ReportScheduleRestApiGetDashboard dashboard) {
    this.dashboard = dashboard;
  }

  public ReportScheduleRestApiGet database(ReportScheduleRestApiGetDatabase database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @Schema(description = "")
  public ReportScheduleRestApiGetDatabase getDatabase() {
    return database;
  }

  public void setDatabase(ReportScheduleRestApiGetDatabase database) {
    this.database = database;
  }

  public ReportScheduleRestApiGet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReportScheduleRestApiGet forceScreenshot(Boolean forceScreenshot) {
    this.forceScreenshot = forceScreenshot;
    return this;
  }

   /**
   * Get forceScreenshot
   * @return forceScreenshot
  **/
  @Schema(description = "")
  public Boolean isForceScreenshot() {
    return forceScreenshot;
  }

  public void setForceScreenshot(Boolean forceScreenshot) {
    this.forceScreenshot = forceScreenshot;
  }

  public ReportScheduleRestApiGet gracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

   /**
   * Get gracePeriod
   * @return gracePeriod
  **/
  @Schema(description = "")
  public Integer getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public ReportScheduleRestApiGet id(Integer id) {
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

  public ReportScheduleRestApiGet lastEvalDttm(OffsetDateTime lastEvalDttm) {
    this.lastEvalDttm = lastEvalDttm;
    return this;
  }

   /**
   * Get lastEvalDttm
   * @return lastEvalDttm
  **/
  @Schema(description = "")
  public OffsetDateTime getLastEvalDttm() {
    return lastEvalDttm;
  }

  public void setLastEvalDttm(OffsetDateTime lastEvalDttm) {
    this.lastEvalDttm = lastEvalDttm;
  }

  public ReportScheduleRestApiGet lastState(String lastState) {
    this.lastState = lastState;
    return this;
  }

   /**
   * Get lastState
   * @return lastState
  **/
  @Schema(description = "")
  public String getLastState() {
    return lastState;
  }

  public void setLastState(String lastState) {
    this.lastState = lastState;
  }

  public ReportScheduleRestApiGet lastValue(Float lastValue) {
    this.lastValue = lastValue;
    return this;
  }

   /**
   * Get lastValue
   * @return lastValue
  **/
  @Schema(description = "")
  public Float getLastValue() {
    return lastValue;
  }

  public void setLastValue(Float lastValue) {
    this.lastValue = lastValue;
  }

  public ReportScheduleRestApiGet lastValueRowJson(String lastValueRowJson) {
    this.lastValueRowJson = lastValueRowJson;
    return this;
  }

   /**
   * Get lastValueRowJson
   * @return lastValueRowJson
  **/
  @Schema(description = "")
  public String getLastValueRowJson() {
    return lastValueRowJson;
  }

  public void setLastValueRowJson(String lastValueRowJson) {
    this.lastValueRowJson = lastValueRowJson;
  }

  public ReportScheduleRestApiGet logRetention(Integer logRetention) {
    this.logRetention = logRetention;
    return this;
  }

   /**
   * Get logRetention
   * @return logRetention
  **/
  @Schema(description = "")
  public Integer getLogRetention() {
    return logRetention;
  }

  public void setLogRetention(Integer logRetention) {
    this.logRetention = logRetention;
  }

  public ReportScheduleRestApiGet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportScheduleRestApiGet owners(ReportScheduleRestApiGetUser owners) {
    this.owners = owners;
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @Schema(description = "")
  public ReportScheduleRestApiGetUser getOwners() {
    return owners;
  }

  public void setOwners(ReportScheduleRestApiGetUser owners) {
    this.owners = owners;
  }

  public ReportScheduleRestApiGet recipients(ReportScheduleRestApiGetReportRecipients recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @Schema(required = true, description = "")
  public ReportScheduleRestApiGetReportRecipients getRecipients() {
    return recipients;
  }

  public void setRecipients(ReportScheduleRestApiGetReportRecipients recipients) {
    this.recipients = recipients;
  }

  public ReportScheduleRestApiGet reportFormat(String reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

   /**
   * Get reportFormat
   * @return reportFormat
  **/
  @Schema(description = "")
  public String getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(String reportFormat) {
    this.reportFormat = reportFormat;
  }

  public ReportScheduleRestApiGet sql(String sql) {
    this.sql = sql;
    return this;
  }

   /**
   * Get sql
   * @return sql
  **/
  @Schema(description = "")
  public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }

  public ReportScheduleRestApiGet timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @Schema(description = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ReportScheduleRestApiGet type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportScheduleRestApiGet validatorConfigJson(String validatorConfigJson) {
    this.validatorConfigJson = validatorConfigJson;
    return this;
  }

   /**
   * Get validatorConfigJson
   * @return validatorConfigJson
  **/
  @Schema(description = "")
  public String getValidatorConfigJson() {
    return validatorConfigJson;
  }

  public void setValidatorConfigJson(String validatorConfigJson) {
    this.validatorConfigJson = validatorConfigJson;
  }

  public ReportScheduleRestApiGet validatorType(String validatorType) {
    this.validatorType = validatorType;
    return this;
  }

   /**
   * Get validatorType
   * @return validatorType
  **/
  @Schema(description = "")
  public String getValidatorType() {
    return validatorType;
  }

  public void setValidatorType(String validatorType) {
    this.validatorType = validatorType;
  }

  public ReportScheduleRestApiGet workingTimeout(Integer workingTimeout) {
    this.workingTimeout = workingTimeout;
    return this;
  }

   /**
   * Get workingTimeout
   * @return workingTimeout
  **/
  @Schema(description = "")
  public Integer getWorkingTimeout() {
    return workingTimeout;
  }

  public void setWorkingTimeout(Integer workingTimeout) {
    this.workingTimeout = workingTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportScheduleRestApiGet reportScheduleRestApiGet = (ReportScheduleRestApiGet) o;
    return Objects.equals(this.active, reportScheduleRestApiGet.active) &&
        Objects.equals(this.chart, reportScheduleRestApiGet.chart) &&
        Objects.equals(this.contextMarkdown, reportScheduleRestApiGet.contextMarkdown) &&
        Objects.equals(this.creationMethod, reportScheduleRestApiGet.creationMethod) &&
        Objects.equals(this.crontab, reportScheduleRestApiGet.crontab) &&
        Objects.equals(this.dashboard, reportScheduleRestApiGet.dashboard) &&
        Objects.equals(this.database, reportScheduleRestApiGet.database) &&
        Objects.equals(this.description, reportScheduleRestApiGet.description) &&
        Objects.equals(this.forceScreenshot, reportScheduleRestApiGet.forceScreenshot) &&
        Objects.equals(this.gracePeriod, reportScheduleRestApiGet.gracePeriod) &&
        Objects.equals(this.id, reportScheduleRestApiGet.id) &&
        Objects.equals(this.lastEvalDttm, reportScheduleRestApiGet.lastEvalDttm) &&
        Objects.equals(this.lastState, reportScheduleRestApiGet.lastState) &&
        Objects.equals(this.lastValue, reportScheduleRestApiGet.lastValue) &&
        Objects.equals(this.lastValueRowJson, reportScheduleRestApiGet.lastValueRowJson) &&
        Objects.equals(this.logRetention, reportScheduleRestApiGet.logRetention) &&
        Objects.equals(this.name, reportScheduleRestApiGet.name) &&
        Objects.equals(this.owners, reportScheduleRestApiGet.owners) &&
        Objects.equals(this.recipients, reportScheduleRestApiGet.recipients) &&
        Objects.equals(this.reportFormat, reportScheduleRestApiGet.reportFormat) &&
        Objects.equals(this.sql, reportScheduleRestApiGet.sql) &&
        Objects.equals(this.timezone, reportScheduleRestApiGet.timezone) &&
        Objects.equals(this.type, reportScheduleRestApiGet.type) &&
        Objects.equals(this.validatorConfigJson, reportScheduleRestApiGet.validatorConfigJson) &&
        Objects.equals(this.validatorType, reportScheduleRestApiGet.validatorType) &&
        Objects.equals(this.workingTimeout, reportScheduleRestApiGet.workingTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, chart, contextMarkdown, creationMethod, crontab, dashboard, database, description, forceScreenshot, gracePeriod, id, lastEvalDttm, lastState, lastValue, lastValueRowJson, logRetention, name, owners, recipients, reportFormat, sql, timezone, type, validatorConfigJson, validatorType, workingTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportScheduleRestApiGet {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    contextMarkdown: ").append(toIndentedString(contextMarkdown)).append("\n");
    sb.append("    creationMethod: ").append(toIndentedString(creationMethod)).append("\n");
    sb.append("    crontab: ").append(toIndentedString(crontab)).append("\n");
    sb.append("    dashboard: ").append(toIndentedString(dashboard)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forceScreenshot: ").append(toIndentedString(forceScreenshot)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastEvalDttm: ").append(toIndentedString(lastEvalDttm)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    lastValue: ").append(toIndentedString(lastValue)).append("\n");
    sb.append("    lastValueRowJson: ").append(toIndentedString(lastValueRowJson)).append("\n");
    sb.append("    logRetention: ").append(toIndentedString(logRetention)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validatorConfigJson: ").append(toIndentedString(validatorConfigJson)).append("\n");
    sb.append("    validatorType: ").append(toIndentedString(validatorType)).append("\n");
    sb.append("    workingTimeout: ").append(toIndentedString(workingTimeout)).append("\n");
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