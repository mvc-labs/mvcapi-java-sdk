# MerchantApi

All URIs are relative to *https://testnet.mvcapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**merchantUtxoPost**](MerchantApi.md#merchantUtxoPost) | **POST** /merchant/utxo | Pick utxos by addresses and amount.



## merchantUtxoPost

> List&lt;AddressUtxo&gt; merchantUtxoPost(utxoPickRequest)

Pick utxos by addresses and amount.

Selects a set of Utxos with total value higher than the given amount from a given address list . In case of HD wallets, multiple addresses can be specified.

### Example

```java
// Import classes:
import com.mvcapi.client.openapi.ApiClient;
import com.mvcapi.client.openapi.ApiException;
import com.mvcapi.client.openapi.Configuration;
import com.mvcapi.client.openapi.auth.*;
import com.mvcapi.client.openapi.models.*;
import com.mvcapi.client.openapi.api.MerchantApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MerchantApi apiInstance = new MerchantApi(defaultClient);
        UtxoPickRequest utxoPickRequest = new UtxoPickRequest(); // UtxoPickRequest | 
        try {
            List<AddressUtxo> result = apiInstance.merchantUtxoPost(utxoPickRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantApi#merchantUtxoPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **utxoPickRequest** | [**UtxoPickRequest**](UtxoPickRequest.md)|  | [optional]

### Return type

[**List&lt;AddressUtxo&gt;**](AddressUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | utxo pick success |  -  |

