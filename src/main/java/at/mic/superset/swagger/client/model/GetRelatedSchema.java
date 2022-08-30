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
 * GetRelatedSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class GetRelatedSchema {
  @SerializedName("filter")
  private String filter = null;

  @SerializedName("include_ids")
  private List<Integer> includeIds = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  public GetRelatedSchema filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public GetRelatedSchema includeIds(List<Integer> includeIds) {
    this.includeIds = includeIds;
    return this;
  }

  public GetRelatedSchema addIncludeIdsItem(Integer includeIdsItem) {
    if (this.includeIds == null) {
      this.includeIds = new ArrayList<Integer>();
    }
    this.includeIds.add(includeIdsItem);
    return this;
  }

   /**
   * Get includeIds
   * @return includeIds
  **/
  @Schema(description = "")
  public List<Integer> getIncludeIds() {
    return includeIds;
  }

  public void setIncludeIds(List<Integer> includeIds) {
    this.includeIds = includeIds;
  }

  public GetRelatedSchema page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public GetRelatedSchema pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRelatedSchema getRelatedSchema = (GetRelatedSchema) o;
    return Objects.equals(this.filter, getRelatedSchema.filter) &&
        Objects.equals(this.includeIds, getRelatedSchema.includeIds) &&
        Objects.equals(this.page, getRelatedSchema.page) &&
        Objects.equals(this.pageSize, getRelatedSchema.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, includeIds, page, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRelatedSchema {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeIds: ").append(toIndentedString(includeIds)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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