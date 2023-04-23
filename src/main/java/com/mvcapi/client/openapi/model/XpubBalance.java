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
 * Registered Xpub balance including confirmed and unconfirmed
 */
@ApiModel(description = "Registered Xpub balance including confirmed and unconfirmed")
@JsonPropertyOrder({
  XpubBalance.JSON_PROPERTY_CONFIRMED,
  XpubBalance.JSON_PROPERTY_UNCONFIRMED
})
@JsonTypeName("XpubBalance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T15:27:34.116402+09:00[Asia/Tokyo]")
public class XpubBalance {
  public static final String JSON_PROPERTY_CONFIRMED = "confirmed";
  private Long confirmed;

  public static final String JSON_PROPERTY_UNCONFIRMED = "unconfirmed";
  private Long unconfirmed;


  public XpubBalance confirmed(Long confirmed) {
    
    this.confirmed = confirmed;
    return this;
  }

   /**
   * confirmed balance
   * @return confirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "confirmed balance")
  @JsonProperty(JSON_PROPERTY_CONFIRMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfirmed() {
    return confirmed;
  }


  public void setConfirmed(Long confirmed) {
    this.confirmed = confirmed;
  }


  public XpubBalance unconfirmed(Long unconfirmed) {
    
    this.unconfirmed = unconfirmed;
    return this;
  }

   /**
   * unconfirmed balance
   * @return unconfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unconfirmed balance")
  @JsonProperty(JSON_PROPERTY_UNCONFIRMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUnconfirmed() {
    return unconfirmed;
  }


  public void setUnconfirmed(Long unconfirmed) {
    this.unconfirmed = unconfirmed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubBalance xpubBalance = (XpubBalance) o;
    return Objects.equals(this.confirmed, xpubBalance.confirmed) &&
        Objects.equals(this.unconfirmed, xpubBalance.unconfirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmed, unconfirmed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubBalance {\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    unconfirmed: ").append(toIndentedString(unconfirmed)).append("\n");
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

