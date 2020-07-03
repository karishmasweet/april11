package June_27;

import java.util.Scanner;

public class assignment_occurence 
{
	public static void main(String[] args)
	{String s="my name is deepak";
	
	int totalcount=s.length();//total length
	int totalcount_afterremove=s.replace("e", " ").length();
	int count=totalcount-totalcount_afterremove;
	System.out.println("Number occurances of e is "+count);
	}
	
}
