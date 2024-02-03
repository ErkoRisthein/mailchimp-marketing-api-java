

# ECommerceProduct1

Information about a specific product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the product. |  |
|**title** | **String** | The title of a product. |  |
|**handle** | **String** | The handle of a product. |  [optional] |
|**url** | **String** | The URL for a product. |  [optional] |
|**description** | **String** | The description of a product. |  [optional] |
|**type** | **String** | The type of product. |  [optional] |
|**vendor** | **String** | The vendor for a product. |  [optional] |
|**imageUrl** | **String** | The image URL for a product. |  [optional] |
|**variants** | [**List&lt;ECommerceProductVariant1&gt;**](ECommerceProductVariant1.md) | An array of the product&#39;s variants. At least one variant is required for each product. A variant can use the same &#x60;id&#x60; and &#x60;title&#x60; as the parent product. |  |
|**images** | [**List&lt;ECommerceProductImage1&gt;**](ECommerceProductImage1.md) | An array of the product&#39;s images. |  [optional] |
|**publishedAtForeign** | **OffsetDateTime** | The date and time the product was published. |  [optional] |



