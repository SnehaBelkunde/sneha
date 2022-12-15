package actions;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TotalNoOfLinks {

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
		System.out.println("=============Iterator============");
	
		Iterator<Object>it=Links.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		
		
			
	
	}

}
