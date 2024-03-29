

# SubscriberList2

Information about a specific list.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the list. |  |
|**contact** | [**ListContact2**](ListContact2.md) |  |  |
|**permissionReminder** | **String** | The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list. |  |
|**useArchiveBar** | **Boolean** | Whether campaigns for this list use the [Archive Bar](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) in archives by default. |  [optional] |
|**campaignDefaults** | [**CampaignDefaults1**](CampaignDefaults1.md) |  |  |
|**notifyOnSubscribe** | **String** | The email address to send [subscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to. |  [optional] |
|**notifyOnUnsubscribe** | **String** | The email address to send [unsubscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to. |  [optional] |
|**emailTypeOption** | **Boolean** | Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to &#x60;true&#x60;, subscribers can choose whether they want to receive HTML or plain-text emails. When set to &#x60;false&#x60;, subscribers will receive HTML emails, with a plain-text alternative backup. |  |
|**doubleOptin** | **Boolean** | Whether or not to require the subscriber to confirm subscription via email. |  [optional] |
|**marketingPermissions** | **Boolean** | Whether or not the list has marketing permissions (eg. GDPR) enabled. |  [optional] |



