package testScnearios;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import MainCode.APIHelper;
import MainCode.APIRequest;
import io.restassured.response.Response;
import MainCode.APIResponse;
import org.json.*;

public class TestAPIHelper {

	/*
	 * @Test public void testResponse() { APIHelper apiRes = new APIHelper();
	 * APIRequest apiReq = new APIRequest(
	 * "https://petstore.swagger.io/v2/pet/findByStatus?status=available", "GET");
	 * 
	 * APIResponse apiResponse = apiRes.hitAPI(apiReq);
	 * 
	 * 
	 * JsonPath jsonPathEvaluator = apiResponse.getResponseBody().jsonPath(); String
	 * pet = jsonPathEvaluator.get("Lion 1");
	 * 
	 * Assert.assertEquals(apiResponse.getResponseCode(), 200,
	 * "Response Code Validation Failed");
	 * Assert.assertTrue(apiResponse.getResponseTime() <= 3000,
	 * "Response time Validation Failed");
	 * Assert.assertTrue(apiResponse.getResponseBody().isEmpty());
	 * 
	 * Assert.assertTrue(apiResponse.getResponseBody().);
	 * 
	 * Assert.assertEquals(apiResponse.getResponseBody(),
	 * 2960,"Response time Validation Failed");
	 * 
	 * 
	 * }
	 * 
	 * @Test public void testResponseCode() { APIHelper helperClass = new
	 * APIHelper(); APIRequest apiReq = new APIRequest(
	 * "https://petstore.swagger.io/v2/pet/findByStatus?status=available", "GET");
	 * 
	 * APIResponse apiResponse = helperClass.hitAPI(apiReq);
	 * 
	 * Assert.assertEquals(apiResponse.getResponseCode(), 200,
	 * "Response Code Validation Failed");
	 * 
	 * }
	 * 
	 * @Test public void verifyPendingPetsResponseCode() { APIHelper helperClass =
	 * new APIHelper(); APIRequest apiReq = new
	 * APIRequest("https://petstore.swagger.io/v2/pet/findByStatus?status=pending",
	 * "GET");
	 * 
	 * APIResponse apiResponse = helperClass.hitAPI(apiReq);
	 * 
	 * Assert.assertEquals(apiResponse.getResponseCode(), 200,
	 * "Response Code Validation Failed");
	 * 
	 * }
	 */
	@Test

	public void verifyPostAndResponseCode() {
		APIHelper helperClass = new APIHelper();
		APIRequest apiReq = new APIRequest("https://petstore.swagger.io/v2/pet", "POST");
		System.out.println(apiReq);
		
		  String json = "{\r\n" + "  \"id\": 0,\r\n" + "  \"category\": {\r\n" +
		  "    \"id\": 0,\r\n" + "    \"name\": \"string\"\r\n" + "  },\r\n" +
		  "  \"name\": \"Kunji\",\r\n" + "  \"photoUrls\": [\r\n" +
		  "    \"string\"\r\n" + "  ],\r\n" + "  \"tags\": [\r\n" + "    {\r\n" +
		  "      \"id\": 0,\r\n" + "      \"name\": \"string\"\r\n" + "    }\r\n" +
		  "  ],\r\n" + "  \"status\": \"sold\"\r\n" + "}";
		 
		
		
		APIResponse apiResponse = helperClass.hitAPI(apiReq,json);

		Assert.assertEquals(apiResponse.getResponseCode(), 200, "Response Code Validation Failed");
	

	}

}
