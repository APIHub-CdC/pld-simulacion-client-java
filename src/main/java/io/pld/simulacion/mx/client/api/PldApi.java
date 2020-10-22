package io.pld.simulacion.mx.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.pld.simulacion.mx.client.ApiClient;
import io.pld.simulacion.mx.client.ApiException;
import io.pld.simulacion.mx.client.ApiResponse;
import io.pld.simulacion.mx.client.Configuration;
import io.pld.simulacion.mx.client.Pair;
import io.pld.simulacion.mx.client.ProgressRequestBody;
import io.pld.simulacion.mx.client.ProgressResponseBody;
import io.pld.simulacion.mx.client.model.Peticion;
import io.pld.simulacion.mx.client.model.Respuesta;

public class PldApi {
	private ApiClient apiClient;

	public PldApi() {
		this(Configuration.getDefaultApiClient());
	}

	public PldApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public okhttp3.Call getPLDCall(String xApiKey, Peticion body,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;
		String localVarPath = "";
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getPLDValidateBeforeCall(String xApiKey, Peticion body,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling getPLD(Async)");
		}
		if (body == null) {
			throw new ApiException("Missing the required parameter 'body' when calling getPLD(Async)");
		}

		okhttp3.Call call = getPLDCall(xApiKey, body, progressListener, progressRequestListener);
		return call;
	}

	public Respuesta getPLD(String xApiKey, Peticion body) throws ApiException {
		ApiResponse<Respuesta> resp = getPLDWithHttpInfo(xApiKey, body);
		return resp.getData();
	}

	public ApiResponse<Respuesta> getPLDWithHttpInfo(String xApiKey, Peticion body) throws ApiException {
		okhttp3.Call call = getPLDValidateBeforeCall(xApiKey, body, null, null);
		Type localVarReturnType = new TypeToken<Respuesta>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}
}
