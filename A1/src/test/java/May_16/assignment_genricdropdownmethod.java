package May_16;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignment_genricdropdownmethod 

{
	public void genric(WebElement element,String visibleText)
	{
		Select s=new Select(element);
		s.deselectByVisibleText(visibleText);
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(10000);
		
		assignment_genricdropdownmethod drop=new assignment_genricdropdownmethod ();
		
		//Dropdown by index value
				WebElement day=driver.findElement(By.name("birthday_day"));
				drop.genric(day, "20");
				
				WebElement month=driver.findElement(By.name("birthday_month"));
				drop.genric(month, "May");
				
				
				WebElement year=driver.findElement(By.name("birthday_year"));
				drop.genric(year, "1995");
		
	}

}
