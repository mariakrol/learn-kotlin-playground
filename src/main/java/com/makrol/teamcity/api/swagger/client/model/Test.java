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
import com.makrol.teamcity.api.swagger.client.model.Investigations;
import com.makrol.teamcity.api.swagger.client.model.Mutes;
import com.makrol.teamcity.api.swagger.client.model.ParsedTestName;
import com.makrol.teamcity.api.swagger.client.model.TestOccurrences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a test.
 */
@ApiModel(description = "Represents a test.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class Test {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mutes")
  private Mutes mutes = null;

  @SerializedName("investigations")
  private Investigations investigations = null;

  @SerializedName("testOccurrences")
  private TestOccurrences testOccurrences = null;

  @SerializedName("parsedTestName")
  private ParsedTestName parsedTestName = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("locator")
  private String locator = null;

  public Test id(String id) {
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

  public Test name(String name) {
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

  public Test mutes(Mutes mutes) {
    this.mutes = mutes;
    return this;
  }

   /**
   * Get mutes
   * @return mutes
  **/
  @ApiModelProperty(value = "")
  public Mutes getMutes() {
    return mutes;
  }

  public void setMutes(Mutes mutes) {
    this.mutes = mutes;
  }

  public Test investigations(Investigations investigations) {
    this.investigations = investigations;
    return this;
  }

   /**
   * Get investigations
   * @return investigations
  **/
  @ApiModelProperty(value = "")
  public Investigations getInvestigations() {
    return investigations;
  }

  public void setInvestigations(Investigations investigations) {
    this.investigations = investigations;
  }

  public Test testOccurrences(TestOccurrences testOccurrences) {
    this.testOccurrences = testOccurrences;
    return this;
  }

   /**
   * Get testOccurrences
   * @return testOccurrences
  **/
  @ApiModelProperty(value = "")
  public TestOccurrences getTestOccurrences() {
    return testOccurrences;
  }

  public void setTestOccurrences(TestOccurrences testOccurrences) {
    this.testOccurrences = testOccurrences;
  }

  public Test parsedTestName(ParsedTestName parsedTestName) {
    this.parsedTestName = parsedTestName;
    return this;
  }

   /**
   * Get parsedTestName
   * @return parsedTestName
  **/
  @ApiModelProperty(value = "")
  public ParsedTestName getParsedTestName() {
    return parsedTestName;
  }

  public void setParsedTestName(ParsedTestName parsedTestName) {
    this.parsedTestName = parsedTestName;
  }

  public Test href(String href) {
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

  public Test locator(String locator) {
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
    Test test = (Test) o;
    return Objects.equals(this.id, test.id) &&
        Objects.equals(this.name, test.name) &&
        Objects.equals(this.mutes, test.mutes) &&
        Objects.equals(this.investigations, test.investigations) &&
        Objects.equals(this.testOccurrences, test.testOccurrences) &&
        Objects.equals(this.parsedTestName, test.parsedTestName) &&
        Objects.equals(this.href, test.href) &&
        Objects.equals(this.locator, test.locator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mutes, investigations, testOccurrences, parsedTestName, href, locator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Test {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mutes: ").append(toIndentedString(mutes)).append("\n");
    sb.append("    investigations: ").append(toIndentedString(investigations)).append("\n");
    sb.append("    testOccurrences: ").append(toIndentedString(testOccurrences)).append("\n");
    sb.append("    parsedTestName: ").append(toIndentedString(parsedTestName)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

