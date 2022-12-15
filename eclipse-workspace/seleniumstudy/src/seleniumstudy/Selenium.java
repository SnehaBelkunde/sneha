package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		// WEB DRIVER METHODS
		
		driver.get("https://www.paytm.com/");
	        Thread.sleep(1000);
	     driver.get("https://www.zomato.com/");
		Thread.sleep(1000);
		//driver.close();
		
		//driver.quit();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//driver.manage().window().minimize();
		//Thread.sleep(1000);
		
		System.out.println("=============================");
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
	    driver.navigate().refresh();
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		String myTitle=driver.getTitle();
		System.out.println("my title is "+myTitle);
		
		System.out.println(driver.getCurrentUrl());
		
		String myUrl=driver.getCurrentUrl();
		System.out.println("My Url is  " +myUrl);

		
		
		
		

		

	}

}
