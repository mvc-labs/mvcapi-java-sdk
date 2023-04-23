# TreasuryApi

All URIs are relative to *https://testnet.mvcapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**treasuryGet**](TreasuryApi.md#treasuryGet) | **GET** /treasury | Get current treasury info.
[**treasuryHistoryGet**](TreasuryApi.md#treasuryHistoryGet) | **GET** /treasury/history | Get all treasury history.



## treasuryGet

> TreasuryInfo treasuryGet()

Get current treasury info.

### Example

```java
// Import classes:
import com.mvcapi.client.openapi.ApiClient;
import com.mvcapi.client.openapi.ApiException;
import com.mvcapi.client.openapi.Configuration;
import com.mvcapi.client.openapi.auth.*;
import com.mvcapi.client.openapi.models.*;
import com.mvcapi.client.openapi.api.TreasuryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TreasuryApi apiInstance = new TreasuryApi(defaultClient);
        try {
            TreasuryInfo result = apiInstance.treasuryGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TreasuryApi#treasuryGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TreasuryInfo**](TreasuryInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get treasury info success. |  -  |


## treasuryHistoryGet

> List&lt;TreasuryHistory&gt; treasuryHistoryGet()

Get all treasury history.

### Example

```java
// Import classes:
import com.mvcapi.client.openapi.ApiClient;
import com.mvcapi.client.openapi.ApiException;
import com.mvcapi.client.openapi.Configuration;
import com.mvcapi.client.openapi.auth.*;
import com.mvcapi.client.openapi.models.*;
import com.mvcapi.client.openapi.api.TreasuryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TreasuryApi apiInstance = new TreasuryApi(defaultClient);
        try {
            List<TreasuryHistory> result = apiInstance.treasuryHistoryGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TreasuryApi#treasuryHistoryGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;TreasuryHistory&gt;**](TreasuryHistory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successfully get lists |  -  |

