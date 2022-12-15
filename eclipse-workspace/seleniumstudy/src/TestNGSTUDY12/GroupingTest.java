package TestNGSTUDY12;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest {
	@Test
	  public void A() 
	  {
		    Reporter.log("A method is running",true);
	  }
	@Test(groups="un")
	  public void B() 
	  {
		    Reporter.log("B method is running",true);
	  } 
	@Test
	  public void C()
	  {
		    Reporter.log("C method is running",true);
	  } 
	@Test(groups="funds")
	  public void D() 
	  {
		    Reporter.log("D method is running",true);
	  } 
	@Test(groups="un")
	  public void E()
	  {
		    Reporter.log("E method is running",true);
	  }
}
