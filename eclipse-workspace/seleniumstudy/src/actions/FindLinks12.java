package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("the total no of links are- "+Links.size());
		
		System.out.println("=============FOR EACH============");
		for(WebElement lk:Links)
		{
			System.out.println(lk.getText());
		}	
	}
}
