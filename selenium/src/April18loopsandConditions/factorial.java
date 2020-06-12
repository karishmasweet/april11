package April18loopsandConditions;

import java.util.Scanner;

public class factorial 

{


	public static void main(String[] args)
	{
		System.out.println("Please enter the value of a");
		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		
		 
		   int i; 
		   int fact=1;
		
			for(i=1;i<a;i++)
			{
				fact=fact*i;
			}	
			System.out.println("Factorial of given no is "+fact);
			}
	
}
