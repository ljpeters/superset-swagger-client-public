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
import java.io.File;
import at.mic.superset.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportexportApi
 */
@Ignore
public class ImportexportApiTest {

    private final ImportexportApi api = new ImportexportApi();

    /**
     * 
     *
     * Returns a ZIP file with all the Superset assets (databases, datasets, charts, dashboards, saved queries) as YAML files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1AssetsExportGetTest() throws ApiException {
        File response = api.apiV1AssetsExportGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1AssetsImportPostTest() throws ApiException {
        File bundle = null;
        String passwords = null;
        InlineResponse400 response = api.apiV1AssetsImportPost(bundle, passwords);

        // TODO: test validations
    }
}