package April18loopsandConditions;

import java.util.Scanner;

public class table 
{
public static void main(String[] args) 
{

	System.out.println("Please enter the value of a");
	Scanner s=new Scanner(System.in);
	int a= s.nextInt();
	int i;
	
	for(i=1;i<=10;i++)
	{
		System.out.println("Multiplication of table = "+a*i);
		
	}
	
	
}


}
