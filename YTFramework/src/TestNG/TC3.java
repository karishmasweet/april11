package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;

public class TC3 extends Baseclass
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
		WebElement History=driver.findElement(By.xpath(pr.getProperty("History")));
		History.click();
		
		Thread.sleep(10000);
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		
		Thread.sleep(5000);
		WebElement out=driver.findElement(By.xpath(pr.getProperty("out")));
		out.click();
	}
	
	


}
