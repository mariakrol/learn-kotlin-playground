/*
 * TeamCity REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2018.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.makrol.teamcity.api.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a group of links to the user&#39;s avatars
 */
@ApiModel(description = "Represents a group of links to the user's avatars")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class UserAvatars {
  @SerializedName("urlToSize20")
  private String urlToSize20 = null;

  @SerializedName("urlToSize28")
  private String urlToSize28 = null;

  @SerializedName("urlToSize32")
  private String urlToSize32 = null;

  @SerializedName("urlToSize40")
  private String urlToSize40 = null;

  @SerializedName("urlToSize56")
  private String urlToSize56 = null;

  @SerializedName("urlToSize64")
  private String urlToSize64 = null;

  @SerializedName("urlToSize80")
  private String urlToSize80 = null;

  public UserAvatars urlToSize20(String urlToSize20) {
    this.urlToSize20 = urlToSize20;
    return this;
  }

   /**
   * Get urlToSize20
   * @return urlToSize20
  **/
  @ApiModelProperty(value = "")
  public String getUrlToSize20() {
    return urlToSize20;
  }

  public void setUrlToSize20(String urlToSize20) {
    this.urlToSize20 = urlToSize20;
  }

  public UserAvatars urlToSize28(String urlToSize28) {
    this.urlToSize28 = urlToSize28;
    return this;
  }

   /**
   * Get urlToSize28
   * @return urlToSize28
  **/
  @ApiModelProperty(value = "")
  public String getUrlToSize28() {
    return urlToSize28;
  }

  public void setUrlToSize28(String urlToSize28) {
    this.urlToSize28 = urlToSize28;
  }

  public UserAvatars urlToSize32(String urlToSize32) {
    this.urlToSize32 = urlToSize32;
    return this;
  }

   /**
   * Get urlToSize32
   * @return urlToSize32
  **/
  @ApiModelProperty(value = "")
  public String getUrlToSize32() {
    return urlToSize32;
  }

  public void setUrlToSize32(String urlToSize32) {
    this.urlToSize32 = urlToSize32;
  }

  public UserAvatars urlToSize40(String urlToSize40) {
    this.urlToSize40 = urlToSize40;
    return this;
  }

   /**
   * Get urlToSize40
   * @return urlToSize40
  **/
  @ApiModelProperty(value = "")
  public String getUrlToSize40() {
    return urlToSize40;
  }

  public void setUrlToSize40(String urlToSize40) {
    this.urlToSize40 = urlToSize40;
  }

  public UserAvatars urlToSize56(String urlToSize56) {
    this.urlToSize56 = urlToSize56;
    return this;
  }

   /**
   * Get urlToSize56
   * @return urlToSize56
  **/
  @ApiModelProperty(value = "")
  public String getUrlToSize56() {
    return urlToSize56;
  }

  public void setUrlToSize56(String urlToSize56) {
    this.urlToSize56 = urlToSize56;
  }

  public UserAvatars urlToSize64(String urlToSize64) {
    this.urlToSize64 = urlToSize64;
    return this;
  }

   /**
   * Get urlToSize64
   * @return urlToSize64
  **/
  @ApiModelProperty(value = "")
  public String getUrlToSize64() {
    return urlToSize64;
  }

  public void setUrlToSize64(String urlToSize64) {
    this.urlToSize64 = urlToSize64;
  }

  public UserAvatars urlToSize80(String urlToSize80) {
    this.urlToSize80 = urlToSize80;
    return this;
  }

   /**
   * Get urlToSize80
   * @return urlToSize80
  **/
  @ApiModelProperty(value = "")
  public String getUrlToSize80() {
    return urlToSize80;
  }

  public void setUrlToSize80(String urlToSize80) {
    this.urlToSize80 = urlToSize80;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAvatars userAvatars = (UserAvatars) o;
    return Objects.equals(this.urlToSize20, userAvatars.urlToSize20) &&
        Objects.equals(this.urlToSize28, userAvatars.urlToSize28) &&
        Objects.equals(this.urlToSize32, userAvatars.urlToSize32) &&
        Objects.equals(this.urlToSize40, userAvatars.urlToSize40) &&
        Objects.equals(this.urlToSize56, userAvatars.urlToSize56) &&
        Objects.equals(this.urlToSize64, userAvatars.urlToSize64) &&
        Objects.equals(this.urlToSize80, userAvatars.urlToSize80);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlToSize20, urlToSize28, urlToSize32, urlToSize40, urlToSize56, urlToSize64, urlToSize80);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAvatars {\n");
    
    sb.append("    urlToSize20: ").append(toIndentedString(urlToSize20)).append("\n");
    sb.append("    urlToSize28: ").append(toIndentedString(urlToSize28)).append("\n");
    sb.append("    urlToSize32: ").append(toIndentedString(urlToSize32)).append("\n");
    sb.append("    urlToSize40: ").append(toIndentedString(urlToSize40)).append("\n");
    sb.append("    urlToSize56: ").append(toIndentedString(urlToSize56)).append("\n");
    sb.append("    urlToSize64: ").append(toIndentedString(urlToSize64)).append("\n");
    sb.append("    urlToSize80: ").append(toIndentedString(urlToSize80)).append("\n");
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

