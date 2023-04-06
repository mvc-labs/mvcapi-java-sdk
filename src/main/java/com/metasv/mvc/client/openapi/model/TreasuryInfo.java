/*
 * MetaSV for MVC API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 3.0.4
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.model;

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
 * current treasury utxo info
 */
@ApiModel(description = "current treasury utxo info")
@JsonPropertyOrder({
  TreasuryInfo.JSON_PROPERTY_TXID,
  TreasuryInfo.JSON_PROPERTY_INDEX,
  TreasuryInfo.JSON_PROPERTY_AMOUNT,
  TreasuryInfo.JSON_PROPERTY_HEIGHT,
  TreasuryInfo.JSON_PROPERTY_BLOCK_HASH,
  TreasuryInfo.JSON_PROPERTY_TIMESTAMP
})
@JsonTypeName("TreasuryInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-06T11:46:13.148624+09:00[Asia/Tokyo]")
public class TreasuryInfo {
  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_BLOCK_HASH = "blockHash";
  private String blockHash;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;


  public TreasuryInfo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * current treasury utxo txid
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current treasury utxo txid")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public TreasuryInfo index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * current treasury utxo index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current treasury utxo index")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public TreasuryInfo amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * current treasury amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current treasury amount")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public TreasuryInfo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * current treasury utxo height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current treasury utxo height")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public TreasuryInfo blockHash(String blockHash) {
    
    this.blockHash = blockHash;
    return this;
  }

   /**
   * current treasury utxo block hash
   * @return blockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current treasury utxo block hash")
  @JsonProperty(JSON_PROPERTY_BLOCK_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlockHash() {
    return blockHash;
  }


  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  public TreasuryInfo timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * current treasury utxo timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current treasury utxo timestamp")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreasuryInfo treasuryInfo = (TreasuryInfo) o;
    return Objects.equals(this.txid, treasuryInfo.txid) &&
        Objects.equals(this.index, treasuryInfo.index) &&
        Objects.equals(this.amount, treasuryInfo.amount) &&
        Objects.equals(this.height, treasuryInfo.height) &&
        Objects.equals(this.blockHash, treasuryInfo.blockHash) &&
        Objects.equals(this.timestamp, treasuryInfo.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, index, amount, height, blockHash, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreasuryInfo {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

