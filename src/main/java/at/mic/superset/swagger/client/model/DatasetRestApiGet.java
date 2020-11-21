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
import at.mic.superset.swagger.client.model.Meta10;
import at.mic.superset.swagger.client.model.Meta11;
import at.mic.superset.swagger.client.model.Meta12;
import at.mic.superset.swagger.client.model.Meta13;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DatasetRestApiGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class DatasetRestApiGet {
  @SerializedName("cache_timeout")
  private Integer cacheTimeout = null;

  @SerializedName("columns")
  private Meta12 columns = null;

  @SerializedName("database")
  private Meta13 database = null;

  @SerializedName("default_endpoint")
  private String defaultEndpoint = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("fetch_values_predicate")
  private String fetchValuesPredicate = null;

  @SerializedName("filter_select_enabled")
  private Boolean filterSelectEnabled = null;

  @SerializedName("is_sqllab_view")
  private Boolean isSqllabView = null;

  @SerializedName("main_dttm_col")
  private String mainDttmCol = null;

  @SerializedName("metrics")
  private Meta11 metrics = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("owners")
  private Meta10 owners = null;

  @SerializedName("schema")
  private String schema = null;

  @SerializedName("sql")
  private String sql = null;

  @SerializedName("table_name")
  private String tableName = null;

  @SerializedName("template_params")
  private String templateParams = null;

  public DatasetRestApiGet cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Get cacheTimeout
   * @return cacheTimeout
  **/
  @Schema(description = "")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public DatasetRestApiGet columns(Meta12 columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @Schema(required = true, description = "")
  public Meta12 getColumns() {
    return columns;
  }

  public void setColumns(Meta12 columns) {
    this.columns = columns;
  }

  public DatasetRestApiGet database(Meta13 database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @Schema(required = true, description = "")
  public Meta13 getDatabase() {
    return database;
  }

  public void setDatabase(Meta13 database) {
    this.database = database;
  }

  public DatasetRestApiGet defaultEndpoint(String defaultEndpoint) {
    this.defaultEndpoint = defaultEndpoint;
    return this;
  }

   /**
   * Get defaultEndpoint
   * @return defaultEndpoint
  **/
  @Schema(description = "")
  public String getDefaultEndpoint() {
    return defaultEndpoint;
  }

  public void setDefaultEndpoint(String defaultEndpoint) {
    this.defaultEndpoint = defaultEndpoint;
  }

  public DatasetRestApiGet description(String description) {
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

  public DatasetRestApiGet fetchValuesPredicate(String fetchValuesPredicate) {
    this.fetchValuesPredicate = fetchValuesPredicate;
    return this;
  }

   /**
   * Get fetchValuesPredicate
   * @return fetchValuesPredicate
  **/
  @Schema(description = "")
  public String getFetchValuesPredicate() {
    return fetchValuesPredicate;
  }

  public void setFetchValuesPredicate(String fetchValuesPredicate) {
    this.fetchValuesPredicate = fetchValuesPredicate;
  }

  public DatasetRestApiGet filterSelectEnabled(Boolean filterSelectEnabled) {
    this.filterSelectEnabled = filterSelectEnabled;
    return this;
  }

   /**
   * Get filterSelectEnabled
   * @return filterSelectEnabled
  **/
  @Schema(description = "")
  public Boolean isFilterSelectEnabled() {
    return filterSelectEnabled;
  }

  public void setFilterSelectEnabled(Boolean filterSelectEnabled) {
    this.filterSelectEnabled = filterSelectEnabled;
  }

  public DatasetRestApiGet isSqllabView(Boolean isSqllabView) {
    this.isSqllabView = isSqllabView;
    return this;
  }

   /**
   * Get isSqllabView
   * @return isSqllabView
  **/
  @Schema(description = "")
  public Boolean isIsSqllabView() {
    return isSqllabView;
  }

  public void setIsSqllabView(Boolean isSqllabView) {
    this.isSqllabView = isSqllabView;
  }

  public DatasetRestApiGet mainDttmCol(String mainDttmCol) {
    this.mainDttmCol = mainDttmCol;
    return this;
  }

   /**
   * Get mainDttmCol
   * @return mainDttmCol
  **/
  @Schema(description = "")
  public String getMainDttmCol() {
    return mainDttmCol;
  }

  public void setMainDttmCol(String mainDttmCol) {
    this.mainDttmCol = mainDttmCol;
  }

  public DatasetRestApiGet metrics(Meta11 metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(required = true, description = "")
  public Meta11 getMetrics() {
    return metrics;
  }

  public void setMetrics(Meta11 metrics) {
    this.metrics = metrics;
  }

  public DatasetRestApiGet offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public DatasetRestApiGet owners(Meta10 owners) {
    this.owners = owners;
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @Schema(description = "")
  public Meta10 getOwners() {
    return owners;
  }

  public void setOwners(Meta10 owners) {
    this.owners = owners;
  }

  public DatasetRestApiGet schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @Schema(description = "")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public DatasetRestApiGet sql(String sql) {
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

  public DatasetRestApiGet tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @Schema(required = true, description = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public DatasetRestApiGet templateParams(String templateParams) {
    this.templateParams = templateParams;
    return this;
  }

   /**
   * Get templateParams
   * @return templateParams
  **/
  @Schema(description = "")
  public String getTemplateParams() {
    return templateParams;
  }

  public void setTemplateParams(String templateParams) {
    this.templateParams = templateParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetRestApiGet datasetRestApiGet = (DatasetRestApiGet) o;
    return Objects.equals(this.cacheTimeout, datasetRestApiGet.cacheTimeout) &&
        Objects.equals(this.columns, datasetRestApiGet.columns) &&
        Objects.equals(this.database, datasetRestApiGet.database) &&
        Objects.equals(this.defaultEndpoint, datasetRestApiGet.defaultEndpoint) &&
        Objects.equals(this.description, datasetRestApiGet.description) &&
        Objects.equals(this.fetchValuesPredicate, datasetRestApiGet.fetchValuesPredicate) &&
        Objects.equals(this.filterSelectEnabled, datasetRestApiGet.filterSelectEnabled) &&
        Objects.equals(this.isSqllabView, datasetRestApiGet.isSqllabView) &&
        Objects.equals(this.mainDttmCol, datasetRestApiGet.mainDttmCol) &&
        Objects.equals(this.metrics, datasetRestApiGet.metrics) &&
        Objects.equals(this.offset, datasetRestApiGet.offset) &&
        Objects.equals(this.owners, datasetRestApiGet.owners) &&
        Objects.equals(this.schema, datasetRestApiGet.schema) &&
        Objects.equals(this.sql, datasetRestApiGet.sql) &&
        Objects.equals(this.tableName, datasetRestApiGet.tableName) &&
        Objects.equals(this.templateParams, datasetRestApiGet.templateParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheTimeout, columns, database, defaultEndpoint, description, fetchValuesPredicate, filterSelectEnabled, isSqllabView, mainDttmCol, metrics, offset, owners, schema, sql, tableName, templateParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetRestApiGet {\n");
    
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    defaultEndpoint: ").append(toIndentedString(defaultEndpoint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fetchValuesPredicate: ").append(toIndentedString(fetchValuesPredicate)).append("\n");
    sb.append("    filterSelectEnabled: ").append(toIndentedString(filterSelectEnabled)).append("\n");
    sb.append("    isSqllabView: ").append(toIndentedString(isSqllabView)).append("\n");
    sb.append("    mainDttmCol: ").append(toIndentedString(mainDttmCol)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
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