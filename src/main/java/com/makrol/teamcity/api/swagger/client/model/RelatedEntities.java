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
import com.makrol.teamcity.api.swagger.client.model.RelatedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of RelatedEntity entities.
 */
@ApiModel(description = "Represents a list of RelatedEntity entities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-14T01:07:21.722+03:00")
public class RelatedEntities {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("entity")
  private List<RelatedEntity> entity = null;

  public RelatedEntities count(Integer count) {
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

  public RelatedEntities entity(List<RelatedEntity> entity) {
    this.entity = entity;
    return this;
  }

  public RelatedEntities addEntityItem(RelatedEntity entityItem) {
    if (this.entity == null) {
      this.entity = new ArrayList<RelatedEntity>();
    }
    this.entity.add(entityItem);
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(value = "")
  public List<RelatedEntity> getEntity() {
    return entity;
  }

  public void setEntity(List<RelatedEntity> entity) {
    this.entity = entity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedEntities relatedEntities = (RelatedEntities) o;
    return Objects.equals(this.count, relatedEntities.count) &&
        Objects.equals(this.entity, relatedEntities.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, entity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedEntities {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
