package April25doubleloops;

import java.util.Scanner;

public class mirrorstar 
{
public static void main(String[] args) 
	
	{
	int i;
	int j;
	 System.out.println("Enter the number of rows");
	 Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); 
	    
	 for(i=1;i<=n;i++)
	     {
	         for(j=i;j<n;j++)
	         {
	             System.out.print(" ");
	         }
	         for(j=1;j<=i;j++)
	         {
	             System.out.print("*");
	         }
	         System.out.println("");
	     } 
	 }

}
