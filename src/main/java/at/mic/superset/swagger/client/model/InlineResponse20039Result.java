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
 * InlineResponse20039Result
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class InlineResponse20039Result {
  @SerializedName("childs")
  private List<Object> childs = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  public InlineResponse20039Result childs(List<Object> childs) {
    this.childs = childs;
    return this;
  }

  public InlineResponse20039Result addChildsItem(Object childsItem) {
    if (this.childs == null) {
      this.childs = new ArrayList<Object>();
    }
    this.childs.add(childsItem);
    return this;
  }

   /**
   * Get childs
   * @return childs
  **/
  @Schema(description = "")
  public List<Object> getChilds() {
    return childs;
  }

  public void setChilds(List<Object> childs) {
    this.childs = childs;
  }

  public InlineResponse20039Result icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Icon name to show for this menu item
   * @return icon
  **/
  @Schema(description = "Icon name to show for this menu item")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public InlineResponse20039Result label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Pretty name for the menu item
   * @return label
  **/
  @Schema(description = "Pretty name for the menu item")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public InlineResponse20039Result name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The internal menu item name, maps to permission_name
   * @return name
  **/
  @Schema(description = "The internal menu item name, maps to permission_name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20039Result url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL for the menu item
   * @return url
  **/
  @Schema(description = "The URL for the menu item")
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
    InlineResponse20039Result inlineResponse20039Result = (InlineResponse20039Result) o;
    return Objects.equals(this.childs, inlineResponse20039Result.childs) &&
        Objects.equals(this.icon, inlineResponse20039Result.icon) &&
        Objects.equals(this.label, inlineResponse20039Result.label) &&
        Objects.equals(this.name, inlineResponse20039Result.name) &&
        Objects.equals(this.url, inlineResponse20039Result.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childs, icon, label, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039Result {\n");
    
    sb.append("    childs: ").append(toIndentedString(childs)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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