package TestNGSTUDY12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxDriverTest {
  @Test
  public void Firefox() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\selenium\\driver\\geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.get("https://www.phonepe.com/");
	   
  }
}
