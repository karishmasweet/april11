package June_27;

import java.util.Scanner;

public class assignment_palidrome 
{
	public static void main(String[] args)
	{
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string to check if it's a palindrome");
		String s=obj.nextLine();
		String reverse="";
		
		int l=s.length();
		
		// System.out.println("total length is "+l);
		 
		 for(int i=0;i<l;i++)
		 {
			 reverse=reverse+s.charAt(i);
		 }
		 
		 if(s.equals(reverse))
		 
			 {
			 System.out.println("The string is palindrome.");
			 }
		 
		 else
		 
		 { 
			 System.out.println("The string is not palindrome. "); 
		 
		 }
	 
	}
}
