package Automation.A1;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.tools.javac.tree.JCTree.Tag;

public class signchromedriver 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/karishma/eclipse-workspace/A1/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/");
		Thread.sleep(10000);
		//1.By Id
		//WebElement user=driver.findElement(By.id("email"));----//facebook
	
		//2.By Name
		//WebElement user=driver.findElement(By.name("email"));------//facebook
		
		//3.Tag.class name(css)
		//WebElement user=driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"));
		
		//4.Tag#Id(Css)
		//WebElement user=driver.findElement(By.cssSelector("#username"));
		
		//5.Tag[attributename=attributevalue](css)
		//WebElement user=driver.findElement(By.cssSelector("input[id='username']"));
		
		//6.By classname
		//WebElement user=driver.findElement(By.className("form-control private-form__control login-email"));
		
		//7.Tag.classvalue[attname=attributevalue]
		WebElement user=driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email[id='username']"));
		user.sendKeys("karishma");
	}

}
