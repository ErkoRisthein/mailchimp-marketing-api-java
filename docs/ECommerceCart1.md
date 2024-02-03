

# ECommerceCart1

Information about a specific cart.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the cart. |  |
|**customer** | [**ECommerceCustomer1**](ECommerceCustomer1.md) |  |  |
|**campaignId** | **String** | A string that uniquely identifies the campaign for a cart. |  [optional] |
|**checkoutUrl** | **String** | The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations. |  [optional] |
|**currencyCode** | **String** | The three-letter ISO 4217 code for the currency that the cart uses. |  |
|**orderTotal** | **BigDecimal** | The order total for the cart. |  |
|**taxTotal** | **BigDecimal** | The total tax for the cart. |  [optional] |
|**lines** | [**List&lt;ECommerceCartLineItem1&gt;**](ECommerceCartLineItem1.md) | An array of the cart&#39;s line items. |  |



