package Automation.A1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readexcel 
{
	public static void main(String[] args) throws Exception 
	{ File f=new File("/Users/karishma/Desktop/Book1.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	 System.out.println("Total row "+r);
	 System.out.println("Total column "+c);
	 
	 for(int i=0;i<r;i++)// this loop for row
	 {
		for(int j=0;j<c;j++) //this loop for coloumn
		{
			Cell c1=ws.getCell(j,i);
			System.out.println(c1.getContents());
		}
	 }
		
	}

}
