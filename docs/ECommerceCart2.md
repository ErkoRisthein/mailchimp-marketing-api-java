

# ECommerceCart2

Information about a specific cart.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**ECommerceCustomer2**](ECommerceCustomer2.md) |  |  [optional] |
|**campaignId** | **String** | A string that uniquely identifies the campaign associated with a cart. |  [optional] |
|**checkoutUrl** | **String** | The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations. |  [optional] |
|**currencyCode** | **String** | The three-letter ISO 4217 code for the currency that the cart uses. |  [optional] |
|**orderTotal** | **BigDecimal** | The order total for the cart. |  [optional] |
|**taxTotal** | **BigDecimal** | The total tax for the cart. |  [optional] |
|**lines** | [**List&lt;ECommerceCartLineItem2&gt;**](ECommerceCartLineItem2.md) | An array of the cart&#39;s line items. |  [optional] |



