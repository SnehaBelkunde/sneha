package NeoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignLogin
{
   @FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobileNumButton;
   
   @FindBy(xpath="(//a[text()='Sign In'])[2]") private WebElement SignInButton;
   
   
   public NeoStoxSignLogin(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   
   }
   public void sendMobileNumber(WebDriver driver,String mobNum) throws InterruptedException
   {
	   Thread.sleep(1000);
	   mobileNumButton.sendKeys(mobNum);
	   
   }
   public void clickOnSignInButton() throws InterruptedException
   {
	   Thread.sleep(1000);
	   SignInButton.click();
	   
   }
	
}

