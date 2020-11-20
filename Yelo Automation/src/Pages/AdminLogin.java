package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin 
{
	ChromeDriver driver;
	Properties pr;
	public AdminLogin(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void signin() throws InterruptedException
	{
		 WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
			
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("testauto@yopmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Qwerty@123");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}

}
