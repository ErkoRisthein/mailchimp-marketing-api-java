

# ECommerceOrder1

Information about a specific order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the order. |  |
|**customer** | [**ECommerceCustomer1**](ECommerceCustomer1.md) |  |  |
|**campaignId** | **String** | A string that uniquely identifies the campaign for an order. |  [optional] |
|**landingSite** | **String** | The URL for the page where the buyer landed when entering the shop. |  [optional] |
|**financialStatus** | **String** | The order status. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications). |  [optional] |
|**fulfillmentStatus** | **String** | The fulfillment status for the order. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications). |  [optional] |
|**currencyCode** | **String** | The three-letter ISO 4217 code for the currency that the store accepts. |  |
|**orderTotal** | **BigDecimal** | The total for the order. |  |
|**orderUrl** | **String** | The URL for the order. |  [optional] |
|**discountTotal** | **BigDecimal** | The total amount of the discounts to be applied to the price of the order. |  [optional] |
|**taxTotal** | **BigDecimal** | The tax total for the order. |  [optional] |
|**shippingTotal** | **BigDecimal** | The shipping total for the order. |  [optional] |
|**trackingCode** | [**TrackingCodeEnum**](#TrackingCodeEnum) | The Mailchimp tracking code for the order. Uses the &#39;mc_tc&#39; parameter in E-Commerce tracking URLs. |  [optional] |
|**processedAtForeign** | **OffsetDateTime** | The date and time the order was processed in ISO 8601 format. |  [optional] |
|**cancelledAtForeign** | **OffsetDateTime** | The date and time the order was cancelled in ISO 8601 format. Note: passing a value for this parameter will cancel the order being created. |  [optional] |
|**updatedAtForeign** | **OffsetDateTime** | The date and time the order was updated in ISO 8601 format. |  [optional] |
|**shippingAddress** | [**ShippingAddress1**](ShippingAddress1.md) |  |  [optional] |
|**billingAddress** | [**BillingAddress1**](BillingAddress1.md) |  |  [optional] |
|**promos** | [**List&lt;PromosInner1&gt;**](PromosInner1.md) | The promo codes applied on the order |  [optional] |
|**lines** | [**List&lt;ECommerceOrderLineItem1&gt;**](ECommerceOrderLineItem1.md) | An array of the order&#39;s line items. |  |
|**outreach** | [**Outreach1**](Outreach1.md) |  |  [optional] |
|**trackingNumber** | **String** | The tracking number associated with the order. |  [optional] |
|**trackingCarrier** | **String** | The tracking carrier associated with the order. |  [optional] |
|**trackingUrl** | **String** | The tracking URL associated with the order. |  [optional] |



## Enum: TrackingCodeEnum

| Name | Value |
|---- | -----|
| PREC | &quot;prec&quot; |



