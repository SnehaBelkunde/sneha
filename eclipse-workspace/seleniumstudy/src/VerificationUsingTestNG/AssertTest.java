package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest
{
  @Test
  public void VerifyCheckbox() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
		//if(checkbox.isSelected())
		//{
	//		Reporter.log("checkbox is selected TC is pass", true);
	//	}
	//	else
	//	{
	//		Reporter.log("checkbox is not selected TC is failed", true);
			
	//	}
		
		
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected(),"cheekbox is not selected TC is failed");
		

  }
}
