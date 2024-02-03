

# AutomationWorkflow

A summary of an individual Automation workflow's settings and content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that identifies the Automation. |  [optional] [readonly] |
|**createTime** | **OffsetDateTime** | The date and time the Automation was created in ISO 8601 format. |  [optional] [readonly] |
|**startTime** | **OffsetDateTime** | The date and time the Automation was started in ISO 8601 format. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the Automation. |  [optional] [readonly] |
|**emailsSent** | **Integer** | The total number of emails sent for the Automation. |  [optional] [readonly] |
|**recipients** | [**ModelList**](ModelList.md) |  |  [optional] |
|**settings** | [**AutomationCampaignSettings**](AutomationCampaignSettings.md) |  |  [optional] |
|**tracking** | [**AutomationTrackingOptions**](AutomationTrackingOptions.md) |  |  [optional] |
|**triggerSettings** | [**AutomationTrigger**](AutomationTrigger.md) |  |  [optional] |
|**reportSummary** | [**CampaignReportSummary**](CampaignReportSummary.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SAVE | &quot;save&quot; |
| PAUSED | &quot;paused&quot; |
| SENDING | &quot;sending&quot; |



