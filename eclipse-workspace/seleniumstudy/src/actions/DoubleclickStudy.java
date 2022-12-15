package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.we have to create an object of actions class
		
		Actions act=new Actions(driver);
		
		//2.find the element
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		act.doubleClick(doubleclickbutton).perform();
		Thread.sleep(500);
		act.click().perform();
		
    
	}

}
