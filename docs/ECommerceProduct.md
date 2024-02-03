

# ECommerceProduct

Information about a specific product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the product. |  [optional] [readonly] |
|**currencyCode** | **String** | The currency code |  [optional] [readonly] |
|**title** | **String** | The title of a product. |  [optional] |
|**handle** | **String** | The handle of a product. |  [optional] |
|**url** | **String** | The URL for a product. |  [optional] |
|**description** | **String** | The description of a product. |  [optional] |
|**type** | **String** | The type of product. |  [optional] |
|**vendor** | **String** | The vendor for a product. |  [optional] |
|**imageUrl** | **String** | The image URL for a product. |  [optional] |
|**variants** | [**List&lt;ECommerceProductVariant&gt;**](ECommerceProductVariant.md) | Returns up to 50 of the product&#39;s variants. To retrieve all variants use [Product Variants](https://mailchimp.com/developer/marketing/api/ecommerce-product-variants/). |  [optional] |
|**images** | [**List&lt;ECommerceProductImage&gt;**](ECommerceProductImage.md) | An array of the product&#39;s images. |  [optional] |
|**publishedAtForeign** | **OffsetDateTime** | The date and time the product was published in ISO 8601 format. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



