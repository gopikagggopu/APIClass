package MainCode;

import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIResponse {

	int responseCode;
	long responseTime;
	JSONObject responseBody;
	String value;

	public int getResponseCode() {
		return responseCode;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public JSONObject getResponseBody() {
		return responseBody;
	}

	/*
	 * public APIResponse(String s,int i,long l) { JsonProcessor jsonProccessor=new
	 * JsonProcessor();
	 * 
	 * this.responseBody=s; this.responseCode=i; this.responseTime=l;
	 * 
	 * 
	 * }
	 */
	public APIResponse(String res, int statusCode, long time) {
		JsonProcessor jsonProccessor=new  JsonProcessor();
		this.responseBody =jsonProccessor.convertStringJson(res) ;
		this.responseCode = statusCode;
		this.responseTime = time;
	}

}
