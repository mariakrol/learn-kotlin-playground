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
import com.makrol.teamcity.api.swagger.client.model.ChangeStatus;
import com.makrol.teamcity.api.swagger.client.model.Changes;
import com.makrol.teamcity.api.swagger.client.model.Commiter;
import com.makrol.teamcity.api.swagger.client.model.FileChanges;
import com.makrol.teamcity.api.swagger.client.model.Items;
import com.makrol.teamcity.api.swagger.client.model.Properties;
import com.makrol.teamcity.api.swagger.client.model.SnapshotDependencyLink;
import com.makrol.teamcity.api.swagger.client.model.User;
import com.makrol.teamcity.api.swagger.client.model.VcsRootInstance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a VCS change (commit).
 */
@ApiModel(description = "Represents a VCS change (commit).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class Change {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("internalVersion")
  private String internalVersion = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("registrationDate")
  private String registrationDate = null;

  @SerializedName("personal")
  private Boolean personal = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("snapshotDependencyLink")
  private SnapshotDependencyLink snapshotDependencyLink = null;

  @SerializedName("files")
  private FileChanges files = null;

  @SerializedName("vcsRootInstance")
  private VcsRootInstance vcsRootInstance = null;

  @SerializedName("parentChanges")
  private Changes parentChanges = null;

  @SerializedName("parentRevisions")
  private Items parentRevisions = null;

  @SerializedName("attributes")
  private Properties attributes = null;

  @SerializedName("storesProjectSettings")
  private Boolean storesProjectSettings = null;

  @SerializedName("status")
  private ChangeStatus status = null;

  @SerializedName("commiter")
  private Commiter commiter = null;

  @SerializedName("canEditComment")
  private Boolean canEditComment = null;

  @SerializedName("locator")
  private String locator = null;

  public Change id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Change version(String version) {
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

  public Change internalVersion(String internalVersion) {
    this.internalVersion = internalVersion;
    return this;
  }

   /**
   * Get internalVersion
   * @return internalVersion
  **/
  @ApiModelProperty(value = "")
  public String getInternalVersion() {
    return internalVersion;
  }

  public void setInternalVersion(String internalVersion) {
    this.internalVersion = internalVersion;
  }

  public Change username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Change date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Change registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

   /**
   * Get registrationDate
   * @return registrationDate
  **/
  @ApiModelProperty(value = "")
  public String getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }

  public Change personal(Boolean personal) {
    this.personal = personal;
    return this;
  }

   /**
   * Get personal
   * @return personal
  **/
  @ApiModelProperty(value = "")
  public Boolean isPersonal() {
    return personal;
  }

  public void setPersonal(Boolean personal) {
    this.personal = personal;
  }

  public Change href(String href) {
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

  public Change webUrl(String webUrl) {
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

  public Change comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Change user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Change type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Change snapshotDependencyLink(SnapshotDependencyLink snapshotDependencyLink) {
    this.snapshotDependencyLink = snapshotDependencyLink;
    return this;
  }

   /**
   * Get snapshotDependencyLink
   * @return snapshotDependencyLink
  **/
  @ApiModelProperty(value = "")
  public SnapshotDependencyLink getSnapshotDependencyLink() {
    return snapshotDependencyLink;
  }

  public void setSnapshotDependencyLink(SnapshotDependencyLink snapshotDependencyLink) {
    this.snapshotDependencyLink = snapshotDependencyLink;
  }

  public Change files(FileChanges files) {
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(value = "")
  public FileChanges getFiles() {
    return files;
  }

  public void setFiles(FileChanges files) {
    this.files = files;
  }

  public Change vcsRootInstance(VcsRootInstance vcsRootInstance) {
    this.vcsRootInstance = vcsRootInstance;
    return this;
  }

   /**
   * Get vcsRootInstance
   * @return vcsRootInstance
  **/
  @ApiModelProperty(value = "")
  public VcsRootInstance getVcsRootInstance() {
    return vcsRootInstance;
  }

  public void setVcsRootInstance(VcsRootInstance vcsRootInstance) {
    this.vcsRootInstance = vcsRootInstance;
  }

  public Change parentChanges(Changes parentChanges) {
    this.parentChanges = parentChanges;
    return this;
  }

   /**
   * Get parentChanges
   * @return parentChanges
  **/
  @ApiModelProperty(value = "")
  public Changes getParentChanges() {
    return parentChanges;
  }

  public void setParentChanges(Changes parentChanges) {
    this.parentChanges = parentChanges;
  }

  public Change parentRevisions(Items parentRevisions) {
    this.parentRevisions = parentRevisions;
    return this;
  }

   /**
   * Get parentRevisions
   * @return parentRevisions
  **/
  @ApiModelProperty(value = "")
  public Items getParentRevisions() {
    return parentRevisions;
  }

  public void setParentRevisions(Items parentRevisions) {
    this.parentRevisions = parentRevisions;
  }

  public Change attributes(Properties attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Properties getAttributes() {
    return attributes;
  }

  public void setAttributes(Properties attributes) {
    this.attributes = attributes;
  }

  public Change storesProjectSettings(Boolean storesProjectSettings) {
    this.storesProjectSettings = storesProjectSettings;
    return this;
  }

   /**
   * Get storesProjectSettings
   * @return storesProjectSettings
  **/
  @ApiModelProperty(value = "")
  public Boolean isStoresProjectSettings() {
    return storesProjectSettings;
  }

  public void setStoresProjectSettings(Boolean storesProjectSettings) {
    this.storesProjectSettings = storesProjectSettings;
  }

  public Change status(ChangeStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ChangeStatus getStatus() {
    return status;
  }

  public void setStatus(ChangeStatus status) {
    this.status = status;
  }

  public Change commiter(Commiter commiter) {
    this.commiter = commiter;
    return this;
  }

   /**
   * Get commiter
   * @return commiter
  **/
  @ApiModelProperty(value = "")
  public Commiter getCommiter() {
    return commiter;
  }

  public void setCommiter(Commiter commiter) {
    this.commiter = commiter;
  }

  public Change canEditComment(Boolean canEditComment) {
    this.canEditComment = canEditComment;
    return this;
  }

   /**
   * Get canEditComment
   * @return canEditComment
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanEditComment() {
    return canEditComment;
  }

  public void setCanEditComment(Boolean canEditComment) {
    this.canEditComment = canEditComment;
  }

  public Change locator(String locator) {
    this.locator = locator;
    return this;
  }

   /**
   * Get locator
   * @return locator
  **/
  @ApiModelProperty(value = "")
  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Change change = (Change) o;
    return Objects.equals(this.id, change.id) &&
        Objects.equals(this.version, change.version) &&
        Objects.equals(this.internalVersion, change.internalVersion) &&
        Objects.equals(this.username, change.username) &&
        Objects.equals(this.date, change.date) &&
        Objects.equals(this.registrationDate, change.registrationDate) &&
        Objects.equals(this.personal, change.personal) &&
        Objects.equals(this.href, change.href) &&
        Objects.equals(this.webUrl, change.webUrl) &&
        Objects.equals(this.comment, change.comment) &&
        Objects.equals(this.user, change.user) &&
        Objects.equals(this.type, change.type) &&
        Objects.equals(this.snapshotDependencyLink, change.snapshotDependencyLink) &&
        Objects.equals(this.files, change.files) &&
        Objects.equals(this.vcsRootInstance, change.vcsRootInstance) &&
        Objects.equals(this.parentChanges, change.parentChanges) &&
        Objects.equals(this.parentRevisions, change.parentRevisions) &&
        Objects.equals(this.attributes, change.attributes) &&
        Objects.equals(this.storesProjectSettings, change.storesProjectSettings) &&
        Objects.equals(this.status, change.status) &&
        Objects.equals(this.commiter, change.commiter) &&
        Objects.equals(this.canEditComment, change.canEditComment) &&
        Objects.equals(this.locator, change.locator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, internalVersion, username, date, registrationDate, personal, href, webUrl, comment, user, type, snapshotDependencyLink, files, vcsRootInstance, parentChanges, parentRevisions, attributes, storesProjectSettings, status, commiter, canEditComment, locator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Change {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    internalVersion: ").append(toIndentedString(internalVersion)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    snapshotDependencyLink: ").append(toIndentedString(snapshotDependencyLink)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    vcsRootInstance: ").append(toIndentedString(vcsRootInstance)).append("\n");
    sb.append("    parentChanges: ").append(toIndentedString(parentChanges)).append("\n");
    sb.append("    parentRevisions: ").append(toIndentedString(parentRevisions)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    storesProjectSettings: ").append(toIndentedString(storesProjectSettings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    commiter: ").append(toIndentedString(commiter)).append("\n");
    sb.append("    canEditComment: ").append(toIndentedString(canEditComment)).append("\n");
    sb.append("    locator: ").append(toIndentedString(locator)).append("\n");
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
