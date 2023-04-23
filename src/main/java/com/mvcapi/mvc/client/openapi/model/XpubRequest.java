/*
 * MicrovisionChain API Document
 * API definition for MicrovisionChain provided apis
 *
 * The version of the OpenAPI document: 3.0.8
 * Contact: heqiming@mvcapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mvcapi.mvc.client.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request object to register(or delete) a new xpub
 */
@ApiModel(description = "Request object to register(or delete) a new xpub")
@JsonPropertyOrder({
  XpubRequest.JSON_PROPERTY_XPUB,
  XpubRequest.JSON_PROPERTY_SKIP_HEIGHT,
  XpubRequest.JSON_PROPERTY_INIT_RECEIVE_INDEX,
  XpubRequest.JSON_PROPERTY_INIT_CHANGE_INDEX
})
@JsonTypeName("XpubRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:22:43.491832+09:00[Asia/Tokyo]")
public class XpubRequest {
  public static final String JSON_PROPERTY_XPUB = "xpub";
  private String xpub;

  public static final String JSON_PROPERTY_SKIP_HEIGHT = "skipHeight";
  private Long skipHeight;

  public static final String JSON_PROPERTY_INIT_RECEIVE_INDEX = "initReceiveIndex";
  private Integer initReceiveIndex;

  public static final String JSON_PROPERTY_INIT_CHANGE_INDEX = "initChangeIndex";
  private Integer initChangeIndex;


  public XpubRequest xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * The xpub to register.
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The xpub to register.")
  @JsonProperty(JSON_PROPERTY_XPUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubRequest skipHeight(Long skipHeight) {
    
    this.skipHeight = skipHeight;
    return this;
  }

   /**
   * Skip transactions before this height. Default is 0. Ignore this while deleting xpub.
   * @return skipHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip transactions before this height. Default is 0. Ignore this while deleting xpub.")
  @JsonProperty(JSON_PROPERTY_SKIP_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSkipHeight() {
    return skipHeight;
  }


  public void setSkipHeight(Long skipHeight) {
    this.skipHeight = skipHeight;
  }


  public XpubRequest initReceiveIndex(Integer initReceiveIndex) {
    
    this.initReceiveIndex = initReceiveIndex;
    return this;
  }

   /**
   * Set the init maxReceiveIndex to {initReceiveIndex}(less than 5000) before the initial crawl , default is 200. This could increase cost.
   * @return initReceiveIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the init maxReceiveIndex to {initReceiveIndex}(less than 5000) before the initial crawl , default is 200. This could increase cost.")
  @JsonProperty(JSON_PROPERTY_INIT_RECEIVE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInitReceiveIndex() {
    return initReceiveIndex;
  }


  public void setInitReceiveIndex(Integer initReceiveIndex) {
    this.initReceiveIndex = initReceiveIndex;
  }


  public XpubRequest initChangeIndex(Integer initChangeIndex) {
    
    this.initChangeIndex = initChangeIndex;
    return this;
  }

   /**
   * Set the init maxChangeIndex(less than 5000) before the initial crawl , default is 200. This could increase cost.
   * @return initChangeIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the init maxChangeIndex(less than 5000) before the initial crawl , default is 200. This could increase cost.")
  @JsonProperty(JSON_PROPERTY_INIT_CHANGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInitChangeIndex() {
    return initChangeIndex;
  }


  public void setInitChangeIndex(Integer initChangeIndex) {
    this.initChangeIndex = initChangeIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubRequest xpubRequest = (XpubRequest) o;
    return Objects.equals(this.xpub, xpubRequest.xpub) &&
        Objects.equals(this.skipHeight, xpubRequest.skipHeight) &&
        Objects.equals(this.initReceiveIndex, xpubRequest.initReceiveIndex) &&
        Objects.equals(this.initChangeIndex, xpubRequest.initChangeIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, skipHeight, initReceiveIndex, initChangeIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubRequest {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    skipHeight: ").append(toIndentedString(skipHeight)).append("\n");
    sb.append("    initReceiveIndex: ").append(toIndentedString(initReceiveIndex)).append("\n");
    sb.append("    initChangeIndex: ").append(toIndentedString(initChangeIndex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

