

# Campaign

A summary of an individual campaign's settings and content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies this campaign. |  [optional] [readonly] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. View this campaign in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/campaigns/show/?id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**parentCampaignId** | **String** | If this campaign is the child of another campaign, this identifies the parent campaign. For Example, for RSS or Automation children. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | There are four types of [campaigns](https://mailchimp.com/help/getting-started-with-campaigns/) you can create in Mailchimp. A/B Split campaigns have been deprecated and variate campaigns should be used instead. |  [optional] |
|**createTime** | **OffsetDateTime** | The date and time the campaign was created in ISO 8601 format. |  [optional] [readonly] |
|**archiveUrl** | **String** | The link to the campaign&#39;s archive version in ISO 8601 format. |  [optional] [readonly] |
|**longArchiveUrl** | **String** | The original link to the campaign&#39;s archive version. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the campaign. |  [optional] [readonly] |
|**emailsSent** | **Integer** | The total number of emails sent for this campaign. |  [optional] [readonly] |
|**sendTime** | **OffsetDateTime** | The date and time a campaign was sent. |  [optional] [readonly] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | How the campaign&#39;s content is put together. |  [optional] |
|**needsBlockRefresh** | **Boolean** | Determines if the campaign needs its blocks refreshed by opening the web-based campaign editor. Deprecated and will always return false. |  [optional] [readonly] |
|**resendable** | **Boolean** | Determines if the campaign qualifies to be resent to non-openers. |  [optional] [readonly] |
|**recipients** | [**List3**](List3.md) |  |  [optional] |
|**settings** | [**CampaignSettings2**](CampaignSettings2.md) |  |  [optional] |
|**variateSettings** | [**ABTestOptions**](ABTestOptions.md) |  |  [optional] |
|**tracking** | [**CampaignTrackingOptions1**](CampaignTrackingOptions1.md) |  |  [optional] |
|**rssOpts** | [**RSSOptions**](RSSOptions.md) |  |  [optional] |
|**abSplitOpts** | [**ABTestingOptions**](ABTestingOptions.md) |  |  [optional] |
|**socialCard** | [**CampaignSocialCard**](CampaignSocialCard.md) |  |  [optional] |
|**reportSummary** | [**CampaignReportSummary2**](CampaignReportSummary2.md) |  |  [optional] |
|**deliveryStatus** | [**CampaignDeliveryStatus**](CampaignDeliveryStatus.md) |  |  [optional] |
|**resendShortcutEligibility** | [**ResendShortcutEligibility**](ResendShortcutEligibility.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;regular&quot; |
| PLAINTEXT | &quot;plaintext&quot; |
| ABSPLIT | &quot;absplit&quot; |
| RSS | &quot;rss&quot; |
| VARIATE | &quot;variate&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SAVE | &quot;save&quot; |
| PAUSED | &quot;paused&quot; |
| SCHEDULE | &quot;schedule&quot; |
| SENDING | &quot;sending&quot; |
| SENT | &quot;sent&quot; |
| CANCELED | &quot;canceled&quot; |
| CANCELING | &quot;canceling&quot; |
| ARCHIVED | &quot;archived&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| TEMPLATE | &quot;template&quot; |
| HTML | &quot;html&quot; |
| URL | &quot;url&quot; |
| MULTICHANNEL | &quot;multichannel&quot; |



