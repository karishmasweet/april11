package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminlogout 
{
	ChromeDriver driver;
	Properties pr;
	public Adminlogout(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void admin_logout() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement setting=driver.findElement(By.xpath("//*[@class='ng-tns-c21-1 yf yf-settings1 sidebarIcon']"));
		setting.click();
		
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.xpath("//body/app-root[1]/app-dashboard[1]/div[1]/div[2]/app-settings[1]/div[1]/div[2]/i[1]/img[1]"));
		logout.click();
	}

}
