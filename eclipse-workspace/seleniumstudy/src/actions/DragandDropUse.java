package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropUse {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination = driver.findElement(By.id("amt8"));
		 
		 Actions act=new Actions(driver);
		 Thread.sleep(1000);
		 
		 //act.clickAndHold(source).moveToElement(destination).release().build().perform();
		 
		act.dragAndDrop(source, destination).perform();	

	}

}
