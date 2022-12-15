package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToFindImages1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']"));
		Actions act=new Actions(driver);
		act.sendKeys("mobile").sendKeys(Keys.ENTER).build().perform();
		 
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		 Thread.sleep(1000);
		List<WebElement> imag=driver.findElements(By.tagName("img"));
		 Thread.sleep(1000);
		System.out.println("no of images are- "+imag.size());
		
		

	}

}
