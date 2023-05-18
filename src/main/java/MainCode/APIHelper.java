package MainCode;

import com.google.gson.JsonObject;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APIHelper {

	public APIResponse hitAPI(APIRequest apiRequest,String jsonValue)
	{

		/*
		 * Response res=RestAssured.get(
		 * "https://petstore.swagger.io/v2/pet/findByStatus?status=available");
		 */
		Response res=null;

		String resUrl=apiRequest.getBaseUrl();
		if(apiRequest.getRequestMethod().equalsIgnoreCase("GET"))
		{
			res=RestAssured.get(resUrl);
		}

		if(apiRequest.getRequestMethod().equalsIgnoreCase("POST"))
		{

			res=RestAssured.given().body(jsonValue).post(resUrl);
			System.out.println("Result  "+res);
			/*
			 * res=given() .contentType(ContentType.JSON) .body(jsonValue) .when()
			 * .post(resUrl);
			 */

		}

		System.out.println(res.getBody().asString());
		System.out.println(res.getTime());
		System.out.println(res.getStatusCode());
		System.out.println(res.getSessionId()); 
		System.out.println(res.statusLine());
		System.out.println(res.getCookies());

		String  response = null;

		if (res.getBody().asString().startsWith("[")) {
			response="{\"test\":"+res.getBody().asString()+"}";

		}


		System.out.println("Convert..."+response);

		APIResponse  reponseObj=new APIResponse(response,res.getStatusCode(),res.getTime());


		return  reponseObj;

	}

	public APIResponse postAPI(APIRequest apiRequest,String jsonValue)
	{
		Response res=null;

		String resUrl=apiRequest.getBaseUrl();
		System.out.println(resUrl);
		if(apiRequest.getRequestMethod().equalsIgnoreCase("POST"))
		{
			res=given()
					.contentType(ContentType.JSON)
					.body(jsonValue)
					.when()
					.post(resUrl);

		}
		System.out.println(res);
		System.out.println(res.getBody().asString()); 
		System.out.println(res.getTime());
		System.out.println(res.getStatusCode());
		System.out.println(res.getSessionId()); 
		System.out.println(res.statusLine());
		System.out.println(res.getCookies());
		APIResponse  reponseObj=new APIResponse(res.getBody().asString(),res.getStatusCode(),res.getTime());
		return  reponseObj;

	}



}
