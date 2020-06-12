package May2filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writedatadifferentmutilpetypes 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Please enter the data");
		File f=new File("/Users/karishma/Desktop/write.txt");// connection between the file
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		String data;
		for(int i=1;i<=6;i++)
		{
			data=s.nextLine();
			b.write(data);
			b.newLine();
		
			
		}
		
		b.close();
	}

}
