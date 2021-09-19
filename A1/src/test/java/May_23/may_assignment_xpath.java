package May_23;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class may_assignment_xpath 
{
	public ChromeDriver driver;
	
	@BeforeMethod
	public void browserlaunch() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		 options.setPageLoadStrategy(PageLoadStrategy.NONE);
		 driver=new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com");
	     Thread.sleep(10000);
	 }
 
	@Test
	public void sign() throws InterruptedException
	{
		//By Tag with attribute
		 WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		 firstname.sendKeys("kanika");
		 
		 //By Tag with multiple attribute with And condition
		 WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname' and @id='u_0_o']"));
		 lastname.sendKeys("verma");
		 
		 //By Tag with multiple attribute with OR condition
		 WebElement phonenumber=driver.findElement(By.xpath("//input[@name='reg_email__' or @id='u_0_r']"));
		 phonenumber.sendKeys("9988234345");
		 
		 //By for dynamic tag with attribute
		 WebElement password=driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
		 password.sendKeys("Qwerty@123");
		 
	
	      // By inner text is fixed	 
		 //WebElement birthday=driver.findElement(By.xpath("//div[text()='Birthday']")); 
		 
	
		 //By Tag with attribute
		 WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select d=new Select(day);
		 d.selectByIndex(14);
			
		 
		 //By for dynamic attributeName( let suppose if your attribute is
		 WebElement month=driver.findElement(By.xpath("//select[@*='birthday_month']"));
			Select m=new Select(month);
			m.selectByVisibleText("Sept");
			
			
		//By let suppose you have located the parent of your searching
			WebElement year=driver.findElement(By.xpath("//span/select[@name='birthday_year']"));
			Select y=new Select(year);
			y.selectByValue("1978");

	
         //By Tag with attribute	
			Thread.sleep(5000);
			WebElement radio=driver.findElement(By.xpath("//input[@id='u_0_6']"));
			 radio.click();
			

		 //By Tag with attribute
		 WebElement submit=driver.findElement(By.xpath("//button[@id='u_0_13']"));
			submit.click();
	}
		@AfterMethod
		public void close()
			 {
			 driver.close();
	 }
				
	
}
