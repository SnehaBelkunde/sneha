package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File Myfile = new File("D:\\sneha class\\study\\scrn\\Book1.xlsx");
		
		Workbook MyWorkBook = WorkbookFactory.create(Myfile);
		
		Sheet MySheet = MyWorkBook.getSheet("sheet2");
		Row MyRow = MySheet.getRow(0);
		Cell MyCell = MyRow.getCell(0);
		
		CellType CellType = MyCell.getCellType();
		
		System.out.println("My cell DataType is "+CellType);
		
		System.out.println(MyCell.getStringCellValue());
	
	}

}
