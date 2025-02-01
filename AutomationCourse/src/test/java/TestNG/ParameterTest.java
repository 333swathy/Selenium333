package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
  @Test
  @Parameters({"parameter1","parameter2"})
  public void parameter(int a,String b) {
	  System.out.println(a+b);
  }
}
