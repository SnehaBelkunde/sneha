package TestNGSTUDY12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationStudy {
  @Test
  public void Test() 
  {
	  Reporter.log("Test method is running", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("BeforeMethod is running", true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("AfterMethod is Running", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("BeforeClass is Running", true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("AfterClass is Running", true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("BeforeTest is Running", true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("AfterTest is Running", true);
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("BeforeSuit is Running", true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("AfterSuit is Running", true);
  }

}
