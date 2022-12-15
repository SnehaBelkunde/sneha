package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriority {
  @Test
  public void A() 
  {
	  Reporter.log("A tc is running", true);
  }
  @Test
  public void B() 
  {
	  Reporter.log("B tc is running", true);
  }
  @Test(enabled=false)
  public void C() 
  {
	  Reporter.log("C tc is running", true);
  }
  @Test(priority=-1)
  public void D() 
  {
	  Reporter.log("D tc is running", true);
  }
  }
