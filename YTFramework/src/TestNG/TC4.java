package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 
{
	public ChromeDriver driver;
	@BeforeMethod
	 public void browserlaunch() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		 options.setPageLoadStrategy(PageLoadStrategy.NONE);
		 driver=new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://www.youtube.com");
	     Thread.sleep(10000);
	 }
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement login=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']"));
		login.click();
		
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("kashu120012@gmail.com");
		
	
		WebElement next=driver.findElement(By.xpath("//span[@class='CwaK9']"));
		next.click();
		
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Qwerty2123");
		
		WebElement next2=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next2.click();
		
		Thread.sleep(10000);
		WebElement Library=driver.findElement(By.xpath("//yt-formatted-string[text()='Library']"));
		Library.click();
		
		Thread.sleep(10000);
		WebElement signout=driver.findElement(By.xpath("//img[@class='style-scope yt-img-shadow' and @alt='Avatar image']"));
		signout.click();
		
		Thread.sleep(5000);
		WebElement out=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		out.click();
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}



}
