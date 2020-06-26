package Utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotcapture 
{
public static void takescreenshot(ChromeDriver driver,String Location) throws Exception
{
	File f=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File(Location));
	
}
}
