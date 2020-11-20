package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Baseclassone;
import Pages.AdminLogin;
import Pages.Adminlogout;


public class TC15 extends Baseclassone

{
	@Test
	 public void admin_rejectbooking() throws InterruptedException 
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
		WebElement accept=driver.findElement(By.xpath("(//i[@class='yf yf-close-solid yf-icon-danger'])[1]"));
		accept.click();
		
		Adminlogout out=new Adminlogout(driver);
		out.admin_logout();

//		 Thread.sleep(10000);
//		WebElement setting=driver.findElement(By.xpath("//*[@class='ng-tns-c21-1 yf yf-settings1 sidebarIcon']"));
//		setting.click();
//			
//		Thread.sleep(5000);
//		WebElement logout=driver.findElement(By.xpath("//body/app-root[1]/app-dashboard[1]/div[1]/div[2]/app-settings[1]/div[1]/div[2]/i[1]/img[1]"));
//		logout.click();
//	
}

}
