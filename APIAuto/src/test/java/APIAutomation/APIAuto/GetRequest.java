package APIAutomation.APIAuto;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest
{
	public static void main(String[] args)throws Exception
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/friends");
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("**************Data*********");
		System.out.println(res.asString());
		
	}

}
