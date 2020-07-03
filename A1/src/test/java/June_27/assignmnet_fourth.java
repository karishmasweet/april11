package June_27;

import java.util.Scanner;

public class assignmnet_fourth 
{
	public static void main(String[] args)
	{
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string first value");
		String s=obj.nextLine();
		
		String reverse = new StringBuffer(s).reverse().toString();
		
		System.out.println("\nString before reverse: "+s);
	    System.out.println("String after reverse: "+reverse);
	}

}
