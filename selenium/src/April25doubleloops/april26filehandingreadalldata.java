package April25doubleloops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// read the data line by line
public class april26filehandingreadalldata 
{
	public static void main(String[] args) throws IOException 
	 {
		 File f=new File("/Users/karishma/Desktop/test.txt");
		 FileReader fr=new FileReader(f);
		 BufferedReader b=new BufferedReader(fr);
		 String s;
		 
		   while((s=b.readLine())!= null)
		   {
			   System.out.println(s);
		   }
				 
		
	}

}
