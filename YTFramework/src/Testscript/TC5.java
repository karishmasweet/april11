package Testscript;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import Pages.Login;
import Pages.Logout;
import Pages.videolike;
import Utilities.logscapture;
import Utilities.screenshotcapture;

public class TC5 extends Baseclass
{
	
	
	@Test
	public void test() throws Exception
	{
		Login object=new Login(driver,pr);
        object.signin("kashu120012@gmail.com", "Qwerty2123");
        
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        
        logscapture.takelogs("TC5", "login successfully of TC5");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		videolike like=new videolike(driver,pr);
	    like.play();
	    logscapture.takelogs("TC5", "video play successfully of TC5");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		Thread.sleep(2000);
		WebElement likevideo =driver.findElement(By.xpath(pr.getProperty("likevideo")));
		likevideo.click();
		logscapture.takelogs("TC5", "video like successfully of TC5");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		Logout out=new Logout(driver,pr);
		out.signout();
		logscapture.takelogs("TC5", "logout successfully of TC5");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		
	}
	
	



}
