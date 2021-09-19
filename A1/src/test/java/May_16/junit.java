package May_16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class junit 
{
	@BeforeClass
	public static void bclass()
	{
		System.out.println("before");
	}

	
	@AfterClass
	public static void aclass()
	{
		System.out.println("After");
	}
	
	@Test
	public void sign()
	{
		System.out.println("here i am sign up code");
	}
	
	@Test
	public void abc()
	{
		System.out.println("here I am sign up code second one");
	}
	
	@AfterMethod
	public void method2()
	{
		//Write the code her
		System.out.println("after class");
		
	}
	
	//@Before//whatever you want to execute before test case
	//public void method3()
	//{
		//System.out.println("before");
	//}

}
