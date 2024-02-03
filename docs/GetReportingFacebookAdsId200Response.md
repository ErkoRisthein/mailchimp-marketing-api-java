

# GetReportingFacebookAdsId200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID of an Outreach |  [optional] |
|**webId** | **Integer** | Web ID |  [optional] |
|**name** | **String** | Title or name of an Outreach |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Supported Campaign, Ad, Page type |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Campaign, Ad, or Page status |  [optional] |
|**showReport** | **Boolean** | Outreach report availability |  [optional] |
|**createTime** | **OffsetDateTime** |  |  [optional] |
|**startTime** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**canceledAt** | **OffsetDateTime** |  |  [optional] |
|**publishedTime** | **OffsetDateTime** |  |  [optional] |
|**hasSegment** | **Boolean** |  |  [optional] |
|**reportSummary** | [**GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummary**](GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfReportSummary.md) |  |  [optional] |
|**recipients** | [**List10**](List10.md) |  |  [optional] |
|**thumbnail** | **String** | The URL of the thumbnail for this outreach |  [optional] |
|**emailSourceName** | **String** |  |  [optional] |
|**pausedAt** | **OffsetDateTime** |  |  [optional] |
|**endTime** | **OffsetDateTime** |  |  [optional] |
|**needsAttention** | **Boolean** |  |  [optional] |
|**wasCanceledByFacebook** | **Boolean** |  |  [optional] |
|**channel** | [**GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel**](GetAllFacebookAds200ResponseFacebookAdsInnerAllOfChannel.md) |  |  [optional] |
|**audience** | [**GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudience**](GetAllFacebookAds200ResponseFacebookAdsInnerAllOfAudience.md) |  |  [optional] |
|**budget** | [**GetAllFacebookAds200ResponseFacebookAdsInnerAllOfBudget**](GetAllFacebookAds200ResponseFacebookAdsInnerAllOfBudget.md) |  |  [optional] |
|**audienceActivity** | [**GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity**](GetReportingFacebookAds200ResponseFacebookAdsInnerAllOfAudienceActivity.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;regular&quot; |
| PLAINTEXT | &quot;plaintext&quot; |
| RSS | &quot;rss&quot; |
| RECONFIRM | &quot;reconfirm&quot; |
| VARIATE | &quot;variate&quot; |
| ABSPLIT | &quot;absplit&quot; |
| AUTOMATION | &quot;automation&quot; |
| FACEBOOK | &quot;facebook&quot; |
| GOOGLE | &quot;google&quot; |
| AUTORESPONDER | &quot;autoresponder&quot; |
| TRANSACTIONAL | &quot;transactional&quot; |
| PAGE | &quot;page&quot; |
| WEBSITE | &quot;website&quot; |
| SURVEY | &quot;survey&quot; |



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
| ACTIVE | &quot;active&quot; |
| DISCONNECTED | &quot;disconnected&quot; |
| SOMEPAUSED | &quot;somepaused&quot; |
| DRAFT | &quot;draft&quot; |
| COMPLETED | &quot;completed&quot; |
| PARTIALREJECTED | &quot;partialRejected&quot; |
| PENDING | &quot;pending&quot; |
| REJECTED | &quot;rejected&quot; |
| PUBLISHED | &quot;published&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |



