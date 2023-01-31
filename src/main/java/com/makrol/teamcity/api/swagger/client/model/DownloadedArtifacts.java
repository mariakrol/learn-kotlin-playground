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
import com.makrol.teamcity.api.swagger.client.model.DownloadInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of artifacts metadata which were downloaded from dependencies of this build or delivered to ones depending on this build.
 */
@ApiModel(description = "Collection of artifacts metadata which were downloaded from dependencies of this build or delivered to ones depending on this build.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class DownloadedArtifacts {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("unfilteredCount")
  private Integer unfilteredCount = null;

  @SerializedName("downloadInfo")
  private List<DownloadInfo> downloadInfo = null;

  public DownloadedArtifacts count(Integer count) {
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

  public DownloadedArtifacts unfilteredCount(Integer unfilteredCount) {
    this.unfilteredCount = unfilteredCount;
    return this;
  }

   /**
   * Get unfilteredCount
   * @return unfilteredCount
  **/
  @ApiModelProperty(value = "")
  public Integer getUnfilteredCount() {
    return unfilteredCount;
  }

  public void setUnfilteredCount(Integer unfilteredCount) {
    this.unfilteredCount = unfilteredCount;
  }

  public DownloadedArtifacts downloadInfo(List<DownloadInfo> downloadInfo) {
    this.downloadInfo = downloadInfo;
    return this;
  }

  public DownloadedArtifacts addDownloadInfoItem(DownloadInfo downloadInfoItem) {
    if (this.downloadInfo == null) {
      this.downloadInfo = new ArrayList<DownloadInfo>();
    }
    this.downloadInfo.add(downloadInfoItem);
    return this;
  }

   /**
   * Get downloadInfo
   * @return downloadInfo
  **/
  @ApiModelProperty(value = "")
  public List<DownloadInfo> getDownloadInfo() {
    return downloadInfo;
  }

  public void setDownloadInfo(List<DownloadInfo> downloadInfo) {
    this.downloadInfo = downloadInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadedArtifacts downloadedArtifacts = (DownloadedArtifacts) o;
    return Objects.equals(this.count, downloadedArtifacts.count) &&
        Objects.equals(this.unfilteredCount, downloadedArtifacts.unfilteredCount) &&
        Objects.equals(this.downloadInfo, downloadedArtifacts.downloadInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, unfilteredCount, downloadInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadedArtifacts {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    unfilteredCount: ").append(toIndentedString(unfilteredCount)).append("\n");
    sb.append("    downloadInfo: ").append(toIndentedString(downloadInfo)).append("\n");
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

