/*
 * MetaSV for MVC API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 3.0.4
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.mvc.client.openapi.api;

import com.metasv.mvc.client.openapi.model.AddressBalance;
import com.metasv.mvc.client.openapi.model.AddressTx;
import com.metasv.mvc.client.openapi.model.AddressUtxo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressApi
 */
@Ignore
public class AddressApiTest {

    private final AddressApi api = new AddressApi();

    
    /**
     * Get address balance by specific address.
     *
     * 
     */
    @Test
    public void addressAddressBalanceGetTest()  {
        String address = null;
        AddressBalance response = api.addressAddressBalanceGet(address).block();

        // TODO: test validations
    }
    
    /**
     * Get address history by specific address(recent 10 days available).
     *
     * 
     */
    @Test
    public void addressAddressTxGetTest()  {
        String address = null;
        String flag = null;
        Boolean confirmed = null;
        List<AddressTx> response = api.addressAddressTxGet(address, flag, confirmed).collectList().block();

        // TODO: test validations
    }
    
    /**
     * Get address utxos by specific address(100 per page).
     *
     * 
     */
    @Test
    public void addressAddressUtxoGetTest()  {
        String address = null;
        String flag = null;
        List<AddressUtxo> response = api.addressAddressUtxoGet(address, flag).collectList().block();

        // TODO: test validations
    }
    
}
