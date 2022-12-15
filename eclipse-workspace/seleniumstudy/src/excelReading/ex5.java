package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex5 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile =new File("D:\\sneha class\\study\\scrn\\Book1.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("sheet2");
		
		int LastRowNo = MySheet.getLastRowNum();
		System.out.println("Last row no is ="+LastRowNo);
		
		int TotalNoOfRow = LastRowNo;
		System.out.println("Total no of rows are= "+TotalNoOfRow);
		
		short LastCellNo = MySheet.getRow(0).getLastCellNum();
		System.out.println("Last cell no is="+LastCellNo);
		
		int TotalNoOfCell = LastCellNo-1;
		System.out.println("total no of cell="+TotalNoOfCell);
		
		
		for(int i=0;i<=TotalNoOfRow;i++)
		{
			for(int j=0;j<=TotalNoOfCell;j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				
			    System.out.print(value +" ");	
			    
			}
			System.out.println();
		}
		
	 
	}

}
