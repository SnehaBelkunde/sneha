package TestNGSTUDY12;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void A() 
  {
	  System.out.println("A method is Running");
	  Reporter.log("A method is running using -->Log");
	  Reporter.log("A method is running using--log true", true);
  }
  
  @Test
  public void B() 
  {
	  System.out.println("B method is Running");
	  Reporter.log("B method is running using-->log");
	  Reporter.log("B method is running using--log true", true);
  }
  
  @Test
  public void C() 
  {
	  System.out.println("c method is Running");
	  Reporter.log("c method is running using-->log");
	  Reporter.log("c method is running using--log true", false);
  }
  @Test
  public void D() 
  {
	  System.out.println("D method is Running");
	  Reporter.log("D method is running using-->log");
	  Reporter.log("D method is running using--log true", true);
  }
  }

