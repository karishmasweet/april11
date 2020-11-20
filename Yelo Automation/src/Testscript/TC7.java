package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertion2;
import Base.Baseclassone;

public class TC7 extends Baseclassone
{
	@Test
	public void Blankusername() throws InterruptedException
	{
		String expected="This field is required.";
		
		
		 WebElement next=driver.findElement(By.xpath("//a[contains(@class,'color-blue')]"));
		 next.click();
			
		Thread.sleep(5000);

		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		String pop1=driver.findElement(By.xpath("//*[@class='form-group input-container input-img-email pos-rel ng-star-inserted']/control-messages/div")).getText();
		String pop2=driver.findElement(By.xpath("//*[@class='form-group input-container input-img-password pos-rel ng-star-inserted']/control-messages/div")).getText();
		System.out.println(pop1);
		System.out.println("for blank email id");
		System.out.println(pop2);
		System.out.println("for blank Password");
		
        Thread.sleep(5000);
        Assertion2.assert1(expected,pop1);
        Assertion2.assert1(expected,pop2);

}
}
