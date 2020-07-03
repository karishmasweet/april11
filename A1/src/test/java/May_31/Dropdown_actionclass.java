package May_31;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_actionclass 
{
	public static ChromeDriver driver;
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NONE);
	driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(6000);
	
	
	Actions obj=new Actions(driver);
	driver.findElement(By.id("fromCity")).click();
	WebElement radio=driver.findElement(By.xpath("//input[@placeholder='From']"));
	obj.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	Thread.sleep(5000);
	
    WebElement tocity=driver.findElement(By.id("toCity"));
    tocity.click();
    obj.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	
	
}

}
