

# GetAudienceContactList200Response

An array of objects, each representing a contact record.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contacts** | [**List&lt;ContactsInner&gt;**](ContactsInner.md) | An array of objects, each representing a contact record. |  [optional] |
|**nextCursor** | **String** | A cursor pointing to the last item on this page of the collection. Paginate through a collection of records by setting the &#x60;cursor&#x60; parameter on a subsequent request to this value. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



