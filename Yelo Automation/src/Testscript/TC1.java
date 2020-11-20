package Testscript;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclassone;


public class TC1 extends Baseclassone//Sign up
{
	
 @Test
 public void signup() throws InterruptedException 
 {
	 WebElement entername=driver.findElement(By.xpath("//input[@name='username']"));
	 entername.sendKeys("kanika");
	 

	 WebElement enteremail=driver.findElement(By.xpath("//input[@name='email']"));
	 enteremail.sendKeys("kanika1024@yopmail.com");
	 
	 
	 WebElement enterpassword=driver.findElement(By.xpath("//input[@id='yelo-password']"));
	 enterpassword.sendKeys("Qwerty@123");
	 

	 WebElement enterphone=driver.findElement(By.xpath("//input[@inputmode='numeric']"));
	 enterphone.sendKeys("9988430142");
	 
	 WebElement submit=driver.findElement(By.xpath("//button[@class='continue-btn-desktop mt-4']"));
	 submit.click();
	 
	 Thread.sleep(5000);
	 WebElement enterbusinessname=driver.findElement(By.xpath("//input[@formcontrolname='marketplaceName']"));
	 enterbusinessname.sendKeys("webtechTwityfour");
	 
	 Thread.sleep(5000);
	 WebElement Next=driver.findElement(By.xpath("//button[@type='submit']"));
	 Next.click();
	 
	 Thread.sleep(5000);
	 WebElement dropdown=driver.findElement(By.xpath("//span[contains(text(),'Food Delivery')]"));
	dropdown.click();	
	 //Select m=new Select(dropdown);
	 //m.selectByVisibleText("Food Delivery");

	    WebElement nextbutton=driver.findElement(By.xpath("//button[contains(@class,'next-btn')] "));
		nextbutton.click();
		
		Thread.sleep(9000);
		WebElement setting=driver.findElement(By.xpath("//*[@class='ng-tns-c22-1 yf yf-settings1 sidebarIcon']"));
		setting.click();
		
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.xpath("//*[@ptooltip='Logout']"));
		logout.click();
 }
 
 
}
