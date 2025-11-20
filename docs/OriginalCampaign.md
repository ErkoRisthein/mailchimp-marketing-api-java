

# OriginalCampaign

The original campaign that was resent.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID for the resent campaign. |  [optional] [readonly] |
|**webId** | **Integer** | The ID for the resent campaign used in the Mailchimp web application. View this campaign in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/campaigns/show/?id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**title** | **String** | The title of the original campaign. |  [optional] [readonly] |
|**shortcutType** | [**ShortcutTypeEnum**](#ShortcutTypeEnum) | Which campaign resend shortcut was used. |  [optional] [readonly] |



## Enum: ShortcutTypeEnum

| Name | Value |
|---- | -----|
| NON_OPENERS | &quot;non_openers&quot; |
| NEW_SUBSCRIBERS | &quot;new_subscribers&quot; |
| NON_CLICKERS | &quot;non_clickers&quot; |
| NON_PURCHASERS | &quot;non_purchasers&quot; |



