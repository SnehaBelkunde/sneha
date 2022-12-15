package POPUPSTUDY;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow2 {

public static void main1(String[] args) throws InterruptedException 
	{ 
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://vctcpune.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
			Set<String> idofallpages = driver.getWindowHandles();
			System.out.println("idofallpages");
			
			//driver.switchTo().window(childpage);
			
	}

}
