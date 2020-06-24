package Testscript;

import java.util.List;

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
import Pages.videolike;

public class TC6 extends Baseclass
{
	
	
	@Test
	public void test() throws InterruptedException
	{
		Login object=new Login(driver,pr);
        object.signin("kashu120012@gmail.com", "Qwerty2123");
		
        videolike like=new videolike(driver,pr);
	     like.play();
	     
		Thread.sleep(2000);
		WebElement Subscribe =driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		Subscribe.click();
		
		Logout out=new Logout(driver,pr);
		out.signout();
		
	}
	
	



}
