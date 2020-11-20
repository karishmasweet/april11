package Testscript;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclassone;

public class TC3 extends Baseclassone //Login in by facebook
{
	
	
	@Test
	 public void facebooksignup() throws InterruptedException 
	 {
		WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
		 
		 Thread.sleep(5000);
		 WebElement facebook=driver.findElement(By.xpath("//button[@id='fbBtn']"));
		 facebook.click();
		   
		 String current=driver.getWindowHandle();
		 Set<String> all_window=driver.getWindowHandles();
			
			for(String i:all_window)
			{
				driver.switchTo().window(i);
			}
		 
		 Thread.sleep(5000);
		 WebElement facebookemail=driver.findElement(By.xpath("//input[@id='email']"));
		 facebookemail.sendKeys("karishmatester@gmail.com");
		 
		 Thread.sleep(3000);
		 WebElement facebookpassword=driver.findElement(By.xpath("//input[@name='pass']"));
		 facebookpassword.sendKeys("karishma@1234");
	 
		 Thread.sleep(3000);
	     WebElement facebooklogin=driver.findElement(By.xpath("//input[@name='login']"));
	     facebooklogin.click();
	     
	     driver.switchTo().window(current);
	     
	        Thread.sleep(10000);
			WebElement setting=driver.findElement(By.xpath("//*[@class='ng-tns-c21-1 yf yf-settings1 sidebarIcon']"));
			setting.click();
			
			Thread.sleep(5000);
	        WebElement logout=driver.findElement(By.xpath("//*[@ptooltip='Logout']"));
			logout.click();
		
		 	 
	 }
	
	

}
