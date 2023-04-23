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
 * Broadcast result
 */
@ApiModel(description = "Broadcast result")
@JsonPropertyOrder({
  BroadcastResult.JSON_PROPERTY_TXID,
  BroadcastResult.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("BroadcastResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:27:34.116402+09:00[Asia/Tokyo]")
public class BroadcastResult {
  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;


  public BroadcastResult txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * return txid if broadcast success
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return txid if broadcast success")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public BroadcastResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * return messages if broadcast failed
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return messages if broadcast failed")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastResult broadcastResult = (BroadcastResult) o;
    return Objects.equals(this.txid, broadcastResult.txid) &&
        Objects.equals(this.message, broadcastResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastResult {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

