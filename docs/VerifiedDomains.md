

# VerifiedDomains

The verified domains currently on the account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | The name of this domain. |  [optional] [readonly] |
|**verified** | **Boolean** | Whether the domain has been verified for sending. |  [optional] [readonly] |
|**authenticated** | **Boolean** | Whether domain authentication is enabled for this domain. |  [optional] [readonly] |
|**verificationEmail** | **String** | The e-mail address receiving the two-factor challenge for this domain. |  [optional] [readonly] |
|**verificationSent** | **OffsetDateTime** | The date/time that the two-factor challenge was sent to the verification email. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The Domain&#39;s current status. |  [optional] [readonly] |
|**isFreeEmailProvider** | **Boolean** | Returns whether the domain used is a public / free email provider. See [Limitations of Free Email Addresses](https://mailchimp.com/help/limitations-of-free-email-addresses/) for more details. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VERIFICATION_IN_PROGRESS | &quot;VERIFICATION_IN_PROGRESS&quot; |
| VERIFIED | &quot;VERIFIED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| ERROR | &quot;ERROR&quot; |
| AUTHENTICATION_IN_PROGRESS | &quot;AUTHENTICATION_IN_PROGRESS&quot; |
| AUTHENTICATION_ERROR | &quot;AUTHENTICATION_ERROR&quot; |
| AUTHENTICATED | &quot;AUTHENTICATED&quot; |



