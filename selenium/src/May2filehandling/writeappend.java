package May2filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeappend 
{
		public static void main(String[] args) throws IOException 
		{
            System.out.println("Please enter the data");
			File f=new File("/Users/karishma/Desktop/write.txt");// connection between the file
			FileWriter fw=new FileWriter(f, true);// it will write in the end
			BufferedWriter b=new BufferedWriter(fw);
			Scanner s=new Scanner(System.in);
			String data;
			b.newLine();
			for(int i=1;i<=6;i++)
			{
				data=s.nextLine();
				b.write(data);
				b.newLine();
			
				
			}
			
			b.close();
		}

	}



