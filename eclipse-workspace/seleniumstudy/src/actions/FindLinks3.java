package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=adobe+reader+free+online&oq=&aqs=chrome.2.69i59i450l8.2272915j0j7&sourceid=chrome&ie=UTF-8");
		List<WebElement> tagnm = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links= "+tagnm.size());
		
		System.out.println("=========for each===========");
		for(WebElement tng:tagnm)
		{
			System.out.println(tng.getText());
		}
	}
}



