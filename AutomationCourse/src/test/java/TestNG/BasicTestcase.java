package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTestcase {
  @Test(priority=-3,enabled =false)//testcase will not work if enabled is false
  public void testcase9() {
	  System.out.println("Testcase 9");
  }
  @Test(priority = -1,enabled = true)//By default enabled is true
  public void testcase2() {
	  System.out.println("Testcase 2");
  }
  @Test(priority = 0,groups="smoke")
  public void testcase3() {
	  System.out.println("Testcase 3");
  }
  @Test(priority = 10,groups="smoke")
  public void testcase4() {
	  System.out.println("Testcase 4");
  }
  @Test(priority = -10,groups="smoke")
  public void testcase5() {
	  System.out.println("Testcase 5");
  }
  @DataProvider(name=" dataprovider")
  public Object[][] dataprovider(){
	return new Object[][]
	{{3,2},{4,6},{3,9},{7,8}};
  }
  
  }
			  
  

