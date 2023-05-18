package MainCode;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.*;
import com.google.gson.JsonParser;

public class JsonProcessor {

	/*
	 * Add code to convert string to Json Object gson/jackson
	 */

	public JSONObject convertStringJson(String str) {

		JSONObject responseObject = new JSONObject(str);
		System.out.println(responseObject);
		return  responseObject;

	}
	
	/*
	 * public JSONArray ConvertJsonArray(String str) {
	 * 
	 * 
	 * }
	 */

	
}

/*
 * public actual ConvertJsonToString(int id,String name,int age) {
 * 
 * Gson gson = new Gson(); String json = gson.toJson(string);
 * System.out.println(json); return json;
 * 
 * 
 * 
 * 
 * JSONObject actual = new JSONObject(); actual.put("id", id);
 * actual.put("name", name); actual.put("age", age);
 * 
 * System.out.println(actual);
 * 
 * return actual; }
 */
