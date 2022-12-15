package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordEnabled {
  @Test
  public void A() 
  {
	  Reporter.log("A tc is running",true);
  }
  @Test(enabled=false)
  public void B() 
  {
	  Reporter.log("B tc is running",true);
  }
  @Test
  public void C() 
  {
	  Reporter.log("C tc is running",trueg);
  }
}
