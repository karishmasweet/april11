package TestNG;

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

public class TC7 extends Baseclass
{
	
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement login=driver.findElement(By.xpath(pr.getProperty("login")));
		login.click();
		
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys("kashu120012@gmail.com");
		
	
		WebElement next=driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
		password.sendKeys("Qwerty2123");
		
		WebElement next2=driver.findElement(By.xpath(pr.getProperty("next2")));
		next2.click();
		
		Thread.sleep(10000);
		List<WebElement> video=driver.findElements(By.id(pr.getProperty("video")));
		video.get(4).click();//it is going to fourth video
		
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
		
		Thread.sleep(10000);
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		
		Thread.sleep(5000);
		WebElement out=driver.findElement(By.xpath(pr.getProperty("out")));
		out.click();
		
	}
	

}
