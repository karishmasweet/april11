package April18loopsandConditions;

import java.util.Scanner;

public class primenumber {
	
	public static void main(String[] args) 
	{
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int num= obj.nextInt();
		int b=0;
		int i;
		
		for(i=2;i<=num/2;i++)
		{
			if(num%i == 0)
			{
				b=1;
			}
		}
		if(b==1)
		{
			System.out.println("No, "+num+" is not a prime number");
		}
		else
		{
			System.out.println("No, "+num+" is  a prime number");
		}
		}
	}


