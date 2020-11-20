package Testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Assertion.Assertion2;
import Base.Baseclassone;

public class TC4 extends Baseclassone//Login by wrong email and password
{
	
	
	@Test
	 public void login_by_wrong_email_and_password() throws InterruptedException 
	 {
		String expected="This account is not registered with us.";
		
	
		 WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
			
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("kanika10@yopmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Qwert@123");
		//password.clear();
		
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		String pop=driver.findElement(By.xpath("//*[@class='ui-toast-detail']")).getText();
		System.out.println(pop);
		
		
		
         Thread.sleep(5000);
//       Assertion2.assert1(expected,pop1);
         Assertion2.assert1(expected,pop);
		
	 }
	

}
