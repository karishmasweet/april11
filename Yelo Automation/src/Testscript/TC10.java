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

public class TC10 extends Baseclassone
{
	@Test
	 public void booking_flow_by_admin() throws InterruptedException 
	 {
		

//		 WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
//		 next.click();
//			
//		Thread.sleep(5000);
//		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
//		email.sendKeys("kanika10005@yopmail.com");
//		
//		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("Qwerty@123");
//		
//		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
//		login.click();
		
		AdminLogin obj=new AdminLogin(driver);
		obj.signin();
		
		Thread.sleep(10000);
		WebElement orders=driver.findElement(By.xpath("//i[@class='ng-tns-c21-1 yf yf-tasks-list sidebarIcon']"));
		orders.click();
		
		Thread.sleep(5000); 
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
			
			Adminlogout out=new Adminlogout(driver);
			out.admin_logout();
	     
//	     Thread.sleep(10000);
//			WebElement setting=driver.findElement(By.xpath("//*[@class='ng-tns-c21-1 yf yf-settings1 sidebarIcon']"));
//			setting.click();
//			
//			Thread.sleep(5000);
//			WebElement logout=driver.findElement(By.xpath("//body/app-root[1]/app-dashboard[1]/div[1]/div[2]/app-settings[1]/div[1]/div[2]/i[1]/img[1]"));
//			logout.click();
			
	     
	     
		
	 }

}
