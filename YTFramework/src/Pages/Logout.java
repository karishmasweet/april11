package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout 
{
	ChromeDriver driver;
	Properties pr;
	public Logout(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;	
	}
	
	public void signout() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		
		Thread.sleep(5000);
		WebElement out=driver.findElement(By.xpath(pr.getProperty("out")));
		out.click();
	}

}
