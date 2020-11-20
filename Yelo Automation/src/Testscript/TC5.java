package Testscript;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclassone;

public class TC5 extends Baseclassone//login by google plus 
{
	
	
	@Test
	 public void facebooksignup() throws InterruptedException 
	 {
		WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
		 
		 Thread.sleep(5000);
		 WebElement google=driver.findElement(By.xpath("//button[@id='googleBtn']"));
		 google.click();
		 
		 String current=driver.getWindowHandle();
		 Set<String> all_window=driver.getWindowHandles();
			
			for(String i:all_window)
			{
				driver.switchTo().window(i);
			}
		 
		 Thread.sleep(5000);
		 WebElement emailorphone=driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
		 emailorphone.sendKeys("karishmatester@gmail.com");
		 
		 Thread.sleep(3000);
		 WebElement nextgmail=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		 nextgmail.click();
		 
		 Thread.sleep(3000);
		 WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("karishma@1234");
		 
		 
		 Thread.sleep(5000);
		 WebElement nextgmail2=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		 nextgmail2.click();
		 
		 driver.switchTo().window(current);
		  
		 Thread.sleep(15000);
			WebElement setting=driver.findElement(By.xpath("//*[@class='ng-tns-c21-1 yf yf-settings1 sidebarIcon']"));
			setting.click();
			
			Thread.sleep(5000);
	        WebElement logout=driver.findElement(By.xpath("//*[@ptooltip='Logout']"));
			logout.click();
	 }
	
	

}
