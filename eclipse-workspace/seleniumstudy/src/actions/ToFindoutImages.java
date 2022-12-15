package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToFindoutImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Actions act=new Actions(driver);
		act.sendKeys("iphone 14").sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("the total number of Images are- "+images.size());
		
	}

}
