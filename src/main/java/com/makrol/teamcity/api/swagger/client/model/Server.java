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
import com.makrol.teamcity.api.swagger.client.model.Href;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents various details of this server including the installation version.
 */
@ApiModel(description = "Represents various details of this server including the installation version.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class Server {
  @SerializedName("version")
  private String version = null;

  @SerializedName("versionMajor")
  private Integer versionMajor = null;

  @SerializedName("versionMinor")
  private Integer versionMinor = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("currentTime")
  private String currentTime = null;

  @SerializedName("buildNumber")
  private String buildNumber = null;

  @SerializedName("buildDate")
  private String buildDate = null;

  @SerializedName("internalId")
  private String internalId = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("projects")
  private Href projects = null;

  @SerializedName("vcsRoots")
  private Href vcsRoots = null;

  @SerializedName("builds")
  private Href builds = null;

  @SerializedName("users")
  private Href users = null;

  @SerializedName("userGroups")
  private Href userGroups = null;

  @SerializedName("agents")
  private Href agents = null;

  @SerializedName("buildQueue")
  private Href buildQueue = null;

  @SerializedName("agentPools")
  private Href agentPools = null;

  @SerializedName("investigations")
  private Href investigations = null;

  @SerializedName("mutes")
  private Href mutes = null;

  @SerializedName("artifactsUrl")
  private String artifactsUrl = null;

  @SerializedName("nodes")
  private Href nodes = null;

  public Server version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Server versionMajor(Integer versionMajor) {
    this.versionMajor = versionMajor;
    return this;
  }

   /**
   * Get versionMajor
   * @return versionMajor
  **/
  @ApiModelProperty(value = "")
  public Integer getVersionMajor() {
    return versionMajor;
  }

  public void setVersionMajor(Integer versionMajor) {
    this.versionMajor = versionMajor;
  }

  public Server versionMinor(Integer versionMinor) {
    this.versionMinor = versionMinor;
    return this;
  }

   /**
   * Get versionMinor
   * @return versionMinor
  **/
  @ApiModelProperty(value = "")
  public Integer getVersionMinor() {
    return versionMinor;
  }

  public void setVersionMinor(Integer versionMinor) {
    this.versionMinor = versionMinor;
  }

  public Server startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Server currentTime(String currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * Get currentTime
   * @return currentTime
  **/
  @ApiModelProperty(value = "")
  public String getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(String currentTime) {
    this.currentTime = currentTime;
  }

  public Server buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

   /**
   * Get buildNumber
   * @return buildNumber
  **/
  @ApiModelProperty(value = "")
  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public Server buildDate(String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

   /**
   * Get buildDate
   * @return buildDate
  **/
  @ApiModelProperty(value = "")
  public String getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }

  public Server internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

   /**
   * Get internalId
   * @return internalId
  **/
  @ApiModelProperty(value = "")
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public Server role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Server webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @ApiModelProperty(value = "")
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public Server projects(Href projects) {
    this.projects = projects;
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @ApiModelProperty(value = "")
  public Href getProjects() {
    return projects;
  }

  public void setProjects(Href projects) {
    this.projects = projects;
  }

  public Server vcsRoots(Href vcsRoots) {
    this.vcsRoots = vcsRoots;
    return this;
  }

   /**
   * Get vcsRoots
   * @return vcsRoots
  **/
  @ApiModelProperty(value = "")
  public Href getVcsRoots() {
    return vcsRoots;
  }

  public void setVcsRoots(Href vcsRoots) {
    this.vcsRoots = vcsRoots;
  }

  public Server builds(Href builds) {
    this.builds = builds;
    return this;
  }

   /**
   * Get builds
   * @return builds
  **/
  @ApiModelProperty(value = "")
  public Href getBuilds() {
    return builds;
  }

  public void setBuilds(Href builds) {
    this.builds = builds;
  }

  public Server users(Href users) {
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public Href getUsers() {
    return users;
  }

  public void setUsers(Href users) {
    this.users = users;
  }

  public Server userGroups(Href userGroups) {
    this.userGroups = userGroups;
    return this;
  }

   /**
   * Get userGroups
   * @return userGroups
  **/
  @ApiModelProperty(value = "")
  public Href getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(Href userGroups) {
    this.userGroups = userGroups;
  }

  public Server agents(Href agents) {
    this.agents = agents;
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @ApiModelProperty(value = "")
  public Href getAgents() {
    return agents;
  }

  public void setAgents(Href agents) {
    this.agents = agents;
  }

  public Server buildQueue(Href buildQueue) {
    this.buildQueue = buildQueue;
    return this;
  }

   /**
   * Get buildQueue
   * @return buildQueue
  **/
  @ApiModelProperty(value = "")
  public Href getBuildQueue() {
    return buildQueue;
  }

  public void setBuildQueue(Href buildQueue) {
    this.buildQueue = buildQueue;
  }

  public Server agentPools(Href agentPools) {
    this.agentPools = agentPools;
    return this;
  }

   /**
   * Get agentPools
   * @return agentPools
  **/
  @ApiModelProperty(value = "")
  public Href getAgentPools() {
    return agentPools;
  }

  public void setAgentPools(Href agentPools) {
    this.agentPools = agentPools;
  }

  public Server investigations(Href investigations) {
    this.investigations = investigations;
    return this;
  }

   /**
   * Get investigations
   * @return investigations
  **/
  @ApiModelProperty(value = "")
  public Href getInvestigations() {
    return investigations;
  }

  public void setInvestigations(Href investigations) {
    this.investigations = investigations;
  }

  public Server mutes(Href mutes) {
    this.mutes = mutes;
    return this;
  }

   /**
   * Get mutes
   * @return mutes
  **/
  @ApiModelProperty(value = "")
  public Href getMutes() {
    return mutes;
  }

  public void setMutes(Href mutes) {
    this.mutes = mutes;
  }

  public Server artifactsUrl(String artifactsUrl) {
    this.artifactsUrl = artifactsUrl;
    return this;
  }

   /**
   * Get artifactsUrl
   * @return artifactsUrl
  **/
  @ApiModelProperty(value = "")
  public String getArtifactsUrl() {
    return artifactsUrl;
  }

  public void setArtifactsUrl(String artifactsUrl) {
    this.artifactsUrl = artifactsUrl;
  }

  public Server nodes(Href nodes) {
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(value = "")
  public Href getNodes() {
    return nodes;
  }

  public void setNodes(Href nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Server server = (Server) o;
    return Objects.equals(this.version, server.version) &&
        Objects.equals(this.versionMajor, server.versionMajor) &&
        Objects.equals(this.versionMinor, server.versionMinor) &&
        Objects.equals(this.startTime, server.startTime) &&
        Objects.equals(this.currentTime, server.currentTime) &&
        Objects.equals(this.buildNumber, server.buildNumber) &&
        Objects.equals(this.buildDate, server.buildDate) &&
        Objects.equals(this.internalId, server.internalId) &&
        Objects.equals(this.role, server.role) &&
        Objects.equals(this.webUrl, server.webUrl) &&
        Objects.equals(this.projects, server.projects) &&
        Objects.equals(this.vcsRoots, server.vcsRoots) &&
        Objects.equals(this.builds, server.builds) &&
        Objects.equals(this.users, server.users) &&
        Objects.equals(this.userGroups, server.userGroups) &&
        Objects.equals(this.agents, server.agents) &&
        Objects.equals(this.buildQueue, server.buildQueue) &&
        Objects.equals(this.agentPools, server.agentPools) &&
        Objects.equals(this.investigations, server.investigations) &&
        Objects.equals(this.mutes, server.mutes) &&
        Objects.equals(this.artifactsUrl, server.artifactsUrl) &&
        Objects.equals(this.nodes, server.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, versionMajor, versionMinor, startTime, currentTime, buildNumber, buildDate, internalId, role, webUrl, projects, vcsRoots, builds, users, userGroups, agents, buildQueue, agentPools, investigations, mutes, artifactsUrl, nodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Server {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionMajor: ").append(toIndentedString(versionMajor)).append("\n");
    sb.append("    versionMinor: ").append(toIndentedString(versionMinor)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    vcsRoots: ").append(toIndentedString(vcsRoots)).append("\n");
    sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    buildQueue: ").append(toIndentedString(buildQueue)).append("\n");
    sb.append("    agentPools: ").append(toIndentedString(agentPools)).append("\n");
    sb.append("    investigations: ").append(toIndentedString(investigations)).append("\n");
    sb.append("    mutes: ").append(toIndentedString(mutes)).append("\n");
    sb.append("    artifactsUrl: ").append(toIndentedString(artifactsUrl)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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

