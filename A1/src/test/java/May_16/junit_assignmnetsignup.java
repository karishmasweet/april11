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

public class junit_assignmnetsignup 
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
 public void test() throws InterruptedException
 {
	 WebElement firstname=driver.findElement(By.name("firstname"));
	 firstname.sendKeys("karishma");
	 
	 WebElement lastname=driver.findElement(By.name("lastname"));
	 lastname.sendKeys("shrama");
	 
	 WebElement mobile=driver.findElement(By.name("reg_email__"));
	 mobile.sendKeys("shrama@yopmail.com");
	 
	 Thread.sleep(5000);
	 WebElement confirm=driver.findElement(By.name("reg_email_confirmation__"));
	 confirm.sendKeys("shrama@yopmail.com"); 
	
	 WebElement password=driver.findElement(By.name("reg_passwd__"));
	 password.sendKeys("Qwerty@123");
	 
	 WebElement day=driver.findElement(By.name("birthday_day"));
	 Select d=new Select(day);
	 d.selectByIndex(19);
		
	WebElement month=driver.findElement(By.name("birthday_month"));
	Select m=new Select(month);
	m.selectByVisibleText("May");
		
	WebElement year=driver.findElement(By.name("birthday_year"));
	Select y=new Select(year);
	y.selectByValue("1962");
	
	Thread.sleep(5000);
	WebElement radio=driver.findElement(By.id("u_0_6"));
	 radio.click();
	
	 WebElement submit=driver.findElement(By.name("websubmit"));
	 submit.click();
 }
 
 @AfterMethod
public void close()
 {
	 driver.close();
 }
	
}
