package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 File MyFile= new File("D:\\sneha class\\study\\scrn\\Book1.xlsx");
		 
		 for(int i=0;i<=4;i++) 
			 
		 {
			 for(int j=0;j<=3;j++)
			 {
		   String value = WorkbookFactory.create(MyFile).getSheet("sheet2").getRow(i).getCell(j).getStringCellValue();
		   System.out.print(value+" ");
			 }
			 
			 System.out.println();
		 }
	}
	

}
