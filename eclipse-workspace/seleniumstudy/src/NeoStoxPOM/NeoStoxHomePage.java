package NeoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;

public class NeoStoxHomePage
{
	@FindBy(id="lbl_username")private WebElement userName; 
	@FindBy(id="lbl_curbalancetop")private WebElement balance;
	@FindBy(xpath="(((//span[text()='×'])[19]")private WebElement okButton;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	@FindBy(xpath="//span[text()='Logout']")private WebElement logoutButton;

public NeoStoxHomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void popUpHandle(WebDriver driver) throws InterruptedException,NullPointerException
{
	Thread.sleep(3000);
	okButton.click();
	Utility.scrollintoView(driver, closeButton);
	Thread.sleep(8000);
	closeButton.click();
	Thread.sleep(8000);
	
}

public String getUserName()
{
   String actualUserName = userName.getText();
   Reporter.log("getting user Name",true);
   return actualUserName;
}
public void logoutFormNeoStox(WebDriver driver)
{
	Utility.wait(driver, 1000);
	userName.click();
	Utility.wait(driver, 1000);
	logoutButton.click();
	Reporter.log("Loggoing out from neoStox",true);
}

}
