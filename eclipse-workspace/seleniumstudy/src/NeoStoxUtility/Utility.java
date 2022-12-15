package NeoStoxUtility;

import java.io.File;
import org.openqa.selenium.io.FileHandler;
import java.io.IOException;
import java.time.Duration;
//import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Utility 
{
	//commonly used methods
	//excel reading ,screenshot,wait,scrolling
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		
		File myFile=new File("D:\\sneha class\\study\\scrn\\Book1.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
	    String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	public static void takeScreenShot( WebDriver driver,String fileName) throws IOException
	{
	  File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File dest=new File("D:\\sneha class\\study\\scrn\\Screenshot"+fileName+".png");
	  FileHandler.copy(src, dest);
	  Reporter.log("Taking sereenshot ", true);
	}
	public static void scrollintoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollintoView(true)",element);
		
	}
	public static void wait(WebDriver driver,int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		
	}
	
}
