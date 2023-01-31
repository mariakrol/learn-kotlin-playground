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
 * Represents a locator string for filtering VcsRootInstance entities.
 */
@ApiModel(description = "Represents a locator string for filtering VcsRootInstance entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class VcsRootInstanceLocator {
  @SerializedName("affectedProject")
  private String affectedProject = null;

  @SerializedName("build")
  private String build = null;

  @SerializedName("buildType")
  private String buildType = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("lookupLimit")
  private Integer lookupLimit = null;

  @SerializedName("project")
  private String project = null;

  /**
   * Gets or Sets property
   */
  @JsonAdapter(PropertyEnum.Adapter.class)
  public enum PropertyEnum {
    EXISTS("exists"),
    
    NOT_EXISTS("not-exists"),
    
    EQUALS("equals"),
    
    DOES_NOT_EQUAL("does-not-equal"),
    
    STARTS_WITH("starts-with"),
    
    CONTAINS("contains"),
    
    DOES_NOT_CONTAIN("does-not-contain"),
    
    ENDS_WITH("ends-with"),
    
    ANY("any"),
    
    MATCHES("matches"),
    
    DOES_NOT_MATCH("does-not-match"),
    
    MORE_THAN("more-than"),
    
    NO_MORE_THAN("no-more-than"),
    
    LESS_THAN("less-than"),
    
    NO_LESS_THAN("no-less-than"),
    
    VER_MORE_THAN("ver-more-than"),
    
    VER_NO_MORE_THAN("ver-no-more-than"),
    
    VER_LESS_THAN("ver-less-than"),
    
    VER_NO_LESS_THAN("ver-no-less-than");

    private String value;

    PropertyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PropertyEnum fromValue(String text) {
      for (PropertyEnum b : PropertyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PropertyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PropertyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PropertyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PropertyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("property")
  private PropertyEnum property = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("vcsRoot")
  private String vcsRoot = null;

  @SerializedName("versionedSettings")
  private Boolean versionedSettings = null;

  public VcsRootInstanceLocator affectedProject(String affectedProject) {
    this.affectedProject = affectedProject;
    return this;
  }

   /**
   * Project (direct or indirect parent) locator.
   * @return affectedProject
  **/
  @ApiModelProperty(value = "Project (direct or indirect parent) locator.")
  public String getAffectedProject() {
    return affectedProject;
  }

  public void setAffectedProject(String affectedProject) {
    this.affectedProject = affectedProject;
  }

  public VcsRootInstanceLocator build(String build) {
    this.build = build;
    return this;
  }

   /**
   * Build locator.
   * @return build
  **/
  @ApiModelProperty(value = "Build locator.")
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }

  public VcsRootInstanceLocator buildType(String buildType) {
    this.buildType = buildType;
    return this;
  }

   /**
   * Build type locator.
   * @return buildType
  **/
  @ApiModelProperty(value = "Build type locator.")
  public String getBuildType() {
    return buildType;
  }

  public void setBuildType(String buildType) {
    this.buildType = buildType;
  }

  public VcsRootInstanceLocator count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * For paginated calls, how many entities to return per page.
   * @return count
  **/
  @ApiModelProperty(value = "For paginated calls, how many entities to return per page.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public VcsRootInstanceLocator id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Entity ID.
   * @return id
  **/
  @ApiModelProperty(value = "Entity ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VcsRootInstanceLocator item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Supply multiple locators and return a union of the results.
   * @return item
  **/
  @ApiModelProperty(value = "Supply multiple locators and return a union of the results.")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public VcsRootInstanceLocator lookupLimit(Integer lookupLimit) {
    this.lookupLimit = lookupLimit;
    return this;
  }

   /**
   * Limit processing to the latest &#x60;&lt;lookupLimit&gt;&#x60; entities.
   * @return lookupLimit
  **/
  @ApiModelProperty(value = "Limit processing to the latest `<lookupLimit>` entities.")
  public Integer getLookupLimit() {
    return lookupLimit;
  }

  public void setLookupLimit(Integer lookupLimit) {
    this.lookupLimit = lookupLimit;
  }

  public VcsRootInstanceLocator project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Project (direct parent) locator.
   * @return project
  **/
  @ApiModelProperty(value = "Project (direct parent) locator.")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public VcsRootInstanceLocator property(PropertyEnum property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(value = "")
  public PropertyEnum getProperty() {
    return property;
  }

  public void setProperty(PropertyEnum property) {
    this.property = property;
  }

  public VcsRootInstanceLocator start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * For paginated calls, from which entity to start rendering the page.
   * @return start
  **/
  @ApiModelProperty(value = "For paginated calls, from which entity to start rendering the page.")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public VcsRootInstanceLocator type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of VCS (e.g. jetbrains.git).
   * @return type
  **/
  @ApiModelProperty(value = "Type of VCS (e.g. jetbrains.git).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VcsRootInstanceLocator vcsRoot(String vcsRoot) {
    this.vcsRoot = vcsRoot;
    return this;
  }

   /**
   * VCS root locator.
   * @return vcsRoot
  **/
  @ApiModelProperty(value = "VCS root locator.")
  public String getVcsRoot() {
    return vcsRoot;
  }

  public void setVcsRoot(String vcsRoot) {
    this.vcsRoot = vcsRoot;
  }

  public VcsRootInstanceLocator versionedSettings(Boolean versionedSettings) {
    this.versionedSettings = versionedSettings;
    return this;
  }

   /**
   * Is used for versioned settings.
   * @return versionedSettings
  **/
  @ApiModelProperty(value = "Is used for versioned settings.")
  public Boolean isVersionedSettings() {
    return versionedSettings;
  }

  public void setVersionedSettings(Boolean versionedSettings) {
    this.versionedSettings = versionedSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcsRootInstanceLocator vcsRootInstanceLocator = (VcsRootInstanceLocator) o;
    return Objects.equals(this.affectedProject, vcsRootInstanceLocator.affectedProject) &&
        Objects.equals(this.build, vcsRootInstanceLocator.build) &&
        Objects.equals(this.buildType, vcsRootInstanceLocator.buildType) &&
        Objects.equals(this.count, vcsRootInstanceLocator.count) &&
        Objects.equals(this.id, vcsRootInstanceLocator.id) &&
        Objects.equals(this.item, vcsRootInstanceLocator.item) &&
        Objects.equals(this.lookupLimit, vcsRootInstanceLocator.lookupLimit) &&
        Objects.equals(this.project, vcsRootInstanceLocator.project) &&
        Objects.equals(this.property, vcsRootInstanceLocator.property) &&
        Objects.equals(this.start, vcsRootInstanceLocator.start) &&
        Objects.equals(this.type, vcsRootInstanceLocator.type) &&
        Objects.equals(this.vcsRoot, vcsRootInstanceLocator.vcsRoot) &&
        Objects.equals(this.versionedSettings, vcsRootInstanceLocator.versionedSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedProject, build, buildType, count, id, item, lookupLimit, project, property, start, type, vcsRoot, versionedSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcsRootInstanceLocator {\n");
    
    sb.append("    affectedProject: ").append(toIndentedString(affectedProject)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    lookupLimit: ").append(toIndentedString(lookupLimit)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vcsRoot: ").append(toIndentedString(vcsRoot)).append("\n");
    sb.append("    versionedSettings: ").append(toIndentedString(versionedSettings)).append("\n");
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

