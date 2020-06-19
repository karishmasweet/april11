package APIAutomation.APIAuto;
import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
public class POJOPost

{
	public static void main(String[] args)
	{
		bodydata obj=new bodydata();
	obj.setFirstname("mayank");
	obj.setAge("70");
	obj.setId("70");
	obj.setCompanyname("clicklabbs");
	obj.setLastname("sharma");
	
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(obj)
				.when()
				.post("http://localhost:3000/officeinfo");
		
		System.out.println("status code is ");
		System.out.println(res.statusCode());
		
				
	}

}
