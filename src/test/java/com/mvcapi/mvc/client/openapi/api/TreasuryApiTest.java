/*
 * MicrovisionChain API Document
 * API definition for MicrovisionChain provided apis
 *
 * The version of the OpenAPI document: 3.0.8
 * Contact: heqiming@mvcapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mvcapi.mvc.client.openapi.api;

import com.mvcapi.mvc.client.openapi.model.TreasuryHistory;
import com.mvcapi.mvc.client.openapi.model.TreasuryInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TreasuryApi
 */
@Ignore
public class TreasuryApiTest {

    private final TreasuryApi api = new TreasuryApi();

    
    /**
     * Get current treasury info.
     *
     * 
     */
    @Test
    public void treasuryGetTest()  {
        TreasuryInfo response = api.treasuryGet().block();

        // TODO: test validations
    }
    
    /**
     * Get all treasury history.
     *
     * 
     */
    @Test
    public void treasuryHistoryGetTest()  {
        List<TreasuryHistory> response = api.treasuryHistoryGet().collectList().block();

        // TODO: test validations
    }
    
}
