package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAftermethod {
  @Test
  public void testcase1() {
	  System.out.println("testcase 1");
  }
  @Test
  public void testcase2()
  {
	  System.out.println("testcase 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }
  @Test(dataProvider=" dataprovider",dataProviderClass=BasicTestcase.class)//dataProviderClass=Classname.class
  public void testcase1(int a,int b)
  {
	  System.out.println(a+b);

}
}
