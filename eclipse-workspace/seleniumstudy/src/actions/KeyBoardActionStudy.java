package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionStudy {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		Actions act=new Actions(driver);
		WebElement day = driver.findElement(By.id("day"));
		
		act.click(day).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);

	//	act.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(1000);
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(1000);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(1000);
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(1000);
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(1000);
		
		//act.sendKeys(Keys.ENTER).perform();
		
		//System.out.println("=========for loop========");
		
		for(int i = 0;i<=7;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
	}

}
