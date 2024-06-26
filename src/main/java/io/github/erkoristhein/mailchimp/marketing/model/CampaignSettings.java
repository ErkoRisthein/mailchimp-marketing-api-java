/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.55
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Settings for the campaign including the email subject, from name, and from email address.
 */
@JsonPropertyOrder({
  CampaignSettings.JSON_PROPERTY_SUBJECT_LINE,
  CampaignSettings.JSON_PROPERTY_PREVIEW_TEXT,
  CampaignSettings.JSON_PROPERTY_TITLE,
  CampaignSettings.JSON_PROPERTY_FROM_NAME,
  CampaignSettings.JSON_PROPERTY_REPLY_TO,
  CampaignSettings.JSON_PROPERTY_AUTHENTICATE,
  CampaignSettings.JSON_PROPERTY_AUTO_FOOTER,
  CampaignSettings.JSON_PROPERTY_INLINE_CSS,
  CampaignSettings.JSON_PROPERTY_AUTO_TWEET,
  CampaignSettings.JSON_PROPERTY_AUTO_FB_POST,
  CampaignSettings.JSON_PROPERTY_FB_COMMENTS,
  CampaignSettings.JSON_PROPERTY_TEMPLATE_ID,
  CampaignSettings.JSON_PROPERTY_DRAG_AND_DROP
})
@JsonTypeName("Campaign_Settings")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class CampaignSettings {
  public static final String JSON_PROPERTY_SUBJECT_LINE = "subject_line";
  private String subjectLine;

  public static final String JSON_PROPERTY_PREVIEW_TEXT = "preview_text";
  private String previewText;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_FROM_NAME = "from_name";
  private String fromName;

  public static final String JSON_PROPERTY_REPLY_TO = "reply_to";
  private String replyTo;

  public static final String JSON_PROPERTY_AUTHENTICATE = "authenticate";
  private Boolean authenticate;

  public static final String JSON_PROPERTY_AUTO_FOOTER = "auto_footer";
  private Boolean autoFooter;

  public static final String JSON_PROPERTY_INLINE_CSS = "inline_css";
  private Boolean inlineCss;

  public static final String JSON_PROPERTY_AUTO_TWEET = "auto_tweet";
  private Boolean autoTweet;

  public static final String JSON_PROPERTY_AUTO_FB_POST = "auto_fb_post";
  private List<String> autoFbPost = new ArrayList<>();

  public static final String JSON_PROPERTY_FB_COMMENTS = "fb_comments";
  private Boolean fbComments;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private Integer templateId;

  public static final String JSON_PROPERTY_DRAG_AND_DROP = "drag_and_drop";
  private Boolean dragAndDrop;

  public CampaignSettings() {
  }

  @JsonCreator
  public CampaignSettings(
    @JsonProperty(JSON_PROPERTY_DRAG_AND_DROP) Boolean dragAndDrop
  ) {
    this();
    this.dragAndDrop = dragAndDrop;
  }

  public CampaignSettings subjectLine(String subjectLine) {
    
    this.subjectLine = subjectLine;
    return this;
  }

   /**
   * The subject line for the campaign.
   * @return subjectLine
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubjectLine() {
    return subjectLine;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectLine(String subjectLine) {
    this.subjectLine = subjectLine;
  }


  public CampaignSettings previewText(String previewText) {
    
    this.previewText = previewText;
    return this;
  }

   /**
   * The preview text for the campaign.
   * @return previewText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIEW_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviewText() {
    return previewText;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewText(String previewText) {
    this.previewText = previewText;
  }


  public CampaignSettings title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the campaign.
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public CampaignSettings fromName(String fromName) {
    
    this.fromName = fromName;
    return this;
  }

   /**
   * The &#39;from&#39; name on the campaign (not an email address).
   * @return fromName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromName() {
    return fromName;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }


  public CampaignSettings replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * The reply-to email address for the campaign.
   * @return replyTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplyTo() {
    return replyTo;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public CampaignSettings authenticate(Boolean authenticate) {
    
    this.authenticate = authenticate;
    return this;
  }

   /**
   * Whether Mailchimp [authenticated](https://mailchimp.com/help/about-email-authentication/) the campaign. Defaults to &#x60;true&#x60;.
   * @return authenticate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthenticate() {
    return authenticate;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticate(Boolean authenticate) {
    this.authenticate = authenticate;
  }


  public CampaignSettings autoFooter(Boolean autoFooter) {
    
    this.autoFooter = autoFooter;
    return this;
  }

   /**
   * Automatically append Mailchimp&#39;s [default footer](https://mailchimp.com/help/about-campaign-footers/) to the campaign.
   * @return autoFooter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_FOOTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoFooter() {
    return autoFooter;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_FOOTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoFooter(Boolean autoFooter) {
    this.autoFooter = autoFooter;
  }


  public CampaignSettings inlineCss(Boolean inlineCss) {
    
    this.inlineCss = inlineCss;
    return this;
  }

   /**
   * Automatically inline the CSS included with the campaign content.
   * @return inlineCss
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INLINE_CSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInlineCss() {
    return inlineCss;
  }


  @JsonProperty(JSON_PROPERTY_INLINE_CSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInlineCss(Boolean inlineCss) {
    this.inlineCss = inlineCss;
  }


  public CampaignSettings autoTweet(Boolean autoTweet) {
    
    this.autoTweet = autoTweet;
    return this;
  }

   /**
   * Automatically tweet a link to the [campaign archive](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) page when the campaign is sent.
   * @return autoTweet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_TWEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoTweet() {
    return autoTweet;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TWEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTweet(Boolean autoTweet) {
    this.autoTweet = autoTweet;
  }


  public CampaignSettings autoFbPost(List<String> autoFbPost) {
    
    this.autoFbPost = autoFbPost;
    return this;
  }

  public CampaignSettings addAutoFbPostItem(String autoFbPostItem) {
    if (this.autoFbPost == null) {
      this.autoFbPost = new ArrayList<>();
    }
    this.autoFbPost.add(autoFbPostItem);
    return this;
  }

   /**
   * An array of [Facebook](https://mailchimp.com/help/connect-or-disconnect-the-facebook-integration/) page ids to auto-post to.
   * @return autoFbPost
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_FB_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAutoFbPost() {
    return autoFbPost;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_FB_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoFbPost(List<String> autoFbPost) {
    this.autoFbPost = autoFbPost;
  }


  public CampaignSettings fbComments(Boolean fbComments) {
    
    this.fbComments = fbComments;
    return this;
  }

   /**
   * Allows Facebook comments on the campaign (also force-enables the Campaign Archive toolbar). Defaults to &#x60;true&#x60;.
   * @return fbComments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FB_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFbComments() {
    return fbComments;
  }


  @JsonProperty(JSON_PROPERTY_FB_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFbComments(Boolean fbComments) {
    this.fbComments = fbComments;
  }


  public CampaignSettings templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The id for the template used in this campaign.
   * @return templateId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


   /**
   * Whether the campaign uses the drag-and-drop editor.
   * @return dragAndDrop
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAG_AND_DROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDragAndDrop() {
    return dragAndDrop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSettings campaignSettings = (CampaignSettings) o;
    return Objects.equals(this.subjectLine, campaignSettings.subjectLine) &&
        Objects.equals(this.previewText, campaignSettings.previewText) &&
        Objects.equals(this.title, campaignSettings.title) &&
        Objects.equals(this.fromName, campaignSettings.fromName) &&
        Objects.equals(this.replyTo, campaignSettings.replyTo) &&
        Objects.equals(this.authenticate, campaignSettings.authenticate) &&
        Objects.equals(this.autoFooter, campaignSettings.autoFooter) &&
        Objects.equals(this.inlineCss, campaignSettings.inlineCss) &&
        Objects.equals(this.autoTweet, campaignSettings.autoTweet) &&
        Objects.equals(this.autoFbPost, campaignSettings.autoFbPost) &&
        Objects.equals(this.fbComments, campaignSettings.fbComments) &&
        Objects.equals(this.templateId, campaignSettings.templateId) &&
        Objects.equals(this.dragAndDrop, campaignSettings.dragAndDrop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectLine, previewText, title, fromName, replyTo, authenticate, autoFooter, inlineCss, autoTweet, autoFbPost, fbComments, templateId, dragAndDrop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettings {\n");
    sb.append("    subjectLine: ").append(toIndentedString(subjectLine)).append("\n");
    sb.append("    previewText: ").append(toIndentedString(previewText)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    authenticate: ").append(toIndentedString(authenticate)).append("\n");
    sb.append("    autoFooter: ").append(toIndentedString(autoFooter)).append("\n");
    sb.append("    inlineCss: ").append(toIndentedString(inlineCss)).append("\n");
    sb.append("    autoTweet: ").append(toIndentedString(autoTweet)).append("\n");
    sb.append("    autoFbPost: ").append(toIndentedString(autoFbPost)).append("\n");
    sb.append("    fbComments: ").append(toIndentedString(fbComments)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    dragAndDrop: ").append(toIndentedString(dragAndDrop)).append("\n");
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

