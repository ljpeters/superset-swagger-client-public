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
 * ChartDataGeodeticParseOptionsSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataGeodeticParseOptionsSchema {
  @SerializedName("altitude")
  private String altitude = null;

  @SerializedName("geodetic")
  private String geodetic = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  public ChartDataGeodeticParseOptionsSchema altitude(String altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Name of target column for decoded altitude. If omitted, altitude information in geodetic string is ignored.
   * @return altitude
  **/
  @Schema(description = "Name of target column for decoded altitude. If omitted, altitude information in geodetic string is ignored.")
  public String getAltitude() {
    return altitude;
  }

  public void setAltitude(String altitude) {
    this.altitude = altitude;
  }

  public ChartDataGeodeticParseOptionsSchema geodetic(String geodetic) {
    this.geodetic = geodetic;
    return this;
  }

   /**
   * Name of source column containing geodetic point strings
   * @return geodetic
  **/
  @Schema(required = true, description = "Name of source column containing geodetic point strings")
  public String getGeodetic() {
    return geodetic;
  }

  public void setGeodetic(String geodetic) {
    this.geodetic = geodetic;
  }

  public ChartDataGeodeticParseOptionsSchema latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Name of target column for decoded latitude
   * @return latitude
  **/
  @Schema(required = true, description = "Name of target column for decoded latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public ChartDataGeodeticParseOptionsSchema longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Name of target column for decoded longitude
   * @return longitude
  **/
  @Schema(required = true, description = "Name of target column for decoded longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataGeodeticParseOptionsSchema chartDataGeodeticParseOptionsSchema = (ChartDataGeodeticParseOptionsSchema) o;
    return Objects.equals(this.altitude, chartDataGeodeticParseOptionsSchema.altitude) &&
        Objects.equals(this.geodetic, chartDataGeodeticParseOptionsSchema.geodetic) &&
        Objects.equals(this.latitude, chartDataGeodeticParseOptionsSchema.latitude) &&
        Objects.equals(this.longitude, chartDataGeodeticParseOptionsSchema.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altitude, geodetic, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataGeodeticParseOptionsSchema {\n");
    
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    geodetic: ").append(toIndentedString(geodetic)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
