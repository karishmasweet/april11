package Testscript;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

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
import Utilities.logscapture;
import Utilities.screenshotcapture;

public class TC1 extends Baseclass
{
	
	@Test
	public void test() throws InterruptedException, Exception
	{
        Login object=new Login(driver,pr);
        object.signin("kashu120012@gmail.com", "Qwerty2123");
        
       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
       Date  dateobj = new Date();
       System.out.println(new Date());
        
        
       /* SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj=new Date();
        String datee=formatter.format(dateobj).toString();
        String screenshotLocation="../YTFramework/screenshots/abc_"+dateobj+".png";
        */
        
        logscapture.takelogs("TC1", "login successfully");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
        
        
		Thread.sleep(10000);
		//driver.switchTo().alert().dismiss();
		WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
		trending.click();
		
		
		logscapture.takelogs("TC1", "Click on trending successfully");
		screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		Logout out=new Logout(driver,pr);
		out.signout();
		logscapture.takelogs("TC1", "signout successfully");
		screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
	}
	
	

}
