package Testscript;

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

public class TC3 extends Baseclass
{
	
	@Test
	public void test() throws InterruptedException
	{
		Login object=new Login(driver,pr);
        object.signin("kashu120012@gmail.com", "Qwerty2123");
		
		Thread.sleep(10000);
		WebElement History=driver.findElement(By.xpath(pr.getProperty("History")));
		History.click();
		
		Logout out=new Logout(driver,pr);
		out.signout();
		
	}
	
	

}
