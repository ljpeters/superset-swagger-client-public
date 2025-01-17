/*
 * Superset
 * Superset
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package at.mic.superset.swagger.client;

import at.mic.superset.swagger.ApiException;
import at.mic.superset.swagger.client.model.InlineResponse2008;
import at.mic.superset.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AsyncEventsRestApiApi
 */
@Ignore
public class AsyncEventsRestApiApiTest {

    private final AsyncEventsRestApiApi api = new AsyncEventsRestApiApi();

    /**
     * 
     *
     * Reads off of the Redis events stream, using the user&#x27;s JWT token and optional query params for last event received.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1AsyncEventGetTest() throws ApiException {
        String lastId = null;
        InlineResponse2008 response = api.apiV1AsyncEventGet(lastId);

        // TODO: test validations
    }
}
