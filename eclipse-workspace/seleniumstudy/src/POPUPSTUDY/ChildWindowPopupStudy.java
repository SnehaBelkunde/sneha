package POPUPSTUDY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChildWindowPopupStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> AllWindowId = driver.getWindowHandles();
		System.out.println(AllWindowId);
		
		Iterator<String> it = AllWindowId.iterator();
		String mainpage = it.next();
		String childpage = it.next();
		
		driver.switchTo().window(childpage);
		
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(DropDown);
		s.selectByVisibleText("Option1");
		Thread.sleep(1000);
		s.selectByVisibleText("Option2");
		Thread.sleep(1000);
		
		driver.switchTo().window(mainpage);
		
		String MainPageText = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']")).getText();
		System.out.println("MainPageText= " +MainPageText);
		
		

	}

}
