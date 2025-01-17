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
import at.mic.superset.swagger.client.model.SavedQueryRestApiGetListDatabase;
import at.mic.superset.swagger.client.model.SavedQueryRestApiGetListUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * SavedQueryRestApiGetList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class SavedQueryRestApiGetList {
  @SerializedName("changed_on_delta_humanized")
  private Object changedOnDeltaHumanized = null;

  @SerializedName("created_by")
  private SavedQueryRestApiGetListUser createdBy = null;

  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  @SerializedName("database")
  private SavedQueryRestApiGetListDatabase database = null;

  @SerializedName("db_id")
  private Integer dbId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("extra")
  private Object extra = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("last_run_delta_humanized")
  private Object lastRunDeltaHumanized = null;

  @SerializedName("rows")
  private Integer rows = null;

  @SerializedName("schema")
  private String schema = null;

  @SerializedName("sql")
  private String sql = null;

  @SerializedName("sql_tables")
  private Object sqlTables = null;

   /**
   * Get changedOnDeltaHumanized
   * @return changedOnDeltaHumanized
  **/
  @Schema(description = "")
  public Object getChangedOnDeltaHumanized() {
    return changedOnDeltaHumanized;
  }

  public SavedQueryRestApiGetList createdBy(SavedQueryRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public SavedQueryRestApiGetListUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(SavedQueryRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
  }

  public SavedQueryRestApiGetList createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public SavedQueryRestApiGetList database(SavedQueryRestApiGetListDatabase database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @Schema(description = "")
  public SavedQueryRestApiGetListDatabase getDatabase() {
    return database;
  }

  public void setDatabase(SavedQueryRestApiGetListDatabase database) {
    this.database = database;
  }

  public SavedQueryRestApiGetList dbId(Integer dbId) {
    this.dbId = dbId;
    return this;
  }

   /**
   * Get dbId
   * @return dbId
  **/
  @Schema(description = "")
  public Integer getDbId() {
    return dbId;
  }

  public void setDbId(Integer dbId) {
    this.dbId = dbId;
  }

  public SavedQueryRestApiGetList description(String description) {
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

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public Object getExtra() {
    return extra;
  }

  public SavedQueryRestApiGetList id(Integer id) {
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

  public SavedQueryRestApiGetList label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

   /**
   * Get lastRunDeltaHumanized
   * @return lastRunDeltaHumanized
  **/
  @Schema(description = "")
  public Object getLastRunDeltaHumanized() {
    return lastRunDeltaHumanized;
  }

  public SavedQueryRestApiGetList rows(Integer rows) {
    this.rows = rows;
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @Schema(description = "")
  public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  public SavedQueryRestApiGetList schema(String schema) {
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

  public SavedQueryRestApiGetList sql(String sql) {
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

   /**
   * Get sqlTables
   * @return sqlTables
  **/
  @Schema(description = "")
  public Object getSqlTables() {
    return sqlTables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedQueryRestApiGetList savedQueryRestApiGetList = (SavedQueryRestApiGetList) o;
    return Objects.equals(this.changedOnDeltaHumanized, savedQueryRestApiGetList.changedOnDeltaHumanized) &&
        Objects.equals(this.createdBy, savedQueryRestApiGetList.createdBy) &&
        Objects.equals(this.createdOn, savedQueryRestApiGetList.createdOn) &&
        Objects.equals(this.database, savedQueryRestApiGetList.database) &&
        Objects.equals(this.dbId, savedQueryRestApiGetList.dbId) &&
        Objects.equals(this.description, savedQueryRestApiGetList.description) &&
        Objects.equals(this.extra, savedQueryRestApiGetList.extra) &&
        Objects.equals(this.id, savedQueryRestApiGetList.id) &&
        Objects.equals(this.label, savedQueryRestApiGetList.label) &&
        Objects.equals(this.lastRunDeltaHumanized, savedQueryRestApiGetList.lastRunDeltaHumanized) &&
        Objects.equals(this.rows, savedQueryRestApiGetList.rows) &&
        Objects.equals(this.schema, savedQueryRestApiGetList.schema) &&
        Objects.equals(this.sql, savedQueryRestApiGetList.sql) &&
        Objects.equals(this.sqlTables, savedQueryRestApiGetList.sqlTables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedOnDeltaHumanized, createdBy, createdOn, database, dbId, description, extra, id, label, lastRunDeltaHumanized, rows, schema, sql, sqlTables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedQueryRestApiGetList {\n");
    
    sb.append("    changedOnDeltaHumanized: ").append(toIndentedString(changedOnDeltaHumanized)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastRunDeltaHumanized: ").append(toIndentedString(lastRunDeltaHumanized)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    sqlTables: ").append(toIndentedString(sqlTables)).append("\n");
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
