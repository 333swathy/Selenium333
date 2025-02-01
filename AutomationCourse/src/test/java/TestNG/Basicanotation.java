package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Basicanotation {
  @Test
  public void testcase01() {
	  System.out.println("Testcase 1");
  }
  @Test
  public void testcase2()
  {
	  System.out.println("Testcase 2");
  }
  @Test
  public void testcase3()
  {
	  System.out.println("Testcase 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Before Class");
  }
  @AfterClass
  public void afterclass()
  {
	  System.out.println("After class");
  }
  @BeforeTest
  public void beforetest()
  {
	 System.out.println("Before test");

}
  @AfterTest
  public void aftertest()
  {
	  System.out.println("After test");
  }
  @BeforeSuite
  public void beforesuit()
  {
	  System.out.println("Before suit");
  }
  @AfterSuite
  public void aftersuit()
  {
	  System.out.println("After suit");
  }
}
