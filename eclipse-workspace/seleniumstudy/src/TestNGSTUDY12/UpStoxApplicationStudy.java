package TestNGSTUDY12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class UpStoxApplicationStudy {
  @Test
  public void validateUserName() 
  {
	  Reporter.log("User Name is validated", true);
  }
  @BeforeMethod
  public void loginToUpStoxApplication()
  {
	  Reporter.log("Enter UserName,Password,passcode & Login", true);
  }

  @AfterMethod
  public void logOutApplication()
  {
	  Reporter.log("Click on LogOut,LoggedOut", true);  
  }

  @BeforeClass
  public void launchTheBrowser() 
  {
	  Reporter.log("Launch the browser and Enter URL", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("Close the Browser", true);
  }

}
