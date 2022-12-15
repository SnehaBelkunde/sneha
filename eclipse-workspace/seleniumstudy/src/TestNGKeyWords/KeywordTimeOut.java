package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordTimeOut {
	@Test
	  public void A()
	  {
		  Reporter.log("A Tc is Running", true);
	  }
	@Test(timeOut=500)
	 public void B()
	  {
		  Reporter.log("B Tc is Running", true);
	  }
	@Test
	 public void C()
	  {
		  Reporter.log("C Tc is Running", true);
	  }
	}
