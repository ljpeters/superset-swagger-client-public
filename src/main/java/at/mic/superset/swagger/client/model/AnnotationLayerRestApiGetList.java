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
import at.mic.superset.swagger.client.model.AnnotationLayerRestApiGetListUser;
import at.mic.superset.swagger.client.model.AnnotationLayerRestApiGetListUser1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * AnnotationLayerRestApiGetList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class AnnotationLayerRestApiGetList {
  @SerializedName("changed_by")
  private AnnotationLayerRestApiGetListUser1 changedBy = null;

  @SerializedName("changed_on")
  private OffsetDateTime changedOn = null;

  @SerializedName("changed_on_delta_humanized")
  private Object changedOnDeltaHumanized = null;

  @SerializedName("created_by")
  private AnnotationLayerRestApiGetListUser createdBy = null;

  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  @SerializedName("descr")
  private String descr = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public AnnotationLayerRestApiGetList changedBy(AnnotationLayerRestApiGetListUser1 changedBy) {
    this.changedBy = changedBy;
    return this;
  }

   /**
   * Get changedBy
   * @return changedBy
  **/
  @Schema(description = "")
  public AnnotationLayerRestApiGetListUser1 getChangedBy() {
    return changedBy;
  }

  public void setChangedBy(AnnotationLayerRestApiGetListUser1 changedBy) {
    this.changedBy = changedBy;
  }

  public AnnotationLayerRestApiGetList changedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
    return this;
  }

   /**
   * Get changedOn
   * @return changedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
  }

   /**
   * Get changedOnDeltaHumanized
   * @return changedOnDeltaHumanized
  **/
  @Schema(description = "")
  public Object getChangedOnDeltaHumanized() {
    return changedOnDeltaHumanized;
  }

  public AnnotationLayerRestApiGetList createdBy(AnnotationLayerRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public AnnotationLayerRestApiGetListUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(AnnotationLayerRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
  }

  public AnnotationLayerRestApiGetList createdOn(OffsetDateTime createdOn) {
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

  public AnnotationLayerRestApiGetList descr(String descr) {
    this.descr = descr;
    return this;
  }

   /**
   * Get descr
   * @return descr
  **/
  @Schema(description = "")
  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public AnnotationLayerRestApiGetList id(Integer id) {
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

  public AnnotationLayerRestApiGetList name(String name) {
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
    AnnotationLayerRestApiGetList annotationLayerRestApiGetList = (AnnotationLayerRestApiGetList) o;
    return Objects.equals(this.changedBy, annotationLayerRestApiGetList.changedBy) &&
        Objects.equals(this.changedOn, annotationLayerRestApiGetList.changedOn) &&
        Objects.equals(this.changedOnDeltaHumanized, annotationLayerRestApiGetList.changedOnDeltaHumanized) &&
        Objects.equals(this.createdBy, annotationLayerRestApiGetList.createdBy) &&
        Objects.equals(this.createdOn, annotationLayerRestApiGetList.createdOn) &&
        Objects.equals(this.descr, annotationLayerRestApiGetList.descr) &&
        Objects.equals(this.id, annotationLayerRestApiGetList.id) &&
        Objects.equals(this.name, annotationLayerRestApiGetList.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedBy, changedOn, changedOnDeltaHumanized, createdBy, createdOn, descr, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationLayerRestApiGetList {\n");
    
    sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    changedOnDeltaHumanized: ").append(toIndentedString(changedOnDeltaHumanized)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
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
