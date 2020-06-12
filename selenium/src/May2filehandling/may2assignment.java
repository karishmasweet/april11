package May2filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class may2assignment 
{
public void method() throws IOException
{
	 File f=new File("/Users/karishma/Desktop/assignment1.txt");
	 FileReader fr=new FileReader(f);
	 BufferedReader b=new BufferedReader(fr);
			 
	File j=new File("/Users/karishma/Desktop/assignmnet2.txt");// connection between the file
	FileWriter fw=new FileWriter(j);
	BufferedWriter m=new BufferedWriter(fw);//go to line by line
	Scanner l=new Scanner(System.in);
	String data;
	while((data=b.readLine())!=null)
	{
		m.write(data);
		m.newLine();
	}
		b.close();
		m.close();
	   
}

	
public static void main(String[] args) throws IOException 
{
	System.out.println("Read the data from assignment1 text file to write the data assignmnet2 text file");
	System.out.println("**********************************************************************************");
	may2assignment obj=new may2assignment();
	 obj.method();

	
}
}
