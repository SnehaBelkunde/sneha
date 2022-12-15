package NeoStoxTestClasses;

import org.testng.annotations.Test;

import NeoStoxBase.NeoStoxBaseClass;
import NeoStoxPOM.NeoStoxHomePage;
import NeoStoxPOM.NeoStoxPasswordPage;
import NeoStoxPOM.NeoStoxSignLogin;
import NeoStoxUtility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ValidateNeoStoxUserName1 extends NeoStoxBaseClass 
{
	 NeoStoxSignLogin login;
	  NeoStoxPasswordPage password;
	  NeoStoxHomePage home;
  
  @BeforeClass
  public void launchNeoStox() throws InterruptedException
  {
	  launchBrowser();
	  login=new NeoStoxSignLogin(driver);
	  Thread.sleep(2000);
	  password =new NeoStoxPasswordPage(driver); 
	  
  }
  @BeforeMethod
  public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  login.sendMobileNumber(driver,Utility.readDataFromExcel(6, 0));
	  login.clickOnSignInButton();
	  Thread.sleep(1000);
	  password.sendPassword(driver,Utility.readDataFromExcel(6, 1));
	  Thread.sleep(1000);
	  password.clickOnSubmitButton();
	  Thread.sleep(8000);
	  home.popUpHandle(driver);
	  Thread.sleep(2000);
	  
  }
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  
     Assert.assertEquals(home.getUserName(),Utility.readDataFromExcel(6, 2),"TC failed,actual and expected User name are not matching ");
     Thread.sleep(1000);
     Utility.takeScreenShot(driver,home.getUserName());
  
  }
  

  @AfterMethod
  public void logOut() throws InterruptedException
  {
	  Thread.sleep(3000);
	  home.logoutFormNeoStox(driver);
  }

 

  @AfterClass
  public void closeApplication() throws InterruptedException
  {
	  Thread.sleep(1000);
	  closingBrowser(driver);
  }

 

}
