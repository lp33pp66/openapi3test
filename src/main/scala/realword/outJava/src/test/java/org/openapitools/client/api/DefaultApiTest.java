/*
 * realworld api test
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: contact@example.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AuthReq;
import org.openapitools.client.model.Errors;
import org.openapitools.client.model.RegistReq;
import org.openapitools.client.model.UserRes;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * auth account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticationTest() throws ApiException {
        AuthReq authReq = null;
        UserRes response = api.authentication(authReq);

        // TODO: test validations
    }
    
    /**
     * regist
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registrationTest() throws ApiException {
        RegistReq registReq = null;
        UserRes response = api.registration(registReq);

        // TODO: test validations
    }
    
    /**
     * currentuser
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetTest() throws ApiException {
        UserRes response = api.userGet();

        // TODO: test validations
    }
    
}
