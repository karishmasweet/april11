package APIAutomation.APIAuto;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;
public class simpleorgjson 
{
public static void main(String[] args)
{
	JSONObject karishma=new JSONObject();
	karishma.put("firstname","karishma");
	karishma.put("lastname","Malhotra");
	karishma.put("age","30");
	karishma.put("id","2000278");
	karishma.put("Company name","clicklabs");
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(karishma.toString())
			.when()
			.post("http://localhost:3000/officeinfo");
	
	System.out.println("status code is "+res.statusCode());
			
}

}
