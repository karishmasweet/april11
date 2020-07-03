package Utilities;



import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logscapture 
{
	public static void takelogs(String classname,String message)
	{
		DOMConfigurator.configure("../YTFramework/layout.xml");
		org.apache.log4j.Logger l=Logger.getLogger(classname);
		l.info(message);
	}

}
