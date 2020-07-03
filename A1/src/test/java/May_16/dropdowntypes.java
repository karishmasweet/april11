package May_16;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdowntypes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(10000);
		
		//Dropdown by index value
				WebElement day=driver.findElement(By.name("birthday_day"));
				Select d=new Select(day);
				d.selectByIndex(19);
				
				WebElement month=driver.findElement(By.name("birthday_month"));
				Select m=new Select(month);
				m.selectByVisibleText("May");
				
				WebElement year=driver.findElement(By.name("birthday_year"));
				Select y=new Select(year);
				y.selectByValue("1962");
		
	}
}
