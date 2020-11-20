package May_31;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class windowhandling 
{public static ChromeDriver driver;
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","../A1/chromedriver ");
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NONE);
	driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	Thread.sleep(6000);
	
	WebElement title=driver.findElement(By.id("video-title"));
	Actions obj=new Actions(driver);
	obj.keyDown(Keys.COMMAND).click(title).keyUp(Keys.COMMAND).build().perform();
	
     String current=driver.getWindowHandle();
    Set<String> all_window=driver.getWindowHandles();
	
	for(String i:all_window)
	{
		driver.switchTo().window(i);
	}

}

}
