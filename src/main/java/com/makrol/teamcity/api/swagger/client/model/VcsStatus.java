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
import com.makrol.teamcity.api.swagger.client.model.VcsCheckStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents links to the last or previous VCS root check.
 */
@ApiModel(description = "Represents links to the last or previous VCS root check.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class VcsStatus {
  @SerializedName("current")
  private VcsCheckStatus current = null;

  @SerializedName("previous")
  private VcsCheckStatus previous = null;

  public VcsStatus current(VcsCheckStatus current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(value = "")
  public VcsCheckStatus getCurrent() {
    return current;
  }

  public void setCurrent(VcsCheckStatus current) {
    this.current = current;
  }

  public VcsStatus previous(VcsCheckStatus previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public VcsCheckStatus getPrevious() {
    return previous;
  }

  public void setPrevious(VcsCheckStatus previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcsStatus vcsStatus = (VcsStatus) o;
    return Objects.equals(this.current, vcsStatus.current) &&
        Objects.equals(this.previous, vcsStatus.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcsStatus {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

