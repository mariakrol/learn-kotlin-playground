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
 * Represents a locator string for filtering Build entities.
 */
@ApiModel(description = "Represents a locator string for filtering Build entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class BuildLocator {
  @SerializedName("affectedProject")
  private String affectedProject = null;

  @SerializedName("agent")
  private String agent = null;

  @SerializedName("agentTypeId")
  private Integer agentTypeId = null;

  @SerializedName("any")
  private Boolean any = null;

  @SerializedName("artifactDependency")
  private String artifactDependency = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("buildType")
  private String buildType = null;

  @SerializedName("canceled")
  private Boolean canceled = null;

  @SerializedName("compatibleAgent")
  private String compatibleAgent = null;

  @SerializedName("composite")
  private Boolean composite = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("defaultFilter")
  private Boolean defaultFilter = null;

  @SerializedName("failedToStart")
  private Boolean failedToStart = null;

  @SerializedName("finishDate")
  private String finishDate = null;

  @SerializedName("finished")
  private Boolean finished = null;

  @SerializedName("hanging")
  private Boolean hanging = null;

  @SerializedName("history")
  private Boolean history = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("item")
  private String item = null;

  @SerializedName("lookupLimit")
  private Integer lookupLimit = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("personal")
  private Boolean personal = null;

  @SerializedName("pinned")
  private Boolean pinned = null;

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

  @SerializedName("queued")
  private Boolean queued = null;

  @SerializedName("queuedDate")
  private String queuedDate = null;

  @SerializedName("revision")
  private String revision = null;

  @SerializedName("running")
  private Boolean running = null;

  @SerializedName("snapshotDependency")
  private String snapshotDependency = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("startDate")
  private String startDate = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    QUEUED("queued"),
    
    RUNNING("running"),
    
    FINISHED("finished"),
    
    ANY("any");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("taskId")
  private Integer taskId = null;

  @SerializedName("user")
  private String user = null;

  public BuildLocator affectedProject(String affectedProject) {
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

  public BuildLocator agent(String agent) {
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

  public BuildLocator agentTypeId(Integer agentTypeId) {
    this.agentTypeId = agentTypeId;
    return this;
  }

   /**
   * typeId of agent used to execute build.
   * @return agentTypeId
  **/
  @ApiModelProperty(value = "typeId of agent used to execute build.")
  public Integer getAgentTypeId() {
    return agentTypeId;
  }

  public void setAgentTypeId(Integer agentTypeId) {
    this.agentTypeId = agentTypeId;
  }

  public BuildLocator any(Boolean any) {
    this.any = any;
    return this;
  }

   /**
   * State can be any.
   * @return any
  **/
  @ApiModelProperty(value = "State can be any.")
  public Boolean isAny() {
    return any;
  }

  public void setAny(Boolean any) {
    this.any = any;
  }

  public BuildLocator artifactDependency(String artifactDependency) {
    this.artifactDependency = artifactDependency;
    return this;
  }

   /**
   * Get artifactDependency
   * @return artifactDependency
  **/
  @ApiModelProperty(value = "")
  public String getArtifactDependency() {
    return artifactDependency;
  }

  public void setArtifactDependency(String artifactDependency) {
    this.artifactDependency = artifactDependency;
  }

  public BuildLocator branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Branch locator.
   * @return branch
  **/
  @ApiModelProperty(value = "Branch locator.")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public BuildLocator buildType(String buildType) {
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

  public BuildLocator canceled(Boolean canceled) {
    this.canceled = canceled;
    return this;
  }

   /**
   * Is canceled.
   * @return canceled
  **/
  @ApiModelProperty(value = "Is canceled.")
  public Boolean isCanceled() {
    return canceled;
  }

  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  public BuildLocator compatibleAgent(String compatibleAgent) {
    this.compatibleAgent = compatibleAgent;
    return this;
  }

   /**
   * Agent locator.
   * @return compatibleAgent
  **/
  @ApiModelProperty(value = "Agent locator.")
  public String getCompatibleAgent() {
    return compatibleAgent;
  }

  public void setCompatibleAgent(String compatibleAgent) {
    this.compatibleAgent = compatibleAgent;
  }

  public BuildLocator composite(Boolean composite) {
    this.composite = composite;
    return this;
  }

   /**
   * Is composite.
   * @return composite
  **/
  @ApiModelProperty(value = "Is composite.")
  public Boolean isComposite() {
    return composite;
  }

  public void setComposite(Boolean composite) {
    this.composite = composite;
  }

  public BuildLocator count(Integer count) {
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

  public BuildLocator defaultFilter(Boolean defaultFilter) {
    this.defaultFilter = defaultFilter;
    return this;
  }

   /**
   * If true, applies default filter which returns only \&quot;normal\&quot; builds (finished builds which are not canceled, not failed-to-start, not personal, and on default branch (in branched build configurations)).
   * @return defaultFilter
  **/
  @ApiModelProperty(value = "If true, applies default filter which returns only \"normal\" builds (finished builds which are not canceled, not failed-to-start, not personal, and on default branch (in branched build configurations)).")
  public Boolean isDefaultFilter() {
    return defaultFilter;
  }

  public void setDefaultFilter(Boolean defaultFilter) {
    this.defaultFilter = defaultFilter;
  }

  public BuildLocator failedToStart(Boolean failedToStart) {
    this.failedToStart = failedToStart;
    return this;
  }

   /**
   * Is failed to start.
   * @return failedToStart
  **/
  @ApiModelProperty(value = "Is failed to start.")
  public Boolean isFailedToStart() {
    return failedToStart;
  }

  public void setFailedToStart(Boolean failedToStart) {
    this.failedToStart = failedToStart;
  }

  public BuildLocator finishDate(String finishDate) {
    this.finishDate = finishDate;
    return this;
  }

   /**
   * Requires either date or build dimension.
   * @return finishDate
  **/
  @ApiModelProperty(value = "Requires either date or build dimension.")
  public String getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(String finishDate) {
    this.finishDate = finishDate;
  }

  public BuildLocator finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Is finished.
   * @return finished
  **/
  @ApiModelProperty(value = "Is finished.")
  public Boolean isFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public BuildLocator hanging(Boolean hanging) {
    this.hanging = hanging;
    return this;
  }

   /**
   * Is hanging.
   * @return hanging
  **/
  @ApiModelProperty(value = "Is hanging.")
  public Boolean isHanging() {
    return hanging;
  }

  public void setHanging(Boolean hanging) {
    this.hanging = hanging;
  }

  public BuildLocator history(Boolean history) {
    this.history = history;
    return this;
  }

   /**
   * Is history build.
   * @return history
  **/
  @ApiModelProperty(value = "Is history build.")
  public Boolean isHistory() {
    return history;
  }

  public void setHistory(Boolean history) {
    this.history = history;
  }

  public BuildLocator id(Integer id) {
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

  public BuildLocator item(String item) {
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

  public BuildLocator lookupLimit(Integer lookupLimit) {
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

  public BuildLocator number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public BuildLocator personal(Boolean personal) {
    this.personal = personal;
    return this;
  }

   /**
   * Is a personal build.
   * @return personal
  **/
  @ApiModelProperty(value = "Is a personal build.")
  public Boolean isPersonal() {
    return personal;
  }

  public void setPersonal(Boolean personal) {
    this.personal = personal;
  }

  public BuildLocator pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

   /**
   * Is pinned.
   * @return pinned
  **/
  @ApiModelProperty(value = "Is pinned.")
  public Boolean isPinned() {
    return pinned;
  }

  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }

  public BuildLocator project(String project) {
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

  public BuildLocator property(PropertyEnum property) {
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

  public BuildLocator queued(Boolean queued) {
    this.queued = queued;
    return this;
  }

   /**
   * Is queued.
   * @return queued
  **/
  @ApiModelProperty(value = "Is queued.")
  public Boolean isQueued() {
    return queued;
  }

  public void setQueued(Boolean queued) {
    this.queued = queued;
  }

  public BuildLocator queuedDate(String queuedDate) {
    this.queuedDate = queuedDate;
    return this;
  }

   /**
   * Requires either date or build dimension.
   * @return queuedDate
  **/
  @ApiModelProperty(value = "Requires either date or build dimension.")
  public String getQueuedDate() {
    return queuedDate;
  }

  public void setQueuedDate(String queuedDate) {
    this.queuedDate = queuedDate;
  }

  public BuildLocator revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Build revision.
   * @return revision
  **/
  @ApiModelProperty(value = "Build revision.")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public BuildLocator running(Boolean running) {
    this.running = running;
    return this;
  }

   /**
   * Is running.
   * @return running
  **/
  @ApiModelProperty(value = "Is running.")
  public Boolean isRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }

  public BuildLocator snapshotDependency(String snapshotDependency) {
    this.snapshotDependency = snapshotDependency;
    return this;
  }

   /**
   * Get snapshotDependency
   * @return snapshotDependency
  **/
  @ApiModelProperty(value = "")
  public String getSnapshotDependency() {
    return snapshotDependency;
  }

  public void setSnapshotDependency(String snapshotDependency) {
    this.snapshotDependency = snapshotDependency;
  }

  public BuildLocator start(Integer start) {
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

  public BuildLocator startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Requires either date or build dimension.
   * @return startDate
  **/
  @ApiModelProperty(value = "Requires either date or build dimension.")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public BuildLocator state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public BuildLocator status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BuildLocator tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag locator.
   * @return tag
  **/
  @ApiModelProperty(value = "Tag locator.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public BuildLocator taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * ID of a build or build promotion.
   * @return taskId
  **/
  @ApiModelProperty(value = "ID of a build or build promotion.")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  public BuildLocator user(String user) {
    this.user = user;
    return this;
  }

   /**
   * For personal builds checks the owner of the build, triggerring user in other cases.
   * @return user
  **/
  @ApiModelProperty(value = "For personal builds checks the owner of the build, triggerring user in other cases.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildLocator buildLocator = (BuildLocator) o;
    return Objects.equals(this.affectedProject, buildLocator.affectedProject) &&
        Objects.equals(this.agent, buildLocator.agent) &&
        Objects.equals(this.agentTypeId, buildLocator.agentTypeId) &&
        Objects.equals(this.any, buildLocator.any) &&
        Objects.equals(this.artifactDependency, buildLocator.artifactDependency) &&
        Objects.equals(this.branch, buildLocator.branch) &&
        Objects.equals(this.buildType, buildLocator.buildType) &&
        Objects.equals(this.canceled, buildLocator.canceled) &&
        Objects.equals(this.compatibleAgent, buildLocator.compatibleAgent) &&
        Objects.equals(this.composite, buildLocator.composite) &&
        Objects.equals(this.count, buildLocator.count) &&
        Objects.equals(this.defaultFilter, buildLocator.defaultFilter) &&
        Objects.equals(this.failedToStart, buildLocator.failedToStart) &&
        Objects.equals(this.finishDate, buildLocator.finishDate) &&
        Objects.equals(this.finished, buildLocator.finished) &&
        Objects.equals(this.hanging, buildLocator.hanging) &&
        Objects.equals(this.history, buildLocator.history) &&
        Objects.equals(this.id, buildLocator.id) &&
        Objects.equals(this.item, buildLocator.item) &&
        Objects.equals(this.lookupLimit, buildLocator.lookupLimit) &&
        Objects.equals(this.number, buildLocator.number) &&
        Objects.equals(this.personal, buildLocator.personal) &&
        Objects.equals(this.pinned, buildLocator.pinned) &&
        Objects.equals(this.project, buildLocator.project) &&
        Objects.equals(this.property, buildLocator.property) &&
        Objects.equals(this.queued, buildLocator.queued) &&
        Objects.equals(this.queuedDate, buildLocator.queuedDate) &&
        Objects.equals(this.revision, buildLocator.revision) &&
        Objects.equals(this.running, buildLocator.running) &&
        Objects.equals(this.snapshotDependency, buildLocator.snapshotDependency) &&
        Objects.equals(this.start, buildLocator.start) &&
        Objects.equals(this.startDate, buildLocator.startDate) &&
        Objects.equals(this.state, buildLocator.state) &&
        Objects.equals(this.status, buildLocator.status) &&
        Objects.equals(this.tag, buildLocator.tag) &&
        Objects.equals(this.taskId, buildLocator.taskId) &&
        Objects.equals(this.user, buildLocator.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedProject, agent, agentTypeId, any, artifactDependency, branch, buildType, canceled, compatibleAgent, composite, count, defaultFilter, failedToStart, finishDate, finished, hanging, history, id, item, lookupLimit, number, personal, pinned, project, property, queued, queuedDate, revision, running, snapshotDependency, start, startDate, state, status, tag, taskId, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildLocator {\n");
    
    sb.append("    affectedProject: ").append(toIndentedString(affectedProject)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    agentTypeId: ").append(toIndentedString(agentTypeId)).append("\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    artifactDependency: ").append(toIndentedString(artifactDependency)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    compatibleAgent: ").append(toIndentedString(compatibleAgent)).append("\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    defaultFilter: ").append(toIndentedString(defaultFilter)).append("\n");
    sb.append("    failedToStart: ").append(toIndentedString(failedToStart)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    hanging: ").append(toIndentedString(hanging)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    lookupLimit: ").append(toIndentedString(lookupLimit)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    queuedDate: ").append(toIndentedString(queuedDate)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    snapshotDependency: ").append(toIndentedString(snapshotDependency)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

