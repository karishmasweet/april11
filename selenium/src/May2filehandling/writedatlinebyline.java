package May2filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writedatlinebyline 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("/Users/karishma/Desktop/file.txt");// connection between the file
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		b.write("first line");
		b.newLine();
		b.write("second line");
		b.newLine();
		b.close();
		
	}

}
