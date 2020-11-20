package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Baseclassone;
import Pages.AdminLogin;
import Pages.Adminlogout;

public class TC14 extends Baseclassone
{
	@Test
	 public void admin_cancelbooking() throws InterruptedException 
	 {
		

		AdminLogin obj=new AdminLogin(driver);
		obj.signin();
		
		Thread.sleep(10000);
		WebElement orders=driver.findElement(By.xpath("//i[@class='ng-tns-c21-1 yf yf-tasks-list sidebarIcon']"));
		orders.click();
		
		Thread.sleep(5000);
		WebElement accept=driver.findElement(By.xpath("(//i[@class='yf yf-checked-circle yf-icon-success'])[1]"));
		accept.click();

		Thread.sleep(5000);
		WebElement pending=driver.findElementByXPath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[3]");
		pending.click();
		
		Thread.sleep(5000);
		WebElement cancel=driver.findElementByXPath("(//li[@class='ui-dropdown-item ui-corner-all'])[3]");
		cancel.click();
		
		Thread.sleep(5000);
		WebElement popup=driver.findElementByXPath("//button[@class='btn btn-ok submit-btn']");
		popup.click();
		
		Adminlogout out=new Adminlogout(driver);
		out.admin_logout();
}
}
