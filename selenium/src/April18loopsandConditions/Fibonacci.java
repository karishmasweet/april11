package April18loopsandConditions;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter the value of a");
		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		int i;
		int first=-1;
		int second=1;
		int third;
		for(i=1;i<=a;i++)
		{
			third=first+ second;
			first=second;
			second=third;
			System.out.println("Fibonacci series of given no is " +third);
			
		}
		
		
		
	}

}
