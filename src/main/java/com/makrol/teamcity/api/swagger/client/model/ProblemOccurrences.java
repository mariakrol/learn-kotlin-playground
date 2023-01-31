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
import com.makrol.teamcity.api.swagger.client.model.ProblemOccurrence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a paginated list of ProblemOccurrence entities.
 */
@ApiModel(description = "Represents a paginated list of ProblemOccurrence entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class ProblemOccurrences {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("nextHref")
  private String nextHref = null;

  @SerializedName("prevHref")
  private String prevHref = null;

  @SerializedName("problemOccurrence")
  private List<ProblemOccurrence> problemOccurrence = null;

  @SerializedName("passed")
  private Integer passed = null;

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("newFailed")
  private Integer newFailed = null;

  @SerializedName("ignored")
  private Integer ignored = null;

  @SerializedName("muted")
  private Integer muted = null;

  public ProblemOccurrences count(Integer count) {
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

  public ProblemOccurrences href(String href) {
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

  public ProblemOccurrences nextHref(String nextHref) {
    this.nextHref = nextHref;
    return this;
  }

   /**
   * Get nextHref
   * @return nextHref
  **/
  @ApiModelProperty(value = "")
  public String getNextHref() {
    return nextHref;
  }

  public void setNextHref(String nextHref) {
    this.nextHref = nextHref;
  }

  public ProblemOccurrences prevHref(String prevHref) {
    this.prevHref = prevHref;
    return this;
  }

   /**
   * Get prevHref
   * @return prevHref
  **/
  @ApiModelProperty(value = "")
  public String getPrevHref() {
    return prevHref;
  }

  public void setPrevHref(String prevHref) {
    this.prevHref = prevHref;
  }

  public ProblemOccurrences problemOccurrence(List<ProblemOccurrence> problemOccurrence) {
    this.problemOccurrence = problemOccurrence;
    return this;
  }

  public ProblemOccurrences addProblemOccurrenceItem(ProblemOccurrence problemOccurrenceItem) {
    if (this.problemOccurrence == null) {
      this.problemOccurrence = new ArrayList<ProblemOccurrence>();
    }
    this.problemOccurrence.add(problemOccurrenceItem);
    return this;
  }

   /**
   * Get problemOccurrence
   * @return problemOccurrence
  **/
  @ApiModelProperty(value = "")
  public List<ProblemOccurrence> getProblemOccurrence() {
    return problemOccurrence;
  }

  public void setProblemOccurrence(List<ProblemOccurrence> problemOccurrence) {
    this.problemOccurrence = problemOccurrence;
  }

  public ProblemOccurrences passed(Integer passed) {
    this.passed = passed;
    return this;
  }

   /**
   * Get passed
   * @return passed
  **/
  @ApiModelProperty(value = "")
  public Integer getPassed() {
    return passed;
  }

  public void setPassed(Integer passed) {
    this.passed = passed;
  }

  public ProblemOccurrences failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @ApiModelProperty(value = "")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public ProblemOccurrences newFailed(Integer newFailed) {
    this.newFailed = newFailed;
    return this;
  }

   /**
   * Get newFailed
   * @return newFailed
  **/
  @ApiModelProperty(value = "")
  public Integer getNewFailed() {
    return newFailed;
  }

  public void setNewFailed(Integer newFailed) {
    this.newFailed = newFailed;
  }

  public ProblemOccurrences ignored(Integer ignored) {
    this.ignored = ignored;
    return this;
  }

   /**
   * Get ignored
   * @return ignored
  **/
  @ApiModelProperty(value = "")
  public Integer getIgnored() {
    return ignored;
  }

  public void setIgnored(Integer ignored) {
    this.ignored = ignored;
  }

  public ProblemOccurrences muted(Integer muted) {
    this.muted = muted;
    return this;
  }

   /**
   * Get muted
   * @return muted
  **/
  @ApiModelProperty(value = "")
  public Integer getMuted() {
    return muted;
  }

  public void setMuted(Integer muted) {
    this.muted = muted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemOccurrences problemOccurrences = (ProblemOccurrences) o;
    return Objects.equals(this.count, problemOccurrences.count) &&
        Objects.equals(this.href, problemOccurrences.href) &&
        Objects.equals(this.nextHref, problemOccurrences.nextHref) &&
        Objects.equals(this.prevHref, problemOccurrences.prevHref) &&
        Objects.equals(this.problemOccurrence, problemOccurrences.problemOccurrence) &&
        Objects.equals(this.passed, problemOccurrences.passed) &&
        Objects.equals(this.failed, problemOccurrences.failed) &&
        Objects.equals(this.newFailed, problemOccurrences.newFailed) &&
        Objects.equals(this.ignored, problemOccurrences.ignored) &&
        Objects.equals(this.muted, problemOccurrences.muted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, href, nextHref, prevHref, problemOccurrence, passed, failed, newFailed, ignored, muted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemOccurrences {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    nextHref: ").append(toIndentedString(nextHref)).append("\n");
    sb.append("    prevHref: ").append(toIndentedString(prevHref)).append("\n");
    sb.append("    problemOccurrence: ").append(toIndentedString(problemOccurrence)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    newFailed: ").append(toIndentedString(newFailed)).append("\n");
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
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

