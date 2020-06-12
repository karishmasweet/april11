package APIAutomation.APIAuto;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

public class compleorgjson
{
	

	public static void main(String[] args)
	{
		JSONObject aanchal=new JSONObject();
		aanchal.put("Sector", "288");
		aanchal.put("Houseno", "207889");
		
		JSONObject karishma=new JSONObject();
		karishma.put("firstname","kanikasanjay");
		karishma.put("lastname","vermasharma");
		karishma.put("age","312");
		karishma.put("id","20009799788");
		karishma.put("Company name","roundclassonejhjh");
		karishma.put("Address",aanchal);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(karishma.toString())
				.when()
				.post("http://localhost:3000/officeinfo");
		
		System.out.println("status code is "+res.statusCode());
				
	}

	}

