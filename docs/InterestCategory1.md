

# InterestCategory1

Interest categories organize interests, which are used to group subscribers based on their preferences. These correspond to Group Titles the application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The text description of this category. This field appears on signup forms and is often phrased as a question. |  |
|**displayOrder** | **Integer** | The order that the categories are displayed in the list. Lower numbers display first. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Determines how this category’s interests appear on signup forms. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHECKBOXES | &quot;checkboxes&quot; |
| DROPDOWN | &quot;dropdown&quot; |
| RADIO | &quot;radio&quot; |
| HIDDEN | &quot;hidden&quot; |



