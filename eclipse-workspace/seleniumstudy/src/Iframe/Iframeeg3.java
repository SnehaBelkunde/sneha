package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframeeg3 
{

public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
driver.switchTo().frame("iframeResult");			
Thread.sleep(1000);			
driver.findElement(By.xpath("//button[@type='button']")).click();
Thread.sleep(1000);
}
}