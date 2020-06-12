package April25doubleloops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class april26filehandlinglinebylinewith 
{
	public static void main(String[] args) throws IOException 
	 {
		 File f=new File("/Users/karishma/Desktop/test.txt");
		 FileReader fr=new FileReader(f);
		 BufferedReader b=new BufferedReader(fr);
		 String s;
		 int a=0;
		   while((s=b.readLine())!= null)
		   {
			   a=a+1;//in the first line a----1 in the second time---a---2
		   if(a==5)
		   {
			   System.out.println(s);
		   break;
			   }
		  
		   }		 
		
	}


}
