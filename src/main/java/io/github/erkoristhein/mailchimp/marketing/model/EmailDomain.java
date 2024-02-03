/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.81
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.erkoristhein.mailchimp.marketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A single email domain&#39;s performance
 */
@JsonPropertyOrder({
  EmailDomain.JSON_PROPERTY_DOMAIN,
  EmailDomain.JSON_PROPERTY_EMAILS_SENT,
  EmailDomain.JSON_PROPERTY_BOUNCES,
  EmailDomain.JSON_PROPERTY_OPENS,
  EmailDomain.JSON_PROPERTY_CLICKS,
  EmailDomain.JSON_PROPERTY_UNSUBS,
  EmailDomain.JSON_PROPERTY_DELIVERED,
  EmailDomain.JSON_PROPERTY_EMAILS_PCT,
  EmailDomain.JSON_PROPERTY_BOUNCES_PCT,
  EmailDomain.JSON_PROPERTY_OPENS_PCT,
  EmailDomain.JSON_PROPERTY_CLICKS_PCT,
  EmailDomain.JSON_PROPERTY_UNSUBS_PCT
})
@JsonTypeName("Email_Domain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class EmailDomain {
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_EMAILS_SENT = "emails_sent";
  private Integer emailsSent;

  public static final String JSON_PROPERTY_BOUNCES = "bounces";
  private Integer bounces;

  public static final String JSON_PROPERTY_OPENS = "opens";
  private Integer opens;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Integer clicks;

  public static final String JSON_PROPERTY_UNSUBS = "unsubs";
  private Integer unsubs;

  public static final String JSON_PROPERTY_DELIVERED = "delivered";
  private Integer delivered;

  public static final String JSON_PROPERTY_EMAILS_PCT = "emails_pct";
  private BigDecimal emailsPct;

  public static final String JSON_PROPERTY_BOUNCES_PCT = "bounces_pct";
  private BigDecimal bouncesPct;

  public static final String JSON_PROPERTY_OPENS_PCT = "opens_pct";
  private BigDecimal opensPct;

  public static final String JSON_PROPERTY_CLICKS_PCT = "clicks_pct";
  private BigDecimal clicksPct;

  public static final String JSON_PROPERTY_UNSUBS_PCT = "unsubs_pct";
  private BigDecimal unsubsPct;

  public EmailDomain() {
  }

  @JsonCreator
  public EmailDomain(
    @JsonProperty(JSON_PROPERTY_DOMAIN) String domain, 
    @JsonProperty(JSON_PROPERTY_EMAILS_SENT) Integer emailsSent, 
    @JsonProperty(JSON_PROPERTY_BOUNCES) Integer bounces, 
    @JsonProperty(JSON_PROPERTY_OPENS) Integer opens, 
    @JsonProperty(JSON_PROPERTY_CLICKS) Integer clicks, 
    @JsonProperty(JSON_PROPERTY_UNSUBS) Integer unsubs, 
    @JsonProperty(JSON_PROPERTY_DELIVERED) Integer delivered, 
    @JsonProperty(JSON_PROPERTY_EMAILS_PCT) BigDecimal emailsPct, 
    @JsonProperty(JSON_PROPERTY_BOUNCES_PCT) BigDecimal bouncesPct, 
    @JsonProperty(JSON_PROPERTY_OPENS_PCT) BigDecimal opensPct, 
    @JsonProperty(JSON_PROPERTY_CLICKS_PCT) BigDecimal clicksPct, 
    @JsonProperty(JSON_PROPERTY_UNSUBS_PCT) BigDecimal unsubsPct
  ) {
    this();
    this.domain = domain;
    this.emailsSent = emailsSent;
    this.bounces = bounces;
    this.opens = opens;
    this.clicks = clicks;
    this.unsubs = unsubs;
    this.delivered = delivered;
    this.emailsPct = emailsPct;
    this.bouncesPct = bouncesPct;
    this.opensPct = opensPct;
    this.clicksPct = clicksPct;
    this.unsubsPct = unsubsPct;
  }

   /**
   * The name of the domain (gmail.com, hotmail.com, yahoo.com).
   * @return domain
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }




   /**
   * The number of emails sent to that specific domain.
   * @return emailsSent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEmailsSent() {
    return emailsSent;
  }




   /**
   * The number of bounces at a domain.
   * @return bounces
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBounces() {
    return bounces;
  }




   /**
   * The number of opens for a domain.
   * @return opens
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpens() {
    return opens;
  }




   /**
   * The number of clicks for a domain.
   * @return clicks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClicks() {
    return clicks;
  }




   /**
   * The total number of unsubscribes for a domain.
   * @return unsubs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnsubs() {
    return unsubs;
  }




   /**
   * The number of successful deliveries for a domain.
   * @return delivered
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDelivered() {
    return delivered;
  }




   /**
   * The percentage of total emails that went to this domain.
   * @return emailsPct
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEmailsPct() {
    return emailsPct;
  }




   /**
   * The percentage of total bounces from this domain.
   * @return bouncesPct
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNCES_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBouncesPct() {
    return bouncesPct;
  }




   /**
   * The percentage of total opens from this domain.
   * @return opensPct
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENS_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpensPct() {
    return opensPct;
  }




   /**
   * The percentage of total clicks from this domain.
   * @return clicksPct
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICKS_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getClicksPct() {
    return clicksPct;
  }




   /**
   * The percentage of total unsubscribes from this domain.
   * @return unsubsPct
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBS_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnsubsPct() {
    return unsubsPct;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailDomain emailDomain = (EmailDomain) o;
    return Objects.equals(this.domain, emailDomain.domain) &&
        Objects.equals(this.emailsSent, emailDomain.emailsSent) &&
        Objects.equals(this.bounces, emailDomain.bounces) &&
        Objects.equals(this.opens, emailDomain.opens) &&
        Objects.equals(this.clicks, emailDomain.clicks) &&
        Objects.equals(this.unsubs, emailDomain.unsubs) &&
        Objects.equals(this.delivered, emailDomain.delivered) &&
        Objects.equals(this.emailsPct, emailDomain.emailsPct) &&
        Objects.equals(this.bouncesPct, emailDomain.bouncesPct) &&
        Objects.equals(this.opensPct, emailDomain.opensPct) &&
        Objects.equals(this.clicksPct, emailDomain.clicksPct) &&
        Objects.equals(this.unsubsPct, emailDomain.unsubsPct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, emailsSent, bounces, opens, clicks, unsubs, delivered, emailsPct, bouncesPct, opensPct, clicksPct, unsubsPct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailDomain {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    emailsSent: ").append(toIndentedString(emailsSent)).append("\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    unsubs: ").append(toIndentedString(unsubs)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    emailsPct: ").append(toIndentedString(emailsPct)).append("\n");
    sb.append("    bouncesPct: ").append(toIndentedString(bouncesPct)).append("\n");
    sb.append("    opensPct: ").append(toIndentedString(opensPct)).append("\n");
    sb.append("    clicksPct: ").append(toIndentedString(clicksPct)).append("\n");
    sb.append("    unsubsPct: ").append(toIndentedString(unsubsPct)).append("\n");
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

