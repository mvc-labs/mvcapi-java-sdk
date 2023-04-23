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
 * This field is only present in case of double spent transaction and contains transactions we collided with
 */
@ApiModel(description = "This field is only present in case of double spent transaction and contains transactions we collided with")
@JsonPropertyOrder({
  InvalidBroadcastCollide.JSON_PROPERTY_TXID,
  InvalidBroadcastCollide.JSON_PROPERTY_SIZE,
  InvalidBroadcastCollide.JSON_PROPERTY_HEX
})
@JsonTypeName("InvalidBroadcastCollide")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:22:43.491832+09:00[Asia/Tokyo]")
public class InvalidBroadcastCollide {
  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_HEX = "hex";
  private String hex;


  public InvalidBroadcastCollide txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * The transaction id
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction id")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public InvalidBroadcastCollide size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Transaction size in bytes
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction size in bytes")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public InvalidBroadcastCollide hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Whole transaction in hex
   * @return hex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whole transaction in hex")
  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidBroadcastCollide invalidBroadcastCollide = (InvalidBroadcastCollide) o;
    return Objects.equals(this.txid, invalidBroadcastCollide.txid) &&
        Objects.equals(this.size, invalidBroadcastCollide.size) &&
        Objects.equals(this.hex, invalidBroadcastCollide.hex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, size, hex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidBroadcastCollide {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
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

