package Testscript;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class TC7 extends Baseclass
{
	
	
	@Test
	public void test() throws Exception
	{
		Login object=new Login(driver,pr);
        object.signin("kashu120012@gmail.com", "Qwerty2123");
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        
        logscapture.takelogs("TC7", "login successfully ");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
        
        videolike like=new videolike(driver,pr);
	    like.play();
		
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("commentbox"))).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		WebElement comment=driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.sendKeys("nice");
		
		Thread.sleep(10000);
		WebElement commentSubmit = driver.findElement(By.xpath(pr.getProperty("commentSubmit")));
		commentSubmit.click();
		logscapture.takelogs("TC7", "comment successfully ");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
        Logout out=new Logout(driver,pr);
		out.signout();
		
		logscapture.takelogs("TC7", "logout successfully ");
        screenshotcapture.takescreenshot(driver, "../YTFramework/screenshots/abc_"+new Date()+".png");//call by classname.methodname
		
		
	}
	

}
