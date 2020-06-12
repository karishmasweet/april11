package May2filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writedata 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("/Users/karishma/Desktop/file.txt");// connection between the file
	FileWriter fw=new FileWriter(f);
	fw.write("first line");
	fw.close(); //save+close
	//how to write the data, it will overide
	
}
}
