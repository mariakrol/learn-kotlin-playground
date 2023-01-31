/*
 * TeamCity REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2018.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.makrol.teamcity.api.swagger.client.api;

import com.makrol.teamcity.api.swagger.client.ApiCallback;
import com.makrol.teamcity.api.swagger.client.ApiClient;
import com.makrol.teamcity.api.swagger.client.ApiException;
import com.makrol.teamcity.api.swagger.client.ApiResponse;
import com.makrol.teamcity.api.swagger.client.Configuration;
import com.makrol.teamcity.api.swagger.client.Pair;
import com.makrol.teamcity.api.swagger.client.ProgressRequestBody;
import com.makrol.teamcity.api.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.makrol.teamcity.api.swagger.client.model.ProblemOccurrence;
import com.makrol.teamcity.api.swagger.client.model.ProblemOccurrences;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProblemOccurrenceApi {
    private ApiClient apiClient;

    public ProblemOccurrenceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProblemOccurrenceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllBuildProblemOccurrences
     * @param locator  (optional)
     * @param fields  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllBuildProblemOccurrencesCall(String locator, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/app/rest/problemOccurrences";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (locator != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("locator", locator));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllBuildProblemOccurrencesValidateBeforeCall(String locator, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllBuildProblemOccurrencesCall(locator, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all build problem occurrences.
     * 
     * @param locator  (optional)
     * @param fields  (optional)
     * @return ProblemOccurrences
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProblemOccurrences getAllBuildProblemOccurrences(String locator, String fields) throws ApiException {
        ApiResponse<ProblemOccurrences> resp = getAllBuildProblemOccurrencesWithHttpInfo(locator, fields);
        return resp.getData();
    }

    /**
     * Get all build problem occurrences.
     * 
     * @param locator  (optional)
     * @param fields  (optional)
     * @return ApiResponse&lt;ProblemOccurrences&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProblemOccurrences> getAllBuildProblemOccurrencesWithHttpInfo(String locator, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getAllBuildProblemOccurrencesValidateBeforeCall(locator, fields, null, null);
        Type localVarReturnType = new TypeToken<ProblemOccurrences>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all build problem occurrences. (asynchronously)
     * 
     * @param locator  (optional)
     * @param fields  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllBuildProblemOccurrencesAsync(String locator, String fields, final ApiCallback<ProblemOccurrences> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllBuildProblemOccurrencesValidateBeforeCall(locator, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProblemOccurrences>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBuildProblemOccurrence
     * @param problemLocator  (required)
     * @param fields  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBuildProblemOccurrenceCall(String problemLocator, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/app/rest/problemOccurrences/{problemLocator}"
            .replaceAll("\\{" + "problemLocator" + "\\}", apiClient.escapeString(problemLocator.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBuildProblemOccurrenceValidateBeforeCall(String problemLocator, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'problemLocator' is set
        if (problemLocator == null) {
            throw new ApiException("Missing the required parameter 'problemLocator' when calling getBuildProblemOccurrence(Async)");
        }
        

        com.squareup.okhttp.Call call = getBuildProblemOccurrenceCall(problemLocator, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a matching build problem occurrence.
     * 
     * @param problemLocator  (required)
     * @param fields  (optional)
     * @return ProblemOccurrence
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProblemOccurrence getBuildProblemOccurrence(String problemLocator, String fields) throws ApiException {
        ApiResponse<ProblemOccurrence> resp = getBuildProblemOccurrenceWithHttpInfo(problemLocator, fields);
        return resp.getData();
    }

    /**
     * Get a matching build problem occurrence.
     * 
     * @param problemLocator  (required)
     * @param fields  (optional)
     * @return ApiResponse&lt;ProblemOccurrence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProblemOccurrence> getBuildProblemOccurrenceWithHttpInfo(String problemLocator, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getBuildProblemOccurrenceValidateBeforeCall(problemLocator, fields, null, null);
        Type localVarReturnType = new TypeToken<ProblemOccurrence>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a matching build problem occurrence. (asynchronously)
     * 
     * @param problemLocator  (required)
     * @param fields  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBuildProblemOccurrenceAsync(String problemLocator, String fields, final ApiCallback<ProblemOccurrence> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getBuildProblemOccurrenceValidateBeforeCall(problemLocator, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProblemOccurrence>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
