

# PatchAudienceContactRequest

An instance of a contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | The subscribers detected language. |  [optional] |
|**emailChannel** | [**EmailChannelDetails2**](EmailChannelDetails2.md) |  |  [optional] |
|**smsChannel** | [**SMSChannelDetails2**](SMSChannelDetails2.md) |  |  [optional] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**tags** | **List&lt;String&gt;** | An array of tag names to add to the contact. This operation is append-only; existing tags will be preserved, and only new tags from this array will be added. |  [optional] |



