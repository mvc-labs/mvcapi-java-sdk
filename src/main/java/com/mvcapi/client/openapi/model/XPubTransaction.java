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
 * Xpub transaction history
 */
@ApiModel(description = "Xpub transaction history")
@JsonPropertyOrder({
  XPubTransaction.JSON_PROPERTY_XPUB,
  XPubTransaction.JSON_PROPERTY_TXID,
  XPubTransaction.JSON_PROPERTY_MAX_RECEIVE_INDEX,
  XPubTransaction.JSON_PROPERTY_MAX_CHANGE_INDEX,
  XPubTransaction.JSON_PROPERTY_INCOME,
  XPubTransaction.JSON_PROPERTY_OUTCOME,
  XPubTransaction.JSON_PROPERTY_HEIGHT,
  XPubTransaction.JSON_PROPERTY_BLOCK_INDEX,
  XPubTransaction.JSON_PROPERTY_BLOCK_TIME,
  XPubTransaction.JSON_PROPERTY_FLAG
})
@JsonTypeName("XPubTransaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:24:34.240678+09:00[Asia/Tokyo]")
public class XPubTransaction {
  public static final String JSON_PROPERTY_XPUB = "xpub";
  private String xpub;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_MAX_RECEIVE_INDEX = "maxReceiveIndex";
  private Integer maxReceiveIndex;

  public static final String JSON_PROPERTY_MAX_CHANGE_INDEX = "maxChangeIndex";
  private Integer maxChangeIndex;

  public static final String JSON_PROPERTY_INCOME = "income";
  private Long income;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private Long outcome;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_BLOCK_INDEX = "blockIndex";
  private Integer blockIndex;

  public static final String JSON_PROPERTY_BLOCK_TIME = "blockTime";
  private Long blockTime;

  public static final String JSON_PROPERTY_FLAG = "flag";
  private String flag;


  public XPubTransaction xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * query xpub
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "query xpub")
  @JsonProperty(JSON_PROPERTY_XPUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XPubTransaction txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Txid for this transaction.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Txid for this transaction.")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public XPubTransaction maxReceiveIndex(Integer maxReceiveIndex) {
    
    this.maxReceiveIndex = maxReceiveIndex;
    return this;
  }

   /**
   * Max lookahead receive index when processing this transaction.
   * @return maxReceiveIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max lookahead receive index when processing this transaction.")
  @JsonProperty(JSON_PROPERTY_MAX_RECEIVE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxReceiveIndex() {
    return maxReceiveIndex;
  }


  public void setMaxReceiveIndex(Integer maxReceiveIndex) {
    this.maxReceiveIndex = maxReceiveIndex;
  }


  public XPubTransaction maxChangeIndex(Integer maxChangeIndex) {
    
    this.maxChangeIndex = maxChangeIndex;
    return this;
  }

   /**
   * Max lookahead change index when processing this transaction.
   * @return maxChangeIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max lookahead change index when processing this transaction.")
  @JsonProperty(JSON_PROPERTY_MAX_CHANGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxChangeIndex() {
    return maxChangeIndex;
  }


  public void setMaxChangeIndex(Integer maxChangeIndex) {
    this.maxChangeIndex = maxChangeIndex;
  }


  public XPubTransaction income(Long income) {
    
    this.income = income;
    return this;
  }

   /**
   * Total received satoshis(Including all address)
   * @return income
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total received satoshis(Including all address)")
  @JsonProperty(JSON_PROPERTY_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIncome() {
    return income;
  }


  public void setIncome(Long income) {
    this.income = income;
  }


  public XPubTransaction outcome(Long outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Total spent satoshis(Including all address)
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total spent satoshis(Including all address)")
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOutcome() {
    return outcome;
  }


  public void setOutcome(Long outcome) {
    this.outcome = outcome;
  }


  public XPubTransaction height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height for this transaction. -1 for unconfirmed
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height for this transaction. -1 for unconfirmed")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public XPubTransaction blockIndex(Integer blockIndex) {
    
    this.blockIndex = blockIndex;
    return this;
  }

   /**
   * Block index for this transaction, -1 for unconfirmed
   * @return blockIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block index for this transaction, -1 for unconfirmed")
  @JsonProperty(JSON_PROPERTY_BLOCK_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBlockIndex() {
    return blockIndex;
  }


  public void setBlockIndex(Integer blockIndex) {
    this.blockIndex = blockIndex;
  }


  public XPubTransaction blockTime(Long blockTime) {
    
    this.blockTime = blockTime;
    return this;
  }

   /**
   * Block timestamp for this transaction, if unconfirmed, the time is first seen time.
   * @return blockTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block timestamp for this transaction, if unconfirmed, the time is first seen time.")
  @JsonProperty(JSON_PROPERTY_BLOCK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBlockTime() {
    return blockTime;
  }


  public void setBlockTime(Long blockTime) {
    this.blockTime = blockTime;
  }


  public XPubTransaction flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Paging flag, format blockTimestamp_blockIndex
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paging flag, format blockTimestamp_blockIndex")
  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XPubTransaction xpubTransaction = (XPubTransaction) o;
    return Objects.equals(this.xpub, xpubTransaction.xpub) &&
        Objects.equals(this.txid, xpubTransaction.txid) &&
        Objects.equals(this.maxReceiveIndex, xpubTransaction.maxReceiveIndex) &&
        Objects.equals(this.maxChangeIndex, xpubTransaction.maxChangeIndex) &&
        Objects.equals(this.income, xpubTransaction.income) &&
        Objects.equals(this.outcome, xpubTransaction.outcome) &&
        Objects.equals(this.height, xpubTransaction.height) &&
        Objects.equals(this.blockIndex, xpubTransaction.blockIndex) &&
        Objects.equals(this.blockTime, xpubTransaction.blockTime) &&
        Objects.equals(this.flag, xpubTransaction.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, txid, maxReceiveIndex, maxChangeIndex, income, outcome, height, blockIndex, blockTime, flag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XPubTransaction {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    maxReceiveIndex: ").append(toIndentedString(maxReceiveIndex)).append("\n");
    sb.append("    maxChangeIndex: ").append(toIndentedString(maxChangeIndex)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    blockIndex: ").append(toIndentedString(blockIndex)).append("\n");
    sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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

