package NeoStoxPOM;

import org.apache.pdfbox.multipdf.LayerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage
{
	@FindBy(id="txt_accesspin") private WebElement passwordField;
	@FindBy(xpath="//a[text()='Submit']") private WebElement SubmitButton;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void sendPassword(WebDriver driver,String pass) throws InterruptedException
	{
		Thread.sleep(2000);
		passwordField.sendKeys(pass);
		
	}
	public void clickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(2000);
		SubmitButton.click();
		
	}
}
