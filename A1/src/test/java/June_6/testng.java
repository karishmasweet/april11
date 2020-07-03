package June_6;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng 

{
	@BeforeClass
	public void methodone()
	
	{
		System.out.println("Before class");
	}
	
   @BeforeMethod
   public void method2()
   {
	   System.out.println("BeforeMethod");
	   
   }
   
   @Test (priority=1)
   public void abc()
   {
	   System.out.println("test1");
	   
   }
   
   @Test
   public void cde()
   {
	   System.out.println("test2");
	   
   }
   
   @Test (priority=0)// we set the priority here
   public void qqb()
   {
	   System.out.println("test3");
   }
   
   
//   @Test(dependsOnMethods="cde")// we set the depemdency means cde test will execute first
//   public void efg()
//   {
//	   System.out.println("test4");
//	   
//   }
   
   @AfterMethod
   public void method3()
   {
	   System.out.println("AfterMethod");
   }
   
   @AfterClass
   public void method4()
   
   {
	   System.out.println("AfterClass");
   }
}
