package io.pld.simulacion.mx.client.api;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.pld.simulacion.mx.client.ApiClient;
import io.pld.simulacion.mx.client.ApiException;
import io.pld.simulacion.mx.client.model.Peticion;
import io.pld.simulacion.mx.client.model.Respuesta;


public class PldApiTest {
	
	private Logger logger = LoggerFactory.getLogger(PldApi.class.getName());
	private final PldApi api = new PldApi();
	private ApiClient apiClient = null;
	private static final String xApiKey = "your_api_key";
	private static final String urlApi = "the_url";
	
	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(PldApiTest.urlApi);
	}
	
	@Test
	public void getPLDTest() throws ApiException {
		try {
			Peticion body = new Peticion();
			body.setNombres("JUAN");
			body.setApellidoPaterno("PRUEBA");
			body.setApellidoMaterno("CUATRO");
			Respuesta response = api.getPLD(PldApiTest.xApiKey, body);
			assertNotNull(response);
			logger.info(response.toString());
		}catch (ApiException e) {
			logger.error(e.getMessage());
		}
		
	}

}
