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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The settings for your campaign, including subject, from name, reply-to address, and more.
 */
@JsonPropertyOrder({
  CampaignSettings3.JSON_PROPERTY_SUBJECT_LINE,
  CampaignSettings3.JSON_PROPERTY_PREVIEW_TEXT,
  CampaignSettings3.JSON_PROPERTY_TITLE,
  CampaignSettings3.JSON_PROPERTY_FROM_NAME,
  CampaignSettings3.JSON_PROPERTY_REPLY_TO,
  CampaignSettings3.JSON_PROPERTY_USE_CONVERSATION,
  CampaignSettings3.JSON_PROPERTY_TO_NAME,
  CampaignSettings3.JSON_PROPERTY_FOLDER_ID,
  CampaignSettings3.JSON_PROPERTY_AUTHENTICATE,
  CampaignSettings3.JSON_PROPERTY_AUTO_FOOTER,
  CampaignSettings3.JSON_PROPERTY_INLINE_CSS,
  CampaignSettings3.JSON_PROPERTY_AUTO_TWEET,
  CampaignSettings3.JSON_PROPERTY_AUTO_FB_POST,
  CampaignSettings3.JSON_PROPERTY_FB_COMMENTS,
  CampaignSettings3.JSON_PROPERTY_TEMPLATE_ID
})
@JsonTypeName("Campaign_Settings_3")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class CampaignSettings3 {
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

  public static final String JSON_PROPERTY_USE_CONVERSATION = "use_conversation";
  private Boolean useConversation;

  public static final String JSON_PROPERTY_TO_NAME = "to_name";
  private String toName;

  public static final String JSON_PROPERTY_FOLDER_ID = "folder_id";
  private String folderId;

  public static final String JSON_PROPERTY_AUTHENTICATE = "authenticate";
  private Boolean authenticate;

  public static final String JSON_PROPERTY_AUTO_FOOTER = "auto_footer";
  private Boolean autoFooter;

  public static final String JSON_PROPERTY_INLINE_CSS = "inline_css";
  private Boolean inlineCss;

  public static final String JSON_PROPERTY_AUTO_TWEET = "auto_tweet";
  private Boolean autoTweet;

  public static final String JSON_PROPERTY_AUTO_FB_POST = "auto_fb_post";
  private List<String> autoFbPost;

  public static final String JSON_PROPERTY_FB_COMMENTS = "fb_comments";
  private Boolean fbComments;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private Integer templateId;

  public CampaignSettings3() {
  }

  public CampaignSettings3 subjectLine(String subjectLine) {
    
    this.subjectLine = subjectLine;
    return this;
  }

   /**
   * The subject line for the campaign.
   * @return subjectLine
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 previewText(String previewText) {
    
    this.previewText = previewText;
    return this;
  }

   /**
   * The preview text for the campaign.
   * @return previewText
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the campaign.
   * @return title
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 fromName(String fromName) {
    
    this.fromName = fromName;
    return this;
  }

   /**
   * The &#39;from&#39; name on the campaign (not an email address).
   * @return fromName
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * The reply-to email address for the campaign. Note: while this field is not required for campaign creation, it is required for sending.
   * @return replyTo
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 useConversation(Boolean useConversation) {
    
    this.useConversation = useConversation;
    return this;
  }

   /**
   * Use Mailchimp Conversation feature to manage out-of-office replies.
   * @return useConversation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseConversation() {
    return useConversation;
  }


  @JsonProperty(JSON_PROPERTY_USE_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseConversation(Boolean useConversation) {
    this.useConversation = useConversation;
  }


  public CampaignSettings3 toName(String toName) {
    
    this.toName = toName;
    return this;
  }

   /**
   * The campaign&#39;s custom &#39;To&#39; name. Typically the first name [audience field](https://mailchimp.com/help/getting-started-with-merge-tags/).
   * @return toName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToName() {
    return toName;
  }


  @JsonProperty(JSON_PROPERTY_TO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToName(String toName) {
    this.toName = toName;
  }


  public CampaignSettings3 folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * If the campaign is listed in a folder, the id for that folder.
   * @return folderId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFolderId() {
    return folderId;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public CampaignSettings3 authenticate(Boolean authenticate) {
    
    this.authenticate = authenticate;
    return this;
  }

   /**
   * Whether Mailchimp [authenticated](https://mailchimp.com/help/about-email-authentication/) the campaign. Defaults to &#x60;true&#x60;.
   * @return authenticate
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 autoFooter(Boolean autoFooter) {
    
    this.autoFooter = autoFooter;
    return this;
  }

   /**
   * Automatically append Mailchimp&#39;s [default footer](https://mailchimp.com/help/about-campaign-footers/) to the campaign.
   * @return autoFooter
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 inlineCss(Boolean inlineCss) {
    
    this.inlineCss = inlineCss;
    return this;
  }

   /**
   * Automatically inline the CSS included with the campaign content.
   * @return inlineCss
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 autoTweet(Boolean autoTweet) {
    
    this.autoTweet = autoTweet;
    return this;
  }

   /**
   * Automatically tweet a link to the [campaign archive](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) page when the campaign is sent.
   * @return autoTweet
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 autoFbPost(List<String> autoFbPost) {
    
    this.autoFbPost = autoFbPost;
    return this;
  }

  public CampaignSettings3 addAutoFbPostItem(String autoFbPostItem) {
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
  @javax.annotation.Nullable
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


  public CampaignSettings3 fbComments(Boolean fbComments) {
    
    this.fbComments = fbComments;
    return this;
  }

   /**
   * Allows Facebook comments on the campaign (also force-enables the Campaign Archive toolbar). Defaults to &#x60;true&#x60;.
   * @return fbComments
  **/
  @javax.annotation.Nullable
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


  public CampaignSettings3 templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The id of the template to use.
   * @return templateId
  **/
  @javax.annotation.Nullable
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSettings3 campaignSettings3 = (CampaignSettings3) o;
    return Objects.equals(this.subjectLine, campaignSettings3.subjectLine) &&
        Objects.equals(this.previewText, campaignSettings3.previewText) &&
        Objects.equals(this.title, campaignSettings3.title) &&
        Objects.equals(this.fromName, campaignSettings3.fromName) &&
        Objects.equals(this.replyTo, campaignSettings3.replyTo) &&
        Objects.equals(this.useConversation, campaignSettings3.useConversation) &&
        Objects.equals(this.toName, campaignSettings3.toName) &&
        Objects.equals(this.folderId, campaignSettings3.folderId) &&
        Objects.equals(this.authenticate, campaignSettings3.authenticate) &&
        Objects.equals(this.autoFooter, campaignSettings3.autoFooter) &&
        Objects.equals(this.inlineCss, campaignSettings3.inlineCss) &&
        Objects.equals(this.autoTweet, campaignSettings3.autoTweet) &&
        Objects.equals(this.autoFbPost, campaignSettings3.autoFbPost) &&
        Objects.equals(this.fbComments, campaignSettings3.fbComments) &&
        Objects.equals(this.templateId, campaignSettings3.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectLine, previewText, title, fromName, replyTo, useConversation, toName, folderId, authenticate, autoFooter, inlineCss, autoTweet, autoFbPost, fbComments, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettings3 {\n");
    sb.append("    subjectLine: ").append(toIndentedString(subjectLine)).append("\n");
    sb.append("    previewText: ").append(toIndentedString(previewText)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    useConversation: ").append(toIndentedString(useConversation)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    authenticate: ").append(toIndentedString(authenticate)).append("\n");
    sb.append("    autoFooter: ").append(toIndentedString(autoFooter)).append("\n");
    sb.append("    inlineCss: ").append(toIndentedString(inlineCss)).append("\n");
    sb.append("    autoTweet: ").append(toIndentedString(autoTweet)).append("\n");
    sb.append("    autoFbPost: ").append(toIndentedString(autoFbPost)).append("\n");
    sb.append("    fbComments: ").append(toIndentedString(fbComments)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
