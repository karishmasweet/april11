package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertion2;
import Base.Baseclassone;

public class TC11 extends Baseclassone
{
	@Test
	public void check_errormessage_left_emailbox() throws InterruptedException
	{
		String expected="This field is required.";
		
		
		 WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
		
		 Thread.sleep(5000);
		 WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("Qwerty@123");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		String pop1=driver.findElement(By.xpath("//div[@class='error ng-star-inserted']")).getText();
		System.out.println(pop1);
		
		
		
        Thread.sleep(5000);
//      Assertion2.assert1(expected,pop1);
        Assertion2.assert1(expected,pop1);
	}
}
