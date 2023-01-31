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
import com.makrol.teamcity.api.swagger.client.model.FileChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of FileChange entities.
 */
@ApiModel(description = "Represents a list of FileChange entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class FileChanges {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("file")
  private List<FileChange> file = null;

  public FileChanges count(Integer count) {
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

  public FileChanges file(List<FileChange> file) {
    this.file = file;
    return this;
  }

  public FileChanges addFileItem(FileChange fileItem) {
    if (this.file == null) {
      this.file = new ArrayList<FileChange>();
    }
    this.file.add(fileItem);
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")
  public List<FileChange> getFile() {
    return file;
  }

  public void setFile(List<FileChange> file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileChanges fileChanges = (FileChanges) o;
    return Objects.equals(this.count, fileChanges.count) &&
        Objects.equals(this.file, fileChanges.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, file);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileChanges {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

