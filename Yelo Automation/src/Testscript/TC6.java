package Testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Assertion.Assertion2;
import Base.Baseclassone;

public class TC6 extends Baseclassone//User is left the password and verify the validation message
{
	@Test
	public void Blankpassword() throws InterruptedException
	{
		String expected="This field is required.";
		
		
		 WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
			
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("kanika10@yopmail.com");
		
	
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		String pop1=driver.findElement(By.xpath("//*[@class='error ng-star-inserted']")).getText();
		System.out.println(pop1);
		
		
		
        Thread.sleep(5000);
//      Assertion2.assert1(expected,pop1);
        Assertion2.assert1(expected,pop1);
		
	}


}
