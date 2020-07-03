package Testscript;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Assertion.Assertion1;
import Base.Baseclass;
import Pages.Login;
import Pages.Logout;
import Utilities.logscapture;
import Utilities.screenshotcapture;

public class TC2 extends Baseclass
{
	
	
	@Test
	public void test() throws Exception
	{
		String expectedURL="https://www.youtube.com/";
		Login object=new Login(driver,pr);
        object.signin("kashu120012@gmail.com", "Qwerty2123");
        
        Thread.sleep(5000);
        
        Assertion1.assert1(expectedURL, driver.getCurrentUrl());//soft assertion is using
        
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        logscapture.takelogs("TC2", "login successfully of TC2");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
        Thread.sleep(10000);
		//driver.switchTo().alert().dismiss();
		WebElement Subscriptions=driver.findElement(By.xpath(pr.getProperty("Subscriptions")));
		Subscriptions.click();
		 logscapture.takelogs("TC2", "Click on subscription successfully of TC2");
	        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		Logout out=new Logout(driver,pr);
		out.signout();
		 logscapture.takelogs("TC2", "logout successfully of TC2");
	     screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
	}
	
	

}
