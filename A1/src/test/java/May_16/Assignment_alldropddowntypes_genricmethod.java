package May_16;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment_alldropddowntypes_genricmethod 
{
	public void genric(WebElement element,String visibleText)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);
		
	}
	
	public void genric2(WebElement element, int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
		
	}
	
	public void genric3(WebElement element,String Value )
	{
		Select s=new Select(element);
		s.selectByValue(Value);
		
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
		
		Assignment_alldropddowntypes_genricmethod drop=new Assignment_alldropddowntypes_genricmethod ();
		
				WebElement day=driver.findElement(By.name("birthday_day"));
				drop.genric(day, "14");
				
				WebElement month=driver.findElement(By.name("birthday_month"));
				drop.genric2(month, 6);
				
				
				WebElement year=driver.findElement(By.name("birthday_year"));
				drop.genric3(year, "1964");

}

}