package TestNGSeraillyParallely;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SerailTest1 
{
	@Test
	  public void PaytmLaunch()
	  {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
	  }
	 
}
