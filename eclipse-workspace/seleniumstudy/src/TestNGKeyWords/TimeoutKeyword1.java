package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeyword1 {
  @Test(timeOut=2000)
  public void A() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("A TC is running", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("B TC is running", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("C TC is running", true);
  }
}
