package April18loopsandConditions;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value ");
		Scanner obj=new Scanner(System.in);
		int no=obj.nextInt();
		int temp= no;
		int rev=0;
		int rem;
		 while(temp!=0)
		 {
			 rem=temp%10;// give the remainder
			 rev=rev*10+rem;
			 temp=temp/10;// it will give the quotient and it will store the value in the temp variable
			 // and it will go to while loop and check the condition
		 }
		
		if (no==rev)
		{
			System.out.println(no+ " is Palidrome number ");
		}
		
		else
		
		{
			System.out.println(no+ " is not Palidrome");
		}
	}

}
