package POPUPSTUDY;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
	    Thread.sleep(1000);
		alt.accept();
		String MyText = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		System.out.println("My Text is= "+MyText);
		
	
	}

}
