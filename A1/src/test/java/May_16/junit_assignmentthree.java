package May_16;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class junit_assignmentthree 
{
	public static ChromeDriver driver;
	 @BeforeMethod
	public void launch() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
		    driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https:www.facebook.com");
			Thread.sleep(10000);
	 }
	 
	 @Test
	 public void dropdown()
	 {
		 junit_assignmentthree obj=new junit_assignmentthree ();
		 WebElement day=driver.findElement(By.name("birthday_day"));
			obj.genric(day, "20");
			
			WebElement month=driver.findElement(By.name("birthday_month"));
			obj.genrictwo(month, 8);
			
			WebElement year=driver.findElement(By.name("birthday_year"));
			obj.genricthree(year, "1995");
		 
	 }
	 
	 public void genric(WebElement element,String visibleText)
		{
			Select s=new Select(element);
			s.selectByVisibleText(visibleText);
			
		}
	 public void genrictwo(WebElement element, int index)
		{
			Select s=new Select(element);
			s.selectByIndex(index);
			
		}
		
		public void genricthree(WebElement element,String Value )
		{
			Select s=new Select(element);
			s.selectByValue(Value);
		}
	 
	@AfterMethod
	public void close()
	 {
		 driver.close();
	 }
}
