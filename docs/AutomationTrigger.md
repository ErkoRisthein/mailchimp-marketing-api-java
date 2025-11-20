

# AutomationTrigger

Available triggers for Automation workflows.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowType** | [**WorkflowTypeEnum**](#WorkflowTypeEnum) | The type of Automation workflow. |  |
|**workflowTitle** | **String** | The title of the workflow type. |  [optional] [readonly] |
|**runtime** | [**AutomationWorkflowRuntimeSettings**](AutomationWorkflowRuntimeSettings.md) |  |  [optional] |
|**workflowEmailsCount** | **Integer** | The number of emails in the Automation workflow. |  [optional] [readonly] |



## Enum: WorkflowTypeEnum

| Name | Value |
|---- | -----|
| ABANDONED_BROWSE | &quot;abandonedBrowse&quot; |
| ABANDONED_CART | &quot;abandonedCart&quot; |
| API | &quot;api&quot; |
| BEST_CUSTOMERS | &quot;bestCustomers&quot; |
| CATEGORY_FOLLOWUP | &quot;categoryFollowup&quot; |
| DATE_ADDED | &quot;dateAdded&quot; |
| EMAIL_FOLLOWUP | &quot;emailFollowup&quot; |
| EMAIL_SERIES | &quot;emailSeries&quot; |
| GROUP_ADD | &quot;groupAdd&quot; |
| GROUP_REMOVE | &quot;groupRemove&quot; |
| MANDRILL | &quot;mandrill&quot; |
| PRODUCT_FOLLOWUP | &quot;productFollowup&quot; |
| PURCHASE_FOLLOWUP | &quot;purchaseFollowup&quot; |
| RECURRING_EVENT | &quot;recurringEvent&quot; |
| SPECIAL_EVENT | &quot;specialEvent&quot; |
| VISIT_URL | &quot;visitUrl&quot; |
| WELCOME_SERIES | &quot;welcomeSeries&quot; |



