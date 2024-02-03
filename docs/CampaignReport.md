

# CampaignReport

Report details about a sent campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies this campaign. |  [optional] |
|**campaignTitle** | **String** | The title of the campaign. |  [optional] [readonly] |
|**type** | **String** | The type of campaign (regular, plain-text, ab_split, rss, automation, variate, or auto). |  [optional] |
|**listId** | **String** | The unique list id. |  [optional] [readonly] |
|**listIsActive** | **Boolean** | The status of the list used, namely if it&#39;s deleted or disabled. |  [optional] [readonly] |
|**listName** | **String** | The name of the list. |  [optional] [readonly] |
|**subjectLine** | **String** | The subject line for the campaign. |  [optional] [readonly] |
|**previewText** | **String** | The preview text for the campaign. |  [optional] |
|**emailsSent** | **Integer** | The total number of emails sent for this campaign. |  [optional] |
|**abuseReports** | **Integer** | The number of abuse reports generated for this campaign. |  [optional] |
|**unsubscribed** | **Integer** | The total number of unsubscribed members for this campaign. |  [optional] [readonly] |
|**sendTime** | **OffsetDateTime** | The date and time a campaign was sent in ISO 8601 format. |  [optional] [readonly] |
|**rssLastSend** | **OffsetDateTime** | For RSS campaigns, the date and time of the last send in ISO 8601 format. |  [optional] [readonly] |
|**bounces** | [**Bounces**](Bounces.md) |  |  [optional] |
|**forwards** | [**Forwards**](Forwards.md) |  |  [optional] |
|**opens** | [**Opens**](Opens.md) |  |  [optional] |
|**clicks** | [**Clicks**](Clicks.md) |  |  [optional] |
|**facebookLikes** | [**FacebookLikes**](FacebookLikes.md) |  |  [optional] |
|**industryStats** | [**IndustryStats1**](IndustryStats1.md) |  |  [optional] |
|**listStats** | [**ListStats**](ListStats.md) |  |  [optional] |
|**abSplit** | [**ABSplitStats**](ABSplitStats.md) |  |  [optional] |
|**timewarp** | [**List&lt;TimewarpStatsInner&gt;**](TimewarpStatsInner.md) | An hourly breakdown of sends, opens, and clicks if a campaign is sent using timewarp. |  [optional] |
|**timeseries** | [**List&lt;TimeseriesInner&gt;**](TimeseriesInner.md) | An hourly breakdown of the performance of the campaign over the first 24 hours. |  [optional] |
|**shareReport** | [**ShareReport**](ShareReport.md) |  |  [optional] |
|**ecommerce** | [**ECommerceReport1**](ECommerceReport1.md) |  |  [optional] |
|**deliveryStatus** | [**CampaignDeliveryStatus**](CampaignDeliveryStatus.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



