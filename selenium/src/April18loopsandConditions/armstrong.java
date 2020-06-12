package April18loopsandConditions;

import java.util.Scanner;

public class armstrong {
	
	public static void main(String args[]) {
	     
	      
	      System.out.println("Enter the number to be verified:");
	      Scanner obj = new Scanner(System.in);
	      int number = obj.nextInt();
	      int check,rem, sum = 0;
	      
	      check = number;
	      while(check != 0) {
	         rem = check % 10;
	         sum = sum + (rem * rem * rem);
	         check = check / 10;
	      }
	      if(sum == number)
	         System.out.println("Given number is an armstrong number.");
	      else
	         System.out.println("Given number is not an armstrong number.");
	   }
	}


