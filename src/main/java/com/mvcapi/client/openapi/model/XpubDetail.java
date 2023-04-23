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


package com.mvcapi.client.openapi.model;

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
 * Registered Xpub detail
 */
@ApiModel(description = "Registered Xpub detail")
@JsonPropertyOrder({
  XpubDetail.JSON_PROPERTY_XPUB,
  XpubDetail.JSON_PROPERTY_RECEIVE_INDEX,
  XpubDetail.JSON_PROPERTY_MAX_RECEIVE_INDEX,
  XpubDetail.JSON_PROPERTY_CHANGE_INDEX,
  XpubDetail.JSON_PROPERTY_MAX_CHANGE_INDEX,
  XpubDetail.JSON_PROPERTY_MODE,
  XpubDetail.JSON_PROPERTY_SKIP_HEIGHT,
  XpubDetail.JSON_PROPERTY_PROCESS_HEIGHT
})
@JsonTypeName("XpubDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:24:34.240678+09:00[Asia/Tokyo]")
public class XpubDetail {
  public static final String JSON_PROPERTY_XPUB = "xpub";
  private String xpub;

  public static final String JSON_PROPERTY_RECEIVE_INDEX = "receiveIndex";
  private Integer receiveIndex;

  public static final String JSON_PROPERTY_MAX_RECEIVE_INDEX = "maxReceiveIndex";
  private Integer maxReceiveIndex;

  public static final String JSON_PROPERTY_CHANGE_INDEX = "changeIndex";
  private Integer changeIndex;

  public static final String JSON_PROPERTY_MAX_CHANGE_INDEX = "maxChangeIndex";
  private Integer maxChangeIndex;

  public static final String JSON_PROPERTY_MODE = "mode";
  private Integer mode;

  public static final String JSON_PROPERTY_SKIP_HEIGHT = "skipHeight";
  private Long skipHeight;

  public static final String JSON_PROPERTY_PROCESS_HEIGHT = "processHeight";
  private Long processHeight;


  public XpubDetail xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * String encoded extended pubkey (xpub)
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String encoded extended pubkey (xpub)")
  @JsonProperty(JSON_PROPERTY_XPUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubDetail receiveIndex(Integer receiveIndex) {
    
    this.receiveIndex = receiveIndex;
    return this;
  }

   /**
   * Next unused receive index, path /0/index
   * @return receiveIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next unused receive index, path /0/index")
  @JsonProperty(JSON_PROPERTY_RECEIVE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReceiveIndex() {
    return receiveIndex;
  }


  public void setReceiveIndex(Integer receiveIndex) {
    this.receiveIndex = receiveIndex;
  }


  public XpubDetail maxReceiveIndex(Integer maxReceiveIndex) {
    
    this.maxReceiveIndex = maxReceiveIndex;
    return this;
  }

   /**
   * Max lookahead receive index.
   * @return maxReceiveIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max lookahead receive index.")
  @JsonProperty(JSON_PROPERTY_MAX_RECEIVE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxReceiveIndex() {
    return maxReceiveIndex;
  }


  public void setMaxReceiveIndex(Integer maxReceiveIndex) {
    this.maxReceiveIndex = maxReceiveIndex;
  }


  public XpubDetail changeIndex(Integer changeIndex) {
    
    this.changeIndex = changeIndex;
    return this;
  }

   /**
   * Next unused change index, path /1/index
   * @return changeIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next unused change index, path /1/index")
  @JsonProperty(JSON_PROPERTY_CHANGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChangeIndex() {
    return changeIndex;
  }


  public void setChangeIndex(Integer changeIndex) {
    this.changeIndex = changeIndex;
  }


  public XpubDetail maxChangeIndex(Integer maxChangeIndex) {
    
    this.maxChangeIndex = maxChangeIndex;
    return this;
  }

   /**
   * Max lookahead change index.
   * @return maxChangeIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max lookahead change index.")
  @JsonProperty(JSON_PROPERTY_MAX_CHANGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxChangeIndex() {
    return maxChangeIndex;
  }


  public void setMaxChangeIndex(Integer maxChangeIndex) {
    this.maxChangeIndex = maxChangeIndex;
  }


  public XpubDetail mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Current xpub process mode, 0 means preparing(not ready), 1 means synchronizing(ready)
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current xpub process mode, 0 means preparing(not ready), 1 means synchronizing(ready)")
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public XpubDetail skipHeight(Long skipHeight) {
    
    this.skipHeight = skipHeight;
    return this;
  }

   /**
   * Skip blocks before skipHeight while searching transactions. This will speed up sync time.
   * @return skipHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip blocks before skipHeight while searching transactions. This will speed up sync time.")
  @JsonProperty(JSON_PROPERTY_SKIP_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSkipHeight() {
    return skipHeight;
  }


  public void setSkipHeight(Long skipHeight) {
    this.skipHeight = skipHeight;
  }


  public XpubDetail processHeight(Long processHeight) {
    
    this.processHeight = processHeight;
    return this;
  }

   /**
   * Xpub current processed height.
   * @return processHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Xpub current processed height.")
  @JsonProperty(JSON_PROPERTY_PROCESS_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProcessHeight() {
    return processHeight;
  }


  public void setProcessHeight(Long processHeight) {
    this.processHeight = processHeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubDetail xpubDetail = (XpubDetail) o;
    return Objects.equals(this.xpub, xpubDetail.xpub) &&
        Objects.equals(this.receiveIndex, xpubDetail.receiveIndex) &&
        Objects.equals(this.maxReceiveIndex, xpubDetail.maxReceiveIndex) &&
        Objects.equals(this.changeIndex, xpubDetail.changeIndex) &&
        Objects.equals(this.maxChangeIndex, xpubDetail.maxChangeIndex) &&
        Objects.equals(this.mode, xpubDetail.mode) &&
        Objects.equals(this.skipHeight, xpubDetail.skipHeight) &&
        Objects.equals(this.processHeight, xpubDetail.processHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, receiveIndex, maxReceiveIndex, changeIndex, maxChangeIndex, mode, skipHeight, processHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubDetail {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    receiveIndex: ").append(toIndentedString(receiveIndex)).append("\n");
    sb.append("    maxReceiveIndex: ").append(toIndentedString(maxReceiveIndex)).append("\n");
    sb.append("    changeIndex: ").append(toIndentedString(changeIndex)).append("\n");
    sb.append("    maxChangeIndex: ").append(toIndentedString(maxChangeIndex)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    skipHeight: ").append(toIndentedString(skipHeight)).append("\n");
    sb.append("    processHeight: ").append(toIndentedString(processHeight)).append("\n");
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

