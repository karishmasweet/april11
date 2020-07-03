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

import Assertion.Assertion1;
import Base.Baseclass;
import Pages.Login;
import Pages.Logout;
import Pages.videolike;
import Utilities.logscapture;
import Utilities.screenshotcapture;

public class TC6 extends Baseclass
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
        
        logscapture.takelogs("TC6", "login successfully of TC6");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
       
        videolike like=new videolike(driver,pr);
	     like.play();
	     
		Thread.sleep(2000);
		WebElement Subscribe =driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		Subscribe.click();
		logscapture.takelogs("TC6", "subscribe successfully of TC6");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		Logout out=new Logout(driver,pr);
		out.signout();
		logscapture.takelogs("TC6", "logout successfully of TC6");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
	}
	
	



}
