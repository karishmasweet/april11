package Testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Baseclasstwo;



public class TC12 extends Baseclasstwo
{
	
	
	@Test
	 public void booking_flow_bypanel() throws InterruptedException 
	 {
		
		 WebElement login=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		 login.click();
		 

		 Thread.sleep(5000);
		 WebElement emailcp=driver.findElement(By.xpath("//input[@placeholder='Email or Phone']"));
		 emailcp.sendKeys("niyati@yopmail.com");
		 
		 Thread.sleep(5000);
		 WebElement passwordcp=driver.findElement(By.xpath("//input[@id='siPassword']"));
		 passwordcp.sendKeys("Qwerty@123");
		 
		
		 Thread.sleep(5000);
		 WebElement logincp=driver.findElement(By.xpath("//button[@name='login']"));
		 logincp.click();
		
		 Thread.sleep(5000);
		 WebElement searchicon=driver.findElement(By.xpath("//i[@class='fa fa-search']"));
		 searchicon.click();
		  
		 Thread.sleep(5000);
		 WebElement searchtype=driver.findElement(By.xpath("//input[@id='searchType']"));
		 searchtype.sendKeys("WEBTECH");
		 
		 Thread.sleep(5000);
		 WebElement searchtext=driver.findElement(By.xpath("//p[@class='card_heading marginBottomStore']"));
		 searchtext.click();
		 
		 Thread.sleep(15000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement plusicon=driver.findElement(By.xpath("(//div[@class='p-plus ng-star-inserted'])[1]"));
		 js.executeScript("arguments[0].click();",plusicon);
		 
		 Thread.sleep(5000);
		 WebElement checkout=driver.findElement(By.xpath("//span[text()='Checkout']"));
		 checkout.click();
		 
		 Thread.sleep(5000); 
		 WebElement delivery=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/div[1]/div[1]/app-checkout[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-delivery-address[1]/div[1]/div[2]/div[2]/fav-location-model[1]/div[1]/div[2]/div[2]/div[2]/button[1]"));
		 delivery.click();
		 
		 Thread.sleep(5000); 
		 JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,400)");
			
			
			Thread.sleep(5000);
			 WebElement proceed=driver.findElement(By.xpath("//button[@class='chk_proceed_pay ripple text-capitalize mat-button']"));
			 proceed.click();
			 
			 JavascriptExecutor jl = (JavascriptExecutor) driver;
				jl.executeScript("window.scrollBy(0,400)");
			
			 Thread.sleep(5000);
			 WebElement pay=driver.findElement(By.xpath("//button[@class='pmnt_proceed_pay ripple text-capitalize mat-button ng-star-inserted']"));
			 pay.click();
			 
			 Thread.sleep(5000);
			 WebElement profile=driver.findElement(By.xpath("//span[@class='caret ml-5']"));
			 profile.click();
			
			 WebDriverWait wait=new WebDriverWait(driver,20);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Orders')]")));
			 WebElement orders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
			 orders.click();
		 
	 }
	
	

}
