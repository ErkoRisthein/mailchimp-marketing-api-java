

# ContactsInner

An instance of a contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID for the contact. |  [optional] [readonly] |
|**audienceId** | **String** | The unique ID for the audience. |  [optional] [readonly] |
|**language** | [**LanguageEnum**](#LanguageEnum) | The subscribers detected language. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of a contact. |  [optional] [readonly] |
|**emailChannel** | [**EmailChannelDetails**](EmailChannelDetails.md) |  |  [optional] |
|**smsChannel** | [**SMSChannelDetails**](SMSChannelDetails.md) |  |  [optional] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**tags** | **List&lt;String&gt;** | The tags assigned to this contact. |  [optional] |
|**source** | [**Source**](Source.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date that the contact was created. |  [optional] [readonly] |
|**lastUpdatedAt** | **OffsetDateTime** | The date that the contact was last updated. |  [optional] [readonly] |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| EN | &quot;en&quot; |
| AR | &quot;ar&quot; |
| AF | &quot;af&quot; |
| BE | &quot;be&quot; |
| BG | &quot;bg&quot; |
| CA | &quot;ca&quot; |
| ZH | &quot;zh&quot; |
| ZH_CN | &quot;zh_CN&quot; |
| HR | &quot;hr&quot; |
| CS | &quot;cs&quot; |
| DA | &quot;da&quot; |
| NL | &quot;nl&quot; |
| ET | &quot;et&quot; |
| FA | &quot;fa&quot; |
| FI | &quot;fi&quot; |
| FR | &quot;fr&quot; |
| FR_CA | &quot;fr_CA&quot; |
| DE | &quot;de&quot; |
| EL | &quot;el&quot; |
| HE | &quot;he&quot; |
| HI | &quot;hi&quot; |
| HU | &quot;hu&quot; |
| IS | &quot;is&quot; |
| ID | &quot;id&quot; |
| GA | &quot;ga&quot; |
| IT | &quot;it&quot; |
| JA | &quot;ja&quot; |
| KM | &quot;km&quot; |
| KO | &quot;ko&quot; |
| LV | &quot;lv&quot; |
| LT | &quot;lt&quot; |
| MT | &quot;mt&quot; |
| MS | &quot;ms&quot; |
| MK | &quot;mk&quot; |
| NO | &quot;no&quot; |
| PL | &quot;pl&quot; |
| PT | &quot;pt&quot; |
| PT_PT | &quot;pt_PT&quot; |
| RO | &quot;ro&quot; |
| RU | &quot;ru&quot; |
| SR | &quot;sr&quot; |
| SK | &quot;sk&quot; |
| SL | &quot;sl&quot; |
| ES | &quot;es&quot; |
| ES_ES | &quot;es_ES&quot; |
| SW | &quot;sw&quot; |
| SV | &quot;sv&quot; |
| TA | &quot;ta&quot; |
| TH | &quot;th&quot; |
| TR | &quot;tr&quot; |
| UK | &quot;uk&quot; |
| VI | &quot;vi&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| ARCHIVED | &quot;archived&quot; |



