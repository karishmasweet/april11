package Testscript;

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

public class TC7 extends Baseclass
{
	
	
	@Test
	public void test() throws InterruptedException
	{
		Login object=new Login(driver,pr);
        object.signin("kashu120012@gmail.com", "Qwerty2123");
		
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
		
		Logout out=new Logout(driver,pr);
		out.signout();
		
		
	}
	

}
