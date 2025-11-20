

# ShortcutCampaignsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the resent campaign. |  [optional] [readonly] |
|**webId** | **Integer** | The ID for the resent campaign used in the Mailchimp web application. View this campaign in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/campaigns/show/?id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**shortcutType** | [**ShortcutTypeEnum**](#ShortcutTypeEnum) | Which campaign resend shortcut was used. |  [optional] [readonly] |
|**sendTime** | **OffsetDateTime** | The date and time a resent campaign was sent. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the campaign. |  [optional] [readonly] |



## Enum: ShortcutTypeEnum

| Name | Value |
|---- | -----|
| NON_OPENERS | &quot;non_openers&quot; |
| NEW_SUBSCRIBERS | &quot;new_subscribers&quot; |
| NON_CLICKERS | &quot;non_clickers&quot; |
| NON_PURCHASERS | &quot;non_purchasers&quot; |



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



