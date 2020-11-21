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
 * DatasetRestApiPost
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-06T17:36:10.263+01:00[Europe/Vienna]")
public class DatasetRestApiPost {
  @SerializedName("database")
  private Integer database = null;

  @SerializedName("owners")
  private List<Integer> owners = null;

  @SerializedName("schema")
  private String schema = null;

  @SerializedName("table_name")
  private String tableName = null;

  public DatasetRestApiPost database(Integer database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @Schema(required = true, description = "")
  public Integer getDatabase() {
    return database;
  }

  public void setDatabase(Integer database) {
    this.database = database;
  }

  public DatasetRestApiPost owners(List<Integer> owners) {
    this.owners = owners;
    return this;
  }

  public DatasetRestApiPost addOwnersItem(Integer ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<Integer>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @Schema(description = "")
  public List<Integer> getOwners() {
    return owners;
  }

  public void setOwners(List<Integer> owners) {
    this.owners = owners;
  }

  public DatasetRestApiPost schema(String schema) {
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

  public DatasetRestApiPost tableName(String tableName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetRestApiPost datasetRestApiPost = (DatasetRestApiPost) o;
    return Objects.equals(this.database, datasetRestApiPost.database) &&
        Objects.equals(this.owners, datasetRestApiPost.owners) &&
        Objects.equals(this.schema, datasetRestApiPost.schema) &&
        Objects.equals(this.tableName, datasetRestApiPost.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, owners, schema, tableName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetRestApiPost {\n");
    
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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