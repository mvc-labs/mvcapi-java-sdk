# OutpointApi

All URIs are relative to *https://testnet.mvcapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outpointTxidIndexGet**](OutpointApi.md#outpointTxidIndexGet) | **GET** /outpoint/{txid}/{index} | Get tx output(outpoint for vin) spent status.



## outpointTxidIndexGet

> OutputInfo outpointTxidIndexGet(txid, index)

Get tx output(outpoint for vin) spent status.

Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)

### Example

```java
// Import classes:
import com.mvcapi.client.openapi.ApiClient;
import com.mvcapi.client.openapi.ApiException;
import com.mvcapi.client.openapi.Configuration;
import com.mvcapi.client.openapi.auth.*;
import com.mvcapi.client.openapi.models.*;
import com.mvcapi.client.openapi.api.OutpointApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://testnet.mvcapi.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutpointApi apiInstance = new OutpointApi(defaultClient);
        String txid = "txid_example"; // String | The txid of the output
        Integer index = 56; // Integer | The index of the output in the tx.
        try {
            OutputInfo result = apiInstance.outpointTxidIndexGet(txid, index);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutpointApi#outpointTxidIndexGet");
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
 **txid** | **String**| The txid of the output |
 **index** | **Integer**| The index of the output in the tx. |

### Return type

[**OutputInfo**](OutputInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get outpoint success. |  -  |

