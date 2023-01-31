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
import com.makrol.teamcity.api.swagger.client.model.Properties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a build configuration stub.
 */
@ApiModel(description = "Represents a build configuration stub.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class NewBuildTypeDescription {
  @SerializedName("copyAllAssociatedSettings")
  private Boolean copyAllAssociatedSettings = null;

  @SerializedName("projectsIdsMap")
  private Properties projectsIdsMap = null;

  @SerializedName("buildTypesIdsMap")
  private Properties buildTypesIdsMap = null;

  @SerializedName("vcsRootsIdsMap")
  private Properties vcsRootsIdsMap = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("sourceBuildTypeLocator")
  private String sourceBuildTypeLocator = null;

  @SerializedName("sourceBuildType")
  private BuildType sourceBuildType = null;

  public NewBuildTypeDescription copyAllAssociatedSettings(Boolean copyAllAssociatedSettings) {
    this.copyAllAssociatedSettings = copyAllAssociatedSettings;
    return this;
  }

   /**
   * Get copyAllAssociatedSettings
   * @return copyAllAssociatedSettings
  **/
  @ApiModelProperty(value = "")
  public Boolean isCopyAllAssociatedSettings() {
    return copyAllAssociatedSettings;
  }

  public void setCopyAllAssociatedSettings(Boolean copyAllAssociatedSettings) {
    this.copyAllAssociatedSettings = copyAllAssociatedSettings;
  }

  public NewBuildTypeDescription projectsIdsMap(Properties projectsIdsMap) {
    this.projectsIdsMap = projectsIdsMap;
    return this;
  }

   /**
   * Get projectsIdsMap
   * @return projectsIdsMap
  **/
  @ApiModelProperty(value = "")
  public Properties getProjectsIdsMap() {
    return projectsIdsMap;
  }

  public void setProjectsIdsMap(Properties projectsIdsMap) {
    this.projectsIdsMap = projectsIdsMap;
  }

  public NewBuildTypeDescription buildTypesIdsMap(Properties buildTypesIdsMap) {
    this.buildTypesIdsMap = buildTypesIdsMap;
    return this;
  }

   /**
   * Get buildTypesIdsMap
   * @return buildTypesIdsMap
  **/
  @ApiModelProperty(value = "")
  public Properties getBuildTypesIdsMap() {
    return buildTypesIdsMap;
  }

  public void setBuildTypesIdsMap(Properties buildTypesIdsMap) {
    this.buildTypesIdsMap = buildTypesIdsMap;
  }

  public NewBuildTypeDescription vcsRootsIdsMap(Properties vcsRootsIdsMap) {
    this.vcsRootsIdsMap = vcsRootsIdsMap;
    return this;
  }

   /**
   * Get vcsRootsIdsMap
   * @return vcsRootsIdsMap
  **/
  @ApiModelProperty(value = "")
  public Properties getVcsRootsIdsMap() {
    return vcsRootsIdsMap;
  }

  public void setVcsRootsIdsMap(Properties vcsRootsIdsMap) {
    this.vcsRootsIdsMap = vcsRootsIdsMap;
  }

  public NewBuildTypeDescription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewBuildTypeDescription id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NewBuildTypeDescription sourceBuildTypeLocator(String sourceBuildTypeLocator) {
    this.sourceBuildTypeLocator = sourceBuildTypeLocator;
    return this;
  }

   /**
   * Get sourceBuildTypeLocator
   * @return sourceBuildTypeLocator
  **/
  @ApiModelProperty(value = "")
  public String getSourceBuildTypeLocator() {
    return sourceBuildTypeLocator;
  }

  public void setSourceBuildTypeLocator(String sourceBuildTypeLocator) {
    this.sourceBuildTypeLocator = sourceBuildTypeLocator;
  }

  public NewBuildTypeDescription sourceBuildType(BuildType sourceBuildType) {
    this.sourceBuildType = sourceBuildType;
    return this;
  }

   /**
   * Get sourceBuildType
   * @return sourceBuildType
  **/
  @ApiModelProperty(value = "")
  public BuildType getSourceBuildType() {
    return sourceBuildType;
  }

  public void setSourceBuildType(BuildType sourceBuildType) {
    this.sourceBuildType = sourceBuildType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBuildTypeDescription newBuildTypeDescription = (NewBuildTypeDescription) o;
    return Objects.equals(this.copyAllAssociatedSettings, newBuildTypeDescription.copyAllAssociatedSettings) &&
        Objects.equals(this.projectsIdsMap, newBuildTypeDescription.projectsIdsMap) &&
        Objects.equals(this.buildTypesIdsMap, newBuildTypeDescription.buildTypesIdsMap) &&
        Objects.equals(this.vcsRootsIdsMap, newBuildTypeDescription.vcsRootsIdsMap) &&
        Objects.equals(this.name, newBuildTypeDescription.name) &&
        Objects.equals(this.id, newBuildTypeDescription.id) &&
        Objects.equals(this.sourceBuildTypeLocator, newBuildTypeDescription.sourceBuildTypeLocator) &&
        Objects.equals(this.sourceBuildType, newBuildTypeDescription.sourceBuildType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyAllAssociatedSettings, projectsIdsMap, buildTypesIdsMap, vcsRootsIdsMap, name, id, sourceBuildTypeLocator, sourceBuildType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBuildTypeDescription {\n");
    
    sb.append("    copyAllAssociatedSettings: ").append(toIndentedString(copyAllAssociatedSettings)).append("\n");
    sb.append("    projectsIdsMap: ").append(toIndentedString(projectsIdsMap)).append("\n");
    sb.append("    buildTypesIdsMap: ").append(toIndentedString(buildTypesIdsMap)).append("\n");
    sb.append("    vcsRootsIdsMap: ").append(toIndentedString(vcsRootsIdsMap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceBuildTypeLocator: ").append(toIndentedString(sourceBuildTypeLocator)).append("\n");
    sb.append("    sourceBuildType: ").append(toIndentedString(sourceBuildType)).append("\n");
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

