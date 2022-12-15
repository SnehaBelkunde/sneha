package TestNGSTUDY12;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest1 {
	@Test(groups="un")
	  public void A() 
	  {
		    Reporter.log("A method is running",true);
	  }
	@Test
	  public void B() 
	  {
		    Reporter.log("B method is running",true);
	  } 
	@Test(groups={"un","funds"})
	  public void C()
	  {
		    Reporter.log("C method is running",true);
	  } 
	@Test(groups="un")
	  public void D() 
	  {
		    Reporter.log("D method is running",true);
	  } 
	@Test(groups="funds")
	  public void E() 
	  {
		    Reporter.log("E method is running",true);
	  } 
	@Test
	  public void F() 
	  {
		    Reporter.log("F method is running",true);
	  } 
	@Test(groups="funds")
	  public void G() 
	  {
		    Reporter.log("G method is running",true);
	  } 
}


