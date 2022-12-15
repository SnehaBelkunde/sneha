package NeoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxBaseClass
{
public static WebDriver driver;

	
	public void launchBrowser() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			driver.get("https://neostox.com/sign-in");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
	}
	public static void closingBrowser(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}

}
