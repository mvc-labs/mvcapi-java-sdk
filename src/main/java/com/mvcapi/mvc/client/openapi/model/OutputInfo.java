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
 * spent status and value info of the output.
 */
@ApiModel(description = "spent status and value info of the output.")
@JsonPropertyOrder({
  OutputInfo.JSON_PROPERTY_TXID,
  OutputInfo.JSON_PROPERTY_INDEX,
  OutputInfo.JSON_PROPERTY_ADDRESS,
  OutputInfo.JSON_PROPERTY_VALUE,
  OutputInfo.JSON_PROPERTY_SPENT,
  OutputInfo.JSON_PROPERTY_SPENT_TXID,
  OutputInfo.JSON_PROPERTY_SPENT_INDEX,
  OutputInfo.JSON_PROPERTY_SPENT_HEIGHT
})
@JsonTypeName("OutputInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:22:43.491832+09:00[Asia/Tokyo]")
public class OutputInfo {
  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public static final String JSON_PROPERTY_SPENT = "spent";
  private Boolean spent;

  public static final String JSON_PROPERTY_SPENT_TXID = "spentTxid";
  private String spentTxid;

  public static final String JSON_PROPERTY_SPENT_INDEX = "spentIndex";
  private Integer spentIndex;

  public static final String JSON_PROPERTY_SPENT_HEIGHT = "spentHeight";
  private Long spentHeight;


  public OutputInfo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * txid that this output is in.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid that this output is in.")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public OutputInfo index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * index of this output in the tx.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "index of this output in the tx.")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public OutputInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * parsed address of this output, empty for non standard.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "parsed address of this output, empty for non standard.")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public OutputInfo value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * value of this output
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "value of this output")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public OutputInfo spent(Boolean spent) {
    
    this.spent = spent;
    return this;
  }

   /**
   * this output is spent or not, true if spent
   * @return spent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "this output is spent or not, true if spent")
  @JsonProperty(JSON_PROPERTY_SPENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSpent() {
    return spent;
  }


  public void setSpent(Boolean spent) {
    this.spent = spent;
  }


  public OutputInfo spentTxid(String spentTxid) {
    
    this.spentTxid = spentTxid;
    return this;
  }

   /**
   * txid that spent this output
   * @return spentTxid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid that spent this output")
  @JsonProperty(JSON_PROPERTY_SPENT_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpentTxid() {
    return spentTxid;
  }


  public void setSpentTxid(String spentTxid) {
    this.spentTxid = spentTxid;
  }


  public OutputInfo spentIndex(Integer spentIndex) {
    
    this.spentIndex = spentIndex;
    return this;
  }

   /**
   * vin index of the spent tx
   * @return spentIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "vin index of the spent tx")
  @JsonProperty(JSON_PROPERTY_SPENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSpentIndex() {
    return spentIndex;
  }


  public void setSpentIndex(Integer spentIndex) {
    this.spentIndex = spentIndex;
  }


  public OutputInfo spentHeight(Long spentHeight) {
    
    this.spentHeight = spentHeight;
    return this;
  }

   /**
   * height of the spent tx(-1 if unconfirmed, 0 if unspent)
   * @return spentHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "height of the spent tx(-1 if unconfirmed, 0 if unspent)")
  @JsonProperty(JSON_PROPERTY_SPENT_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpentHeight() {
    return spentHeight;
  }


  public void setSpentHeight(Long spentHeight) {
    this.spentHeight = spentHeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputInfo outputInfo = (OutputInfo) o;
    return Objects.equals(this.txid, outputInfo.txid) &&
        Objects.equals(this.index, outputInfo.index) &&
        Objects.equals(this.address, outputInfo.address) &&
        Objects.equals(this.value, outputInfo.value) &&
        Objects.equals(this.spent, outputInfo.spent) &&
        Objects.equals(this.spentTxid, outputInfo.spentTxid) &&
        Objects.equals(this.spentIndex, outputInfo.spentIndex) &&
        Objects.equals(this.spentHeight, outputInfo.spentHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, index, address, value, spent, spentTxid, spentIndex, spentHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputInfo {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    spent: ").append(toIndentedString(spent)).append("\n");
    sb.append("    spentTxid: ").append(toIndentedString(spentTxid)).append("\n");
    sb.append("    spentIndex: ").append(toIndentedString(spentIndex)).append("\n");
    sb.append("    spentHeight: ").append(toIndentedString(spentHeight)).append("\n");
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

