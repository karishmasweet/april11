package May2filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class may2assignmnetrowcount 
{
	public void method1(int y,int x) throws IOException
	{
		File f=new File("/Users/karishma/Desktop/assignment1.txt");
		File j=new File("/Users/karishma/Desktop/assignment3.txt");// connection between the file
		 FileReader fr=new FileReader(f);
		 BufferedReader b=new BufferedReader(fr);
				 
		FileWriter fw=new FileWriter(j);
		BufferedWriter m=new BufferedWriter(fw);//go to line by line
		String s;
		m.newLine();
		 int a=0;
		   while((s=(b.readLine()))!= null)
		   {
			   a=a+1;
			   if(a>=y&&a<=x)
				  {
				   System.out.println(s);
						m.write(s);
						m.newLine();
					}
						
				  }
		    m.close();
			b.close();
		   }
	

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter first row");
		Scanner j=new Scanner(System.in);
		int y=j.nextInt();
		
		System.out.println("Enter second row");
		int x=j.nextInt();
		
		may2assignmnetrowcount obj=new may2assignmnetrowcount ();
		obj.method1(y,x);
		j.close();
	}
}
