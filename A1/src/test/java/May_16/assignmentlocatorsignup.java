package May_16;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignmentlocatorsignup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		Thread.sleep(2000);
		
		//1.By Id
		WebElement id=driver.findElement(By.id("usernamereg-firstName"));
		id.sendKeys("karishma");
		
		//2.By Name
		WebElement name=driver.findElement(By.name("lastName"));
		name.sendKeys("malhotra");
		
		//3.By Id
		WebElement email=driver.findElement(By.id("usernamereg-yid"));
		email.sendKeys("clicklabs123");
		
		//4.By name
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Qwerty@123");
		
		//Dropdown by index value
		//WebElement countrycod=driver.findElement(By.name("shortCountryCode"));
		//Select d=new Select(countrycod);
		//d.selectByIndex(9);
		
		WebElement phonenumber=driver.findElement(By.name("phone"));
		phonenumber.sendKeys("9988543267");
		
		//Dropd down by index value
		WebElement dropdown=driver.findElement(By.name("mm"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("May");
		
		WebElement dd=driver.findElement(By.name("dd"));
		dd.sendKeys("14");
		
		WebElement year=driver.findElement(By.name("yyyy"));
		year.sendKeys("1984");
		
		
		//Dropdown by visible text
		//WebElement birth=driver.findElement(By.id("usernamereg-month"));
		//Select l=new Select(birth);
		//l.selectByVisibleText("May");
		
		WebElement button=driver.findElement(By.id("reg-submit-button"));
		button.click();
		
		
	}

}
