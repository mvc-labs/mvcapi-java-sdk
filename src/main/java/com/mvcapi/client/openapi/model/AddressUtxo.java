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
 * Utxos by address(or addresses) order by height asc.
 */
@ApiModel(description = "Utxos by address(or addresses) order by height asc.")
@JsonPropertyOrder({
  AddressUtxo.JSON_PROPERTY_FLAG,
  AddressUtxo.JSON_PROPERTY_ADDRESS,
  AddressUtxo.JSON_PROPERTY_TXID,
  AddressUtxo.JSON_PROPERTY_OUT_INDEX,
  AddressUtxo.JSON_PROPERTY_VALUE,
  AddressUtxo.JSON_PROPERTY_HEIGHT
})
@JsonTypeName("AddressUtxo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:27:34.116402+09:00[Asia/Tokyo]")
public class AddressUtxo {
  public static final String JSON_PROPERTY_FLAG = "flag";
  private String flag;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_OUT_INDEX = "outIndex";
  private Integer outIndex;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;


  public AddressUtxo flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * paging flag
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "paging flag")
  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  public AddressUtxo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address of the utxo
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address of the utxo")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressUtxo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * txid of the utxo
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid of the utxo")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public AddressUtxo outIndex(Integer outIndex) {
    
    this.outIndex = outIndex;
    return this;
  }

   /**
   * output index in the tx
   * @return outIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "output index in the tx")
  @JsonProperty(JSON_PROPERTY_OUT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOutIndex() {
    return outIndex;
  }


  public void setOutIndex(Integer outIndex) {
    this.outIndex = outIndex;
  }


  public AddressUtxo value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value of the utxo
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the utxo")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public AddressUtxo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of the utxo, -1 if not confirmed
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height of the utxo, -1 if not confirmed")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressUtxo addressUtxo = (AddressUtxo) o;
    return Objects.equals(this.flag, addressUtxo.flag) &&
        Objects.equals(this.address, addressUtxo.address) &&
        Objects.equals(this.txid, addressUtxo.txid) &&
        Objects.equals(this.outIndex, addressUtxo.outIndex) &&
        Objects.equals(this.value, addressUtxo.value) &&
        Objects.equals(this.height, addressUtxo.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, address, txid, outIndex, value, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressUtxo {\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    outIndex: ").append(toIndentedString(outIndex)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

