package Testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 
{
	public ChromeDriver driver;
	@BeforeMethod
	 public void browserlaunch() throws InterruptedException, IOException
	 {
		System.setProperty("webdriver.chrome.driver","../Yelo Automation/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		 options.setPageLoadStrategy(PageLoadStrategy.NONE);
		 driver=new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://admin.yelo.red/en/signup/step1");
	     Thread.sleep(10000);
	 }
	
	@Test
	 public void signin() throws InterruptedException 
	 {

		 WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
			
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("kanika1004@yopmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Qwerty@123");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
	 }
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
