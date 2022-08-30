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

import at.mic.superset.swagger.ApiCallback;
import at.mic.superset.swagger.ApiClient;
import at.mic.superset.swagger.ApiException;
import at.mic.superset.swagger.ApiResponse;
import at.mic.superset.swagger.Configuration;
import at.mic.superset.swagger.Pair;
import at.mic.superset.swagger.ProgressRequestBody;
import at.mic.superset.swagger.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;
import at.mic.superset.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportexportApi {
    private ApiClient apiClient;

    public ImportexportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportexportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apiV1AssetsExportGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1AssetsExportGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/assets/export/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1AssetsExportGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiV1AssetsExportGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Returns a ZIP file with all the Superset assets (databases, datasets, charts, dashboards, saved queries) as YAML files.
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File apiV1AssetsExportGet() throws ApiException {
        ApiResponse<File> resp = apiV1AssetsExportGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Returns a ZIP file with all the Superset assets (databases, datasets, charts, dashboards, saved queries) as YAML files.
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> apiV1AssetsExportGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = apiV1AssetsExportGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a ZIP file with all the Superset assets (databases, datasets, charts, dashboards, saved queries) as YAML files.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1AssetsExportGetAsync(final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1AssetsExportGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV1AssetsImportPost
     * @param bundle  (required)
     * @param passwords  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1AssetsImportPostCall(File bundle, String passwords, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/assets/import/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (bundle != null)
        localVarFormParams.put("bundle", bundle);
        if (passwords != null)
        localVarFormParams.put("passwords", passwords);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1AssetsImportPostValidateBeforeCall(File bundle, String passwords, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'bundle' is set
        if (bundle == null) {
            throw new ApiException("Missing the required parameter 'bundle' when calling apiV1AssetsImportPost(Async)");
        }
        // verify the required parameter 'passwords' is set
        if (passwords == null) {
            throw new ApiException("Missing the required parameter 'passwords' when calling apiV1AssetsImportPost(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1AssetsImportPostCall(bundle, passwords, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param bundle  (required)
     * @param passwords  (required)
     * @return InlineResponse400
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse400 apiV1AssetsImportPost(File bundle, String passwords) throws ApiException {
        ApiResponse<InlineResponse400> resp = apiV1AssetsImportPostWithHttpInfo(bundle, passwords);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param bundle  (required)
     * @param passwords  (required)
     * @return ApiResponse&lt;InlineResponse400&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse400> apiV1AssetsImportPostWithHttpInfo(File bundle, String passwords) throws ApiException {
        com.squareup.okhttp.Call call = apiV1AssetsImportPostValidateBeforeCall(bundle, passwords, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse400>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param bundle  (required)
     * @param passwords  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1AssetsImportPostAsync(File bundle, String passwords, final ApiCallback<InlineResponse400> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1AssetsImportPostValidateBeforeCall(bundle, passwords, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse400>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}