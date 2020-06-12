package APIAutomation.APIAuto;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

public class arrayorgjson 
{
	public static void main(String[] args) 
	{
		

	JSONObject primaryaddress=new JSONObject();
	primaryaddress.put("houseNo","28");
	primaryaddress.put("landmark","skyu");
	
	JSONObject secondaryaddress=new JSONObject();
	secondaryaddress.put("houseNo","25");
	secondaryaddress.put("landmark","sky");
	
	JSONArray address=new JSONArray();
	address.put(0,primaryaddress);
	address.put(1,secondaryaddress);
	
	JSONObject newfriend=new JSONObject();
	newfriend.put("firstname","Mitika");
	newfriend.put("lastname","Malhotra");
	newfriend.put("address",address);
	newfriend.put("id","12");
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(newfriend.toString())
			.when()
			.post("http://localhost:3000/officeinfo");
	
	System.out.println("status code is "+res.statusCode());
}

}
