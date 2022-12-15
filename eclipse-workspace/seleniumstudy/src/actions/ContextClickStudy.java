package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickStudy {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		/////////hiiiiiiiii/////
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(rightclick).perform();
		Thread.sleep(1000);
		
			

	}

}
