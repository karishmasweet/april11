package June_6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000); // wait for the next statement after it
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.MILLISECONDS);//for waiting 5 secodns all webelements
		WebDriverWait w=new WebDriverWait(driver,5);
		//w.until(ExpectedConditions.elementToBeClickable(login));
		//w.until(ExpectedConditions.textToBePresentInElement(login, "Login"));
		List<WebElement> all=driver.findElements(By.id("video-title"));
		System.out.println("totla video "+all.size());
		all.get(4);//it is going to fourth video
	}

}
