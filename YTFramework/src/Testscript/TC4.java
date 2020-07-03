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

public class TC4 extends Baseclass
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
        
        logscapture.takelogs("TC4", "login successfully of TC4");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
        
		Thread.sleep(10000);
		WebElement Library=driver.findElement(By.xpath(pr.getProperty("Library")));
		Library.click();
		logscapture.takelogs("TC4", "click on library successfully of TC4");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		Logout out=new Logout(driver,pr);
		out.signout();
		logscapture.takelogs("TC4", "logout successfully of TC4");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
	}
	
	



}
