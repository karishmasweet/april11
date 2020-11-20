package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Assertion.Assertion2;
import Base.Baseclassone;

public class TC9 extends Baseclassone
{
	@Test
	public void check_continue_button_is_Disabled()
	{
		
				try
		{
		
		WebElement disabledbutton=driver.findElement(By.xpath("//button[@class='continue-btn-desktop mt-4 cursor-disabled']"));
		if( disabledbutton.isDisplayed())
		{
			System.out.println(disabledbutton.getText() +" Button Is disabled");
		}
		
		}
		catch(Exception e)
		
        {
			Assert.assertFalse(true, "Button should be disabled");
				
		}

		
	}

}
