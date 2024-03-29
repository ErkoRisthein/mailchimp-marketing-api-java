

# SegmentOptions

An object representing all segmentation options.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**savedSegmentId** | **Integer** | The id for an existing saved segment. |  [optional] |
|**match** | [**MatchEnum**](#MatchEnum) | Segment match type. |  [optional] |
|**conditions** | **List&lt;Object&gt;** | Segment match conditions. There are multiple possible types, see the [condition types documentation](https://mailchimp.com/developer/marketing/docs/alternative-schemas/#segment-condition-schemas). |  [optional] |



## Enum: MatchEnum

| Name | Value |
|---- | -----|
| ANY | &quot;any&quot; |
| ALL | &quot;all&quot; |



