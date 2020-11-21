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
import at.mic.superset.swagger.client.model.GetListSchema;
import at.mic.superset.swagger.client.model.InlineResponse20010;
import at.mic.superset.swagger.client.model.InlineResponse20011;
import at.mic.superset.swagger.client.model.InlineResponse20012;
import at.mic.superset.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatabaseApi
 */
@Ignore
public class DatabaseApiTest {

    private final DatabaseApi api = new DatabaseApi();

    /**
     * 
     *
     * Get a list of models
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void databaseGetTest() throws ApiException {
        GetListSchema q = null;
        InlineResponse20010 response = api.databaseGet(q);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get database select star for table
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void databasePkSelectStarTableNameGetTest() throws ApiException {
        Integer pk = null;
        String tableName = null;
        String schemaName = null;
        InlineResponse20011 response = api.databasePkSelectStarTableNameGet(pk, tableName, schemaName);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get database select star for table
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void databasePkSelectStarTableNameSchemaNameGetTest() throws ApiException {
        Integer pk = null;
        String tableName = null;
        String schemaName = null;
        InlineResponse20011 response = api.databasePkSelectStarTableNameSchemaNameGet(pk, tableName, schemaName);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get database table metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void databasePkTableTableNameSchemaNameGetTest() throws ApiException {
        Integer pk = null;
        String tableName = null;
        String schemaName = null;
        InlineResponse20012 response = api.databasePkTableTableNameSchemaNameGet(pk, tableName, schemaName);

        // TODO: test validations
    }
}