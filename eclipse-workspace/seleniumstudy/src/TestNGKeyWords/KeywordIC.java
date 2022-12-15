package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordIC {
  @Test(invocationCount=5)
  public void A()
  {
	  Reporter.log("A Tc is Running", true);
  }
}
