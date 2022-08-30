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
 * Database
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class Database {
  @SerializedName("allow_multi_schema_metadata_fetch")
  private Boolean allowMultiSchemaMetadataFetch = null;

  @SerializedName("allows_cost_estimate")
  private Boolean allowsCostEstimate = null;

  @SerializedName("allows_subquery")
  private Boolean allowsSubquery = null;

  @SerializedName("allows_virtual_table_explore")
  private Boolean allowsVirtualTableExplore = null;

  @SerializedName("backend")
  private String backend = null;

  @SerializedName("disable_data_preview")
  private Boolean disableDataPreview = null;

  @SerializedName("explore_database_id")
  private Integer exploreDatabaseId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public Database allowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
    return this;
  }

   /**
   * Get allowMultiSchemaMetadataFetch
   * @return allowMultiSchemaMetadataFetch
  **/
  @Schema(description = "")
  public Boolean isAllowMultiSchemaMetadataFetch() {
    return allowMultiSchemaMetadataFetch;
  }

  public void setAllowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
  }

  public Database allowsCostEstimate(Boolean allowsCostEstimate) {
    this.allowsCostEstimate = allowsCostEstimate;
    return this;
  }

   /**
   * Get allowsCostEstimate
   * @return allowsCostEstimate
  **/
  @Schema(description = "")
  public Boolean isAllowsCostEstimate() {
    return allowsCostEstimate;
  }

  public void setAllowsCostEstimate(Boolean allowsCostEstimate) {
    this.allowsCostEstimate = allowsCostEstimate;
  }

  public Database allowsSubquery(Boolean allowsSubquery) {
    this.allowsSubquery = allowsSubquery;
    return this;
  }

   /**
   * Get allowsSubquery
   * @return allowsSubquery
  **/
  @Schema(description = "")
  public Boolean isAllowsSubquery() {
    return allowsSubquery;
  }

  public void setAllowsSubquery(Boolean allowsSubquery) {
    this.allowsSubquery = allowsSubquery;
  }

  public Database allowsVirtualTableExplore(Boolean allowsVirtualTableExplore) {
    this.allowsVirtualTableExplore = allowsVirtualTableExplore;
    return this;
  }

   /**
   * Get allowsVirtualTableExplore
   * @return allowsVirtualTableExplore
  **/
  @Schema(description = "")
  public Boolean isAllowsVirtualTableExplore() {
    return allowsVirtualTableExplore;
  }

  public void setAllowsVirtualTableExplore(Boolean allowsVirtualTableExplore) {
    this.allowsVirtualTableExplore = allowsVirtualTableExplore;
  }

  public Database backend(String backend) {
    this.backend = backend;
    return this;
  }

   /**
   * Get backend
   * @return backend
  **/
  @Schema(description = "")
  public String getBackend() {
    return backend;
  }

  public void setBackend(String backend) {
    this.backend = backend;
  }

  public Database disableDataPreview(Boolean disableDataPreview) {
    this.disableDataPreview = disableDataPreview;
    return this;
  }

   /**
   * Get disableDataPreview
   * @return disableDataPreview
  **/
  @Schema(description = "")
  public Boolean isDisableDataPreview() {
    return disableDataPreview;
  }

  public void setDisableDataPreview(Boolean disableDataPreview) {
    this.disableDataPreview = disableDataPreview;
  }

  public Database exploreDatabaseId(Integer exploreDatabaseId) {
    this.exploreDatabaseId = exploreDatabaseId;
    return this;
  }

   /**
   * Get exploreDatabaseId
   * @return exploreDatabaseId
  **/
  @Schema(description = "")
  public Integer getExploreDatabaseId() {
    return exploreDatabaseId;
  }

  public void setExploreDatabaseId(Integer exploreDatabaseId) {
    this.exploreDatabaseId = exploreDatabaseId;
  }

  public Database id(Integer id) {
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

  public Database name(String name) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Database database = (Database) o;
    return Objects.equals(this.allowMultiSchemaMetadataFetch, database.allowMultiSchemaMetadataFetch) &&
        Objects.equals(this.allowsCostEstimate, database.allowsCostEstimate) &&
        Objects.equals(this.allowsSubquery, database.allowsSubquery) &&
        Objects.equals(this.allowsVirtualTableExplore, database.allowsVirtualTableExplore) &&
        Objects.equals(this.backend, database.backend) &&
        Objects.equals(this.disableDataPreview, database.disableDataPreview) &&
        Objects.equals(this.exploreDatabaseId, database.exploreDatabaseId) &&
        Objects.equals(this.id, database.id) &&
        Objects.equals(this.name, database.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMultiSchemaMetadataFetch, allowsCostEstimate, allowsSubquery, allowsVirtualTableExplore, backend, disableDataPreview, exploreDatabaseId, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Database {\n");
    
    sb.append("    allowMultiSchemaMetadataFetch: ").append(toIndentedString(allowMultiSchemaMetadataFetch)).append("\n");
    sb.append("    allowsCostEstimate: ").append(toIndentedString(allowsCostEstimate)).append("\n");
    sb.append("    allowsSubquery: ").append(toIndentedString(allowsSubquery)).append("\n");
    sb.append("    allowsVirtualTableExplore: ").append(toIndentedString(allowsVirtualTableExplore)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    disableDataPreview: ").append(toIndentedString(disableDataPreview)).append("\n");
    sb.append("    exploreDatabaseId: ").append(toIndentedString(exploreDatabaseId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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