package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertion2;
import Base.Baseclassone;

public class TC8 extends Baseclassone//sign up by invalid 
{

	@Test
    public void signupinvalid() throws InterruptedException
	{
		String expected="This field is required.";

		WebElement entername=driver.findElement(By.xpath("//input[@name='username']"));
		 entername.sendKeys("k");
		 entername.sendKeys(Keys.BACK_SPACE);
		 
		 Thread.sleep(5000);
		 WebElement enteremail=driver.findElement(By.xpath("//input[@name='email']"));
		 enteremail.sendKeys("e");
		 enteremail.sendKeys(Keys.BACK_SPACE);
		 
		 Thread.sleep(5000);
		 WebElement enterpassword=driver.findElement(By.xpath("//input[@id='yelo-password']"));
		 enterpassword.sendKeys("Qwerty@123");
		 for(int i=0;i<11;i++)
		 {
			 enterpassword.sendKeys(Keys.BACK_SPACE);
			 
		 }
		 
		 WebElement enterphone=driver.findElement(By.xpath("//input[@inputmode='numeric']"));
		 enterphone.click();

		 
		String pop1=driver.findElement(By.xpath("//div[@class='form-group input-container input-img-email signup_via_otp']/control-messages/div")).getText();
		String pop2=driver.findElement(By.xpath("//div[@class='form-group input-container input-img-email signup_via_otp']//div[@class='error ng-star-inserted'][contains(normalize-space(),'This field is required.')]")).getText();
		String pop3=driver.findElement(By.xpath("//div[3]//control-messages[1]//div[1]")).getText();
			
		
		 Thread.sleep(5000);
	        Assertion2.assert1(expected,pop1);
	        System.out.println("first name is required");
	        Assertion2.assert1(expected,pop2);
	        System.out.println("email id is required");
	        Assertion2.assert1(expected,pop3);
	        System.out.println("password is required");
		
	}
}
