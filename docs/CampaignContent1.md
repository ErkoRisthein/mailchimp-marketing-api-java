

# CampaignContent1

The HTML and plain-text content for a campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**plainText** | **String** | The plain-text portion of the campaign. If left unspecified, we&#39;ll generate this automatically. |  [optional] |
|**html** | **String** | The raw HTML for the campaign. |  [optional] |
|**url** | **String** | When importing a campaign, the URL where the HTML lives. |  [optional] |
|**template** | [**TemplateContent**](TemplateContent.md) |  |  [optional] |
|**archive** | [**UploadArchive**](UploadArchive.md) |  |  [optional] |
|**variateContents** | [**List&lt;VariateContentsInner1&gt;**](VariateContentsInner1.md) | Content options for [Multivariate Campaigns](https://mailchimp.com/help/about-multivariate-campaigns/). Each content option must provide HTML content and may optionally provide plain text. For campaigns not testing content, only one object should be provided. |  [optional] |



