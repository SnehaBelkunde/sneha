package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	 
	//1 create object of action class
	Actions act=new Actions(driver);
	
	//2. find element
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(1000);
     WebElement month = driver.findElement(By.id("month"));
     
     //3. take actions
     
     act.click(month).perform();
     Thread.sleep(500);
     
     act.sendKeys(Keys.ARROW_UP).click().perform();
     Thread.sleep(500);
     act.sendKeys(Keys.ARROW_UP).click().perform();
     Thread.sleep(1000);
     act.sendKeys(Keys.ARROW_UP).click().perform();
     Thread.sleep(500);
    
      act.sendKeys(Keys.ENTER).perform();
     
     
     
     
     
	
	


}
	}
