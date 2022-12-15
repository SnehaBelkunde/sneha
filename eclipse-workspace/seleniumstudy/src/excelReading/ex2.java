package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File MyFile=new File("D:\\sneha class\\study\\scrn\\Book1.xlsx"); 
	    String value= WorkbookFactory.create(MyFile).getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(value);
	
	    
		String v2 = WorkbookFactory.create(MyFile).getSheet("sheet2").getRow(1).getCell(1).getStringCellValue();
		System.out.println(v2);
		
		String v3 = WorkbookFactory.create(MyFile).getSheet("sheet2").getRow(2).getCell(2).getStringCellValue();
		System.out.println(v3);
		
		
		
		String v4 = WorkbookFactory.create(MyFile).getSheet("sheet2").getRow(3).getCell(3).getStringCellValue();
		System.out.println(v4);
	
	}

}
