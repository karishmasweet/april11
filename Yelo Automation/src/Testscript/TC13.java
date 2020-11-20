package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import Base.Baseclassone;
import Pages.AdminLogin;
import Pages.Adminlogout;

public class TC13 extends Baseclassone
{
	@Test
	 public void Different_status_booking() throws InterruptedException 
	 {
		

		AdminLogin obj=new AdminLogin(driver);
		obj.signin();
		
		Thread.sleep(10000);
		WebElement orders=driver.findElement(By.xpath("//i[@class='ng-tns-c21-1 yf yf-tasks-list sidebarIcon']"));
		orders.click();
		
		Thread.sleep(7000); 
		WebElement create=driver.findElement(By.xpath("//button[@ptooltip='cmd/ctrl + B ']"));
		create.click();
		
		Thread.sleep(5000);
		WebElement customer=driver.findElement(By.xpath("//input[@placeholder='Customer']"));
		customer.sendKeys("Niyati");
		Thread.sleep(2000);
		customer.sendKeys(Keys.ARROW_DOWN);
		customer.sendKeys(Keys.ENTER);
		 

		Thread.sleep(5000); 
		 WebElement resturants=driver.findElement(By.xpath("//input[@placeholder='Restaurants']"));
	     resturants.sendKeys("WE");
	     Thread.sleep(2000);
		resturants.sendKeys(Keys.ARROW_DOWN);
		resturants.sendKeys(Keys.ENTER);
			 
	     

		 Thread.sleep(5000); 
	     WebElement products=driver.findElement(By.xpath("//input[@placeholder='products']"));
	     products.sendKeys("Cheese");
	     Thread.sleep(2000);
			products.sendKeys(Keys.ARROW_DOWN);
			products.sendKeys(Keys.ENTER);
				 

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(5000); 
	     WebElement invoice=driver.findElement(By.xpath("//button[text()='Invoice']"));
	     invoice.click();
	     
	    
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,400)");
	     
			Thread.sleep(5000); 	
	     WebElement createorder=driver.findElement(By.xpath("//button[@class='btn btn-yl-primary']"));
	     createorder.click();
	     
	     Thread.sleep(10000);
			WebElement againorders=driver.findElement(By.xpath("//i[@class='ng-tns-c21-1 yf yf-tasks-list sidebarIcon']"));
			againorders.click();
		
		Thread.sleep(5000);
		WebElement accept=driver.findElement(By.xpath("(//i[@class='yf yf-checked-circle yf-icon-success'])[1]"));
		accept.click();
		
		Thread.sleep(5000);
		WebElement pending=driver.findElementByXPath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[3]");
		pending.click();
		
		Thread.sleep(5000);
		WebElement dispatch=driver.findElementByXPath("//span[contains(text(),'Dispatched')]");
		dispatch.click();
		
		Thread.sleep(5000);
		WebElement pendingtwo=driver.findElementByXPath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[3]");
		pendingtwo.click();

		Thread.sleep(7000);
		WebElement completed=driver.findElementByXPath("(//li[@class='ui-dropdown-item ui-corner-all'])[2]");
		completed.click();
		
		Adminlogout out=new Adminlogout(driver);
		out.admin_logout();
		
	 }
}
		