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
import com.makrol.teamcity.api.swagger.client.model.BuildType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a paginated list of BuildType entities.
 */
@ApiModel(description = "Represents a paginated list of BuildType entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class BuildTypes {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("nextHref")
  private String nextHref = null;

  @SerializedName("prevHref")
  private String prevHref = null;

  @SerializedName("buildType")
  private List<BuildType> buildType = null;

  public BuildTypes count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BuildTypes href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BuildTypes nextHref(String nextHref) {
    this.nextHref = nextHref;
    return this;
  }

   /**
   * Get nextHref
   * @return nextHref
  **/
  @ApiModelProperty(value = "")
  public String getNextHref() {
    return nextHref;
  }

  public void setNextHref(String nextHref) {
    this.nextHref = nextHref;
  }

  public BuildTypes prevHref(String prevHref) {
    this.prevHref = prevHref;
    return this;
  }

   /**
   * Get prevHref
   * @return prevHref
  **/
  @ApiModelProperty(value = "")
  public String getPrevHref() {
    return prevHref;
  }

  public void setPrevHref(String prevHref) {
    this.prevHref = prevHref;
  }

  public BuildTypes buildType(List<BuildType> buildType) {
    this.buildType = buildType;
    return this;
  }

  public BuildTypes addBuildTypeItem(BuildType buildTypeItem) {
    if (this.buildType == null) {
      this.buildType = new ArrayList<BuildType>();
    }
    this.buildType.add(buildTypeItem);
    return this;
  }

   /**
   * Get buildType
   * @return buildType
  **/
  @ApiModelProperty(value = "")
  public List<BuildType> getBuildType() {
    return buildType;
  }

  public void setBuildType(List<BuildType> buildType) {
    this.buildType = buildType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildTypes buildTypes = (BuildTypes) o;
    return Objects.equals(this.count, buildTypes.count) &&
        Objects.equals(this.href, buildTypes.href) &&
        Objects.equals(this.nextHref, buildTypes.nextHref) &&
        Objects.equals(this.prevHref, buildTypes.prevHref) &&
        Objects.equals(this.buildType, buildTypes.buildType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, href, nextHref, prevHref, buildType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildTypes {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    nextHref: ").append(toIndentedString(nextHref)).append("\n");
    sb.append("    prevHref: ").append(toIndentedString(prevHref)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
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

