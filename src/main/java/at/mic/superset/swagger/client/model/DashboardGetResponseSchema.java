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
import at.mic.superset.swagger.client.model.Roles;
import at.mic.superset.swagger.client.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * DashboardGetResponseSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class DashboardGetResponseSchema {
  @SerializedName("certification_details")
  private String certificationDetails = null;

  @SerializedName("certified_by")
  private String certifiedBy = null;

  @SerializedName("changed_by")
  private User changedBy = null;

  @SerializedName("changed_by_name")
  private String changedByName = null;

  @SerializedName("changed_by_url")
  private String changedByUrl = null;

  @SerializedName("changed_on")
  private OffsetDateTime changedOn = null;

  @SerializedName("changed_on_delta_humanized")
  private String changedOnDeltaHumanized = null;

  @SerializedName("charts")
  private List<String> charts = null;

  @SerializedName("css")
  private String css = null;

  @SerializedName("dashboard_title")
  private String dashboardTitle = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("is_managed_externally")
  private Boolean isManagedExternally = null;

  @SerializedName("json_metadata")
  private String jsonMetadata = null;

  @SerializedName("owners")
  private List<User> owners = null;

  @SerializedName("position_json")
  private String positionJson = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("roles")
  private List<Roles> roles = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("thumbnail_url")
  private String thumbnailUrl = null;

  @SerializedName("url")
  private String url = null;

  public DashboardGetResponseSchema certificationDetails(String certificationDetails) {
    this.certificationDetails = certificationDetails;
    return this;
  }

   /**
   * Details of the certification
   * @return certificationDetails
  **/
  @Schema(description = "Details of the certification")
  public String getCertificationDetails() {
    return certificationDetails;
  }

  public void setCertificationDetails(String certificationDetails) {
    this.certificationDetails = certificationDetails;
  }

  public DashboardGetResponseSchema certifiedBy(String certifiedBy) {
    this.certifiedBy = certifiedBy;
    return this;
  }

   /**
   * Person or group that has certified this dashboard
   * @return certifiedBy
  **/
  @Schema(description = "Person or group that has certified this dashboard")
  public String getCertifiedBy() {
    return certifiedBy;
  }

  public void setCertifiedBy(String certifiedBy) {
    this.certifiedBy = certifiedBy;
  }

  public DashboardGetResponseSchema changedBy(User changedBy) {
    this.changedBy = changedBy;
    return this;
  }

   /**
   * Get changedBy
   * @return changedBy
  **/
  @Schema(description = "")
  public User getChangedBy() {
    return changedBy;
  }

  public void setChangedBy(User changedBy) {
    this.changedBy = changedBy;
  }

  public DashboardGetResponseSchema changedByName(String changedByName) {
    this.changedByName = changedByName;
    return this;
  }

   /**
   * Get changedByName
   * @return changedByName
  **/
  @Schema(description = "")
  public String getChangedByName() {
    return changedByName;
  }

  public void setChangedByName(String changedByName) {
    this.changedByName = changedByName;
  }

  public DashboardGetResponseSchema changedByUrl(String changedByUrl) {
    this.changedByUrl = changedByUrl;
    return this;
  }

   /**
   * Get changedByUrl
   * @return changedByUrl
  **/
  @Schema(description = "")
  public String getChangedByUrl() {
    return changedByUrl;
  }

  public void setChangedByUrl(String changedByUrl) {
    this.changedByUrl = changedByUrl;
  }

  public DashboardGetResponseSchema changedOn(OffsetDateTime changedOn) {
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

  public DashboardGetResponseSchema changedOnDeltaHumanized(String changedOnDeltaHumanized) {
    this.changedOnDeltaHumanized = changedOnDeltaHumanized;
    return this;
  }

   /**
   * Get changedOnDeltaHumanized
   * @return changedOnDeltaHumanized
  **/
  @Schema(description = "")
  public String getChangedOnDeltaHumanized() {
    return changedOnDeltaHumanized;
  }

  public void setChangedOnDeltaHumanized(String changedOnDeltaHumanized) {
    this.changedOnDeltaHumanized = changedOnDeltaHumanized;
  }

  public DashboardGetResponseSchema charts(List<String> charts) {
    this.charts = charts;
    return this;
  }

  public DashboardGetResponseSchema addChartsItem(String chartsItem) {
    if (this.charts == null) {
      this.charts = new ArrayList<String>();
    }
    this.charts.add(chartsItem);
    return this;
  }

   /**
   * Get charts
   * @return charts
  **/
  @Schema(description = "")
  public List<String> getCharts() {
    return charts;
  }

  public void setCharts(List<String> charts) {
    this.charts = charts;
  }

  public DashboardGetResponseSchema css(String css) {
    this.css = css;
    return this;
  }

   /**
   * Override CSS for the dashboard.
   * @return css
  **/
  @Schema(description = "Override CSS for the dashboard.")
  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }

  public DashboardGetResponseSchema dashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
    return this;
  }

   /**
   * A title for the dashboard.
   * @return dashboardTitle
  **/
  @Schema(description = "A title for the dashboard.")
  public String getDashboardTitle() {
    return dashboardTitle;
  }

  public void setDashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
  }

  public DashboardGetResponseSchema id(Integer id) {
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

  public DashboardGetResponseSchema isManagedExternally(Boolean isManagedExternally) {
    this.isManagedExternally = isManagedExternally;
    return this;
  }

   /**
   * Get isManagedExternally
   * @return isManagedExternally
  **/
  @Schema(description = "")
  public Boolean isIsManagedExternally() {
    return isManagedExternally;
  }

  public void setIsManagedExternally(Boolean isManagedExternally) {
    this.isManagedExternally = isManagedExternally;
  }

  public DashboardGetResponseSchema jsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
    return this;
  }

   /**
   * This JSON object is generated dynamically when clicking the save or overwrite button in the dashboard view. It is exposed here for reference and for power users who may want to alter  specific parameters.
   * @return jsonMetadata
  **/
  @Schema(description = "This JSON object is generated dynamically when clicking the save or overwrite button in the dashboard view. It is exposed here for reference and for power users who may want to alter  specific parameters.")
  public String getJsonMetadata() {
    return jsonMetadata;
  }

  public void setJsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
  }

  public DashboardGetResponseSchema owners(List<User> owners) {
    this.owners = owners;
    return this;
  }

  public DashboardGetResponseSchema addOwnersItem(User ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<User>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @Schema(description = "")
  public List<User> getOwners() {
    return owners;
  }

  public void setOwners(List<User> owners) {
    this.owners = owners;
  }

  public DashboardGetResponseSchema positionJson(String positionJson) {
    this.positionJson = positionJson;
    return this;
  }

   /**
   * This json object describes the positioning of the widgets in the dashboard. It is dynamically generated when adjusting the widgets size and positions by using drag &amp; drop in the dashboard view
   * @return positionJson
  **/
  @Schema(description = "This json object describes the positioning of the widgets in the dashboard. It is dynamically generated when adjusting the widgets size and positions by using drag & drop in the dashboard view")
  public String getPositionJson() {
    return positionJson;
  }

  public void setPositionJson(String positionJson) {
    this.positionJson = positionJson;
  }

  public DashboardGetResponseSchema published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @Schema(description = "")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public DashboardGetResponseSchema roles(List<Roles> roles) {
    this.roles = roles;
    return this;
  }

  public DashboardGetResponseSchema addRolesItem(Roles rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Roles>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<Roles> getRoles() {
    return roles;
  }

  public void setRoles(List<Roles> roles) {
    this.roles = roles;
  }

  public DashboardGetResponseSchema slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @Schema(description = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public DashboardGetResponseSchema thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * Get thumbnailUrl
   * @return thumbnailUrl
  **/
  @Schema(description = "")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public DashboardGetResponseSchema url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGetResponseSchema dashboardGetResponseSchema = (DashboardGetResponseSchema) o;
    return Objects.equals(this.certificationDetails, dashboardGetResponseSchema.certificationDetails) &&
        Objects.equals(this.certifiedBy, dashboardGetResponseSchema.certifiedBy) &&
        Objects.equals(this.changedBy, dashboardGetResponseSchema.changedBy) &&
        Objects.equals(this.changedByName, dashboardGetResponseSchema.changedByName) &&
        Objects.equals(this.changedByUrl, dashboardGetResponseSchema.changedByUrl) &&
        Objects.equals(this.changedOn, dashboardGetResponseSchema.changedOn) &&
        Objects.equals(this.changedOnDeltaHumanized, dashboardGetResponseSchema.changedOnDeltaHumanized) &&
        Objects.equals(this.charts, dashboardGetResponseSchema.charts) &&
        Objects.equals(this.css, dashboardGetResponseSchema.css) &&
        Objects.equals(this.dashboardTitle, dashboardGetResponseSchema.dashboardTitle) &&
        Objects.equals(this.id, dashboardGetResponseSchema.id) &&
        Objects.equals(this.isManagedExternally, dashboardGetResponseSchema.isManagedExternally) &&
        Objects.equals(this.jsonMetadata, dashboardGetResponseSchema.jsonMetadata) &&
        Objects.equals(this.owners, dashboardGetResponseSchema.owners) &&
        Objects.equals(this.positionJson, dashboardGetResponseSchema.positionJson) &&
        Objects.equals(this.published, dashboardGetResponseSchema.published) &&
        Objects.equals(this.roles, dashboardGetResponseSchema.roles) &&
        Objects.equals(this.slug, dashboardGetResponseSchema.slug) &&
        Objects.equals(this.thumbnailUrl, dashboardGetResponseSchema.thumbnailUrl) &&
        Objects.equals(this.url, dashboardGetResponseSchema.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificationDetails, certifiedBy, changedBy, changedByName, changedByUrl, changedOn, changedOnDeltaHumanized, charts, css, dashboardTitle, id, isManagedExternally, jsonMetadata, owners, positionJson, published, roles, slug, thumbnailUrl, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGetResponseSchema {\n");
    
    sb.append("    certificationDetails: ").append(toIndentedString(certificationDetails)).append("\n");
    sb.append("    certifiedBy: ").append(toIndentedString(certifiedBy)).append("\n");
    sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
    sb.append("    changedByName: ").append(toIndentedString(changedByName)).append("\n");
    sb.append("    changedByUrl: ").append(toIndentedString(changedByUrl)).append("\n");
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    changedOnDeltaHumanized: ").append(toIndentedString(changedOnDeltaHumanized)).append("\n");
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    dashboardTitle: ").append(toIndentedString(dashboardTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isManagedExternally: ").append(toIndentedString(isManagedExternally)).append("\n");
    sb.append("    jsonMetadata: ").append(toIndentedString(jsonMetadata)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    positionJson: ").append(toIndentedString(positionJson)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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