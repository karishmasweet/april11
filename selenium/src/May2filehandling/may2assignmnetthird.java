package May2filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class may2assignmnetthird 
{
public void method1(int n) throws IOException
{
	File f=new File("/Users/karishma/Desktop/assignment1.txt");
	File j=new File("/Users/karishma/Desktop/assignment4.txt");// connection between the file
	 FileReader fr=new FileReader(f);
	 BufferedReader b=new BufferedReader(fr);
			 
	FileWriter fw=new FileWriter(j);
	BufferedWriter m=new BufferedWriter(fw);//go to line by line
	String s;
	m.newLine();
	 int a=0;
	  while((s=(b.readLine()))!= null)
	  {
		  System.out.println(s);
		  m.write(s);
		  m.newLine();
	     a=a+1;//in the first line a----1 in the second time---a---2
	   if(a==n)
	   {
		 
		   break;
	   }

	  }
	  m.close();
	 b.close();
	  }
public static void main(String[] args) throws IOException 

{   System.out.println("print the row count");
    System.out.println("************************");
	System.out.println("Enter last row");
	Scanner j=new Scanner(System.in);
	int n=j.nextInt();
	
	may2assignmnetthird obj=new may2assignmnetthird ();
	obj.method1(n);
	
}

}
