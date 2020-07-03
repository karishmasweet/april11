package Automation.A1;

    import java.io.File;
	import java.io.IOException;

	import jxl.Cell;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

	public class writeexcel
	{
		public static void main(String[] args) throws Exception
		{ File f=new File("/Users/karishma/Desktop/Book7.xls");
		try {
         WritableWorkbook wk=Workbook.createWorkbook(f);
         WritableSheet ws=wk.createSheet("Aanchal",0);
         for(int i=0;i<3;i++)
         {
        	 for(int j=0;j<3;j++)
        	 {
        		 Label l=new Label(j,i,"karishma");
        		 ws.addCell((WritableCell) l);
        		 
        	 }
        }
		wk.close();
		wk.write();
		} 
		catch(Exception e)
		{
			
		}
		}
}
