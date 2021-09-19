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

public class junit_genricmethod_xpath 
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
		 firstname.sendKeys("Niyati");
		 
		 //By Tag with multiple attribute with And condition
		 WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname' and @id='u_0_o']"));
		 lastname.sendKeys("Malhotra");
		 
		 //By Tag with multiple attribute with OR condition
		 WebElement phonenumber=driver.findElement(By.xpath("//input[@name='reg_email__' or @id='u_0_r']"));
		 phonenumber.sendKeys("9988234343");
		 
		 //By for dynamic tag with attribute
		 WebElement password=driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
		 password.sendKeys("Qwerty@123");
		 
	//***************************************Drop down***************************************
		 //By Tag with attribute
		 junit_genricmethod_xpath  obj=new junit_genricmethod_xpath ();
		 WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		obj.genric(day, "15");
		
		 
		 //By for dynamic attributeName( let suppose if your attribute is
		 WebElement month=driver.findElement(By.xpath("//select[@*='birthday_month']"));
		 obj.genric(month, "Oct");
			
			
		//By let suppose you have located the parent of your searching
			WebElement year=driver.findElement(By.xpath("//span/select[@name='birthday_year']"));
			obj.genric(year, "1988");

	//******************************************************************************************
         //By Tag with attribute	
			Thread.sleep(5000);
			WebElement radio=driver.findElement(By.xpath("//input[@id='u_0_6']"));
			 radio.click();
			

		 //By Tag with attribute
		 WebElement submit=driver.findElement(By.xpath("//button[@id='u_0_13']"));
			submit.click();
	}
	
	 public void genric(WebElement element,String visibleText)
		{
			Select s=new Select(element);
			s.selectByVisibleText(visibleText);
		}
	 
	 
		@AfterMethod
		public void close()
			 {
			 driver.close();
	 }
				

}
