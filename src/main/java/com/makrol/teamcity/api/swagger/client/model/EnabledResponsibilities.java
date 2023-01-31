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
import com.makrol.teamcity.api.swagger.client.model.Responsibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of enabled responsibilities of a TeamCity node.
 */
@ApiModel(description = "Represents a set of enabled responsibilities of a TeamCity node.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class EnabledResponsibilities {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("responsibility")
  private List<Responsibility> responsibility = null;

  public EnabledResponsibilities count(Integer count) {
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

  public EnabledResponsibilities responsibility(List<Responsibility> responsibility) {
    this.responsibility = responsibility;
    return this;
  }

  public EnabledResponsibilities addResponsibilityItem(Responsibility responsibilityItem) {
    if (this.responsibility == null) {
      this.responsibility = new ArrayList<Responsibility>();
    }
    this.responsibility.add(responsibilityItem);
    return this;
  }

   /**
   * Get responsibility
   * @return responsibility
  **/
  @ApiModelProperty(value = "")
  public List<Responsibility> getResponsibility() {
    return responsibility;
  }

  public void setResponsibility(List<Responsibility> responsibility) {
    this.responsibility = responsibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnabledResponsibilities enabledResponsibilities = (EnabledResponsibilities) o;
    return Objects.equals(this.count, enabledResponsibilities.count) &&
        Objects.equals(this.responsibility, enabledResponsibilities.responsibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, responsibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnabledResponsibilities {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    responsibility: ").append(toIndentedString(responsibility)).append("\n");
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

