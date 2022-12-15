package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementStudy {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1.to take mouse actions, need to create object of Actions class and pass webDriver object as parameter
		Actions act=new Actions(driver);

		//2.find the element to be act
		
		//WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		//Thread.sleep(500);
		//3.now take action ad perform
		
		//act.moveToElement(aboutus).perform();
		//act.click().perform();
		
		
		//findout Radio button
		WebElement home=driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		Thread.sleep(500);
		act.moveToElement(home).perform();
		Thread.sleep(500);
		act.click().perform();
		
		
	}

}
