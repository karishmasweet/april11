package Assertion;

public class Assertion2 
{
	public static Boolean assert1(String expected,String actual)
	  {
		if (expected.equals(actual))
		{
			System.out.println("Assertion passed");
			return true;
		}
		else
		{
			System.out.println("Assertion failed");
			return false;
		}
		
		
		
	 }

}
