package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssretEqualsTest {
  @Test
  public void TC1()
  {
	  String s="Pune";
	  String s1="Pune";
	  
	  //I need to verify s and s1 are equal or not
	  //if s,S1 are equal then TC is pass
	  
	  Assert.assertEquals(s,s1,"s and s1 are not matching TC is failed");
  }
}
