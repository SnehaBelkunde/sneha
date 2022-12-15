package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex6 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	File MyFile=new File("D:\\sneha class\\study\\scrn\\Book1.xlsx");
	
	Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("sheet3");
	
	int TotalNoOfRows = MySheet.getLastRowNum();
	short TotalNoOfCell = MySheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<=TotalNoOfRows;i++)
	{
		for(int j=0;j<=TotalNoOfCell;j++)
		{
			CellType CellDataType = MySheet.getRow(i).getCell(j).getCellType();
		
			if(CellDataType==CellType.STRING)
			{
				String MyValue = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(MyValue +" ");
			}
			else if(CellDataType==CellType.NUMERIC)
			{
				double MyValue1 = MySheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.println(MyValue1 +" ");
			}
			else if(CellDataType==CellType.BOOLEAN)
			{
			boolean MyValue2 = MySheet.getRow(i).getCell(j).getBooleanCellValue();
			System.out.println(MyValue2 +" ");
			}
			
			else if(CellDataType==CellType.BLANK)
			{
				
				
			}
		}
		
	}
		
	
	}

}
