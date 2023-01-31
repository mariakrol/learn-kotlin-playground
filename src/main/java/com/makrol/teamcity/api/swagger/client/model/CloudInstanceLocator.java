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
 * Represents a locator string for filtering CloudInstance entities.
 */
@ApiModel(description = "Represents a locator string for filtering CloudInstance entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class CloudInstanceLocator {
  @SerializedName("affectedProject")
  private String affectedProject = null;

  @SerializedName("agent")
  private String agent = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("instance")
  private String instance = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("networkAddress")
  private String networkAddress = null;

  @SerializedName("profile")
  private String profile = null;

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

  public CloudInstanceLocator affectedProject(String affectedProject) {
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

  public CloudInstanceLocator agent(String agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Agent locator.
   * @return agent
  **/
  @ApiModelProperty(value = "Agent locator.")
  public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

  public CloudInstanceLocator id(String id) {
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

  public CloudInstanceLocator instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Cloud image locator.
   * @return instance
  **/
  @ApiModelProperty(value = "Cloud image locator.")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public CloudInstanceLocator item(String item) {
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

  public CloudInstanceLocator networkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
    return this;
  }

   /**
   * Get networkAddress
   * @return networkAddress
  **/
  @ApiModelProperty(value = "")
  public String getNetworkAddress() {
    return networkAddress;
  }

  public void setNetworkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
  }

  public CloudInstanceLocator profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Cloud profile locator.
   * @return profile
  **/
  @ApiModelProperty(value = "Cloud profile locator.")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public CloudInstanceLocator project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Project locator.
   * @return project
  **/
  @ApiModelProperty(value = "Project locator.")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public CloudInstanceLocator property(PropertyEnum property) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudInstanceLocator cloudInstanceLocator = (CloudInstanceLocator) o;
    return Objects.equals(this.affectedProject, cloudInstanceLocator.affectedProject) &&
        Objects.equals(this.agent, cloudInstanceLocator.agent) &&
        Objects.equals(this.id, cloudInstanceLocator.id) &&
        Objects.equals(this.instance, cloudInstanceLocator.instance) &&
        Objects.equals(this.item, cloudInstanceLocator.item) &&
        Objects.equals(this.networkAddress, cloudInstanceLocator.networkAddress) &&
        Objects.equals(this.profile, cloudInstanceLocator.profile) &&
        Objects.equals(this.project, cloudInstanceLocator.project) &&
        Objects.equals(this.property, cloudInstanceLocator.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedProject, agent, id, instance, item, networkAddress, profile, project, property);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudInstanceLocator {\n");
    
    sb.append("    affectedProject: ").append(toIndentedString(affectedProject)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    networkAddress: ").append(toIndentedString(networkAddress)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

