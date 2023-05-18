package MainCode;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIRequest {


	/*
	 * request body
	 * base url
	 * request method
	 * url  and  request type
	 */

	/*
	 * RestAssured.baseURI="https://petstore.swagger.io/v2/pet/";
	 * 
	 * RequestSpecification httpRequest = RestAssured.given();
	 * 
	 * Response response = httpRequest.request(Method.GET, "");
	 */

	String  baseUrl;;

	String  requestMethod;;

	public APIRequest(String url, String requestType) {
		this.baseUrl = url;
		this.requestMethod = requestType;
	}

	public String getBaseUrl() {
		return baseUrl;
	}


	public String getRequestMethod() {
		return requestMethod;
	}
	/*
	 * Post  method
	 *  String =request body
	 *  if  condition method  for  post ,request url  and body
	 *  
	 */


}
