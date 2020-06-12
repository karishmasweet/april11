package April25doubleloops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class april26filehandlingassignment 
{
 public void method() throws IOException
 {

	 File f=new File("/Users/karishma/Desktop/test.txt");
	 FileReader fr=new FileReader(f);
	 BufferedReader b=new BufferedReader(fr);
	 String s;
	 int a=0;
	   while((s=b.readLine())!= null)
	   {
		   a=a+1;
		   if(a>=2&&a<=5)
			  {
				  System.out.println(s);
			  }
	   }
 }
 
 public static void main(String[] args) throws IOException 
 {
	 System.out.println("Print the line from 2 to line 5 from the text file");
	 System.out.println("**************************************************");
	 april26filehandlingassignment obj=new april26filehandlingassignment();
	 obj.method();
	 
	
}
 
}
