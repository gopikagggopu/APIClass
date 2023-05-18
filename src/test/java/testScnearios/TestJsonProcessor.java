package testScnearios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import MainCode.JsonProcessor;

public class TestJsonProcessor {

	/*
	 * @Test public void testValidateJsonObject() { JsonProcessor jp=new
	 * JsonProcessor(); JsonObject
	 * jsobj=jp.convertStringJson("{ \"name\": \"Gopika\", \"java\": true }");
	 * Assert.assertTrue(jsobj.isJsonObject());
	 * Assert.assertTrue(jsobj.get("name").getAsString().equals("Gopika"));
	 * Assert.assertTrue(jsobj.get("java").getAsBoolean() == true);
	 * 
	 * }
	 * 
	 * @Test public void testValidateJsonObjectFalse() { JsonProcessor jp=new
	 * JsonProcessor(); JsonObject
	 * jsobj=jp.convertStringJson("{ \"\name\": \\\"Gopika\\\", \"java\": true }");
	 * Assert.assertTrue(jsobj.isJsonObject());
	 * 
	 * }
	 * 
	 * @Test public void testValidateJsonObjectJavaFalse() { JsonProcessor jp=new
	 * JsonProcessor(); JsonObject
	 * jsobj=jp.convertStringJson("{ \"\name\": \\\"Gopika\\\", \"java\": trrue }");
	 * Assert.assertTrue(jsobj.get("java").getAsBoolean() == false);
	 * 
	 * }
	 */
	
	@Test
	public void testValiateString()
	{
		/*
		 * JsonProcessor jp=new JsonProcessor(); JsonObject
		 * s=jp.ConvertJsonToString(1,"Gopika",31); Assert.assertTrue();
		 */
	}
}
