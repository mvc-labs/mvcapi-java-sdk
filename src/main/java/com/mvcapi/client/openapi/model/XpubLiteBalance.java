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
 * Balance for xpub lite wallet
 */
@ApiModel(description = "Balance for xpub lite wallet")
@JsonPropertyOrder({
  XpubLiteBalance.JSON_PROPERTY_BALANCE
})
@JsonTypeName("XpubLiteBalance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:24:34.240678+09:00[Asia/Tokyo]")
public class XpubLiteBalance {
  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Long balance;


  public XpubLiteBalance balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * confirmed balance plus unconfirmed balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "confirmed balance plus unconfirmed balance")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubLiteBalance xpubLiteBalance = (XpubLiteBalance) o;
    return Objects.equals(this.balance, xpubLiteBalance.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubLiteBalance {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

