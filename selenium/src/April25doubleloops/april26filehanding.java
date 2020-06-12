
package April25doubleloops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class april26filehanding 
{
 public static void main(String[] args) throws IOException 
 {
	 File f=new File("/Users/karishma/Desktop/test.txt");
	 FileReader fr=new FileReader(f);
	    int a;
	    while ((a=fr.read())!= -1) // it is reading first, after that it is comparing
            {
            	System.out.println((char)a);// read the character from the txt file
	              }
	 
			 
	
}
}
