package Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class videolike 
{
	ChromeDriver driver;
	Properties pr;
	public videolike(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;	
		
	}
	
	public void play() throws InterruptedException
	{
		Thread.sleep(10000);
		List<WebElement> video=driver.findElements(By.id(pr.getProperty("video")));
		video.get(4).click();//it is going to fourth video
	}

}
