

# SurveyQuestionReport

The details of a survey question's report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the survey question. |  [optional] [readonly] |
|**surveyId** | **String** | The unique ID of the survey. |  [optional] [readonly] |
|**query** | **String** | The query of the survey question. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The response type of the survey question. |  [optional] [readonly] |
|**totalResponses** | **Integer** | The total number of responses to this question. |  [optional] [readonly] |
|**isRequired** | **Boolean** | Whether this survey question is required to answer. |  [optional] [readonly] |
|**hasOther** | **Boolean** | Whether this survey question has an &#39;other&#39; option. |  [optional] [readonly] |
|**otherLabel** | **String** | Label used for the &#39;other&#39; option of this survey question. |  [optional] [readonly] |
|**averageRating** | **Float** | The average rating for this range question. |  [optional] [readonly] |
|**rangeLowLabel** | **String** | Label for the low end of the range. |  [optional] [readonly] |
|**rangeHighLabel** | **String** | Label for the high end of the range. |  [optional] [readonly] |
|**placeholderLabel** | **String** | Placeholder text for this survey question&#39;s answer box. |  [optional] [readonly] |
|**subscribeCheckboxEnabled** | **Boolean** | Whether the subscribe checkbox is shown for this email question. |  [optional] [readonly] |
|**subscribeCheckboxLabel** | **String** | Label used for the subscribe checkbox for this email question. |  [optional] [readonly] |
|**mergeField** | [**MergeField3**](MergeField3.md) |  |  [optional] |
|**options** | [**List&lt;OptionsInner&gt;**](OptionsInner.md) | The answer choices for this question. |  [optional] [readonly] |
|**contactCounts** | [**ContactCounts**](ContactCounts.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PICK_ONE | &quot;pickOne&quot; |
| PICK_MANY | &quot;pickMany&quot; |
| RANGE | &quot;range&quot; |
| TEXT | &quot;text&quot; |
| EMAIL | &quot;email&quot; |



