package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 

{
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;	
		
	}
	
	public void signin(String username,String passwords) throws InterruptedException
	{
		WebElement login=driver.findElement(By.xpath(pr.getProperty("login")));
		login.click();
		
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(username);
		
	
		WebElement next=driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
		password.sendKeys(passwords);
		
		 WebElement next2=driver.findElement(By.xpath(pr.getProperty("next2")));
		 next2.click();
	}

}
