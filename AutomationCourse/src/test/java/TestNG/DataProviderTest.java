package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="dataprovider1")
  public void testcase1(int a,int b) {
	  System.out.println(a+b);
	  
  }
  @DataProvider(name="dataprovider1")
  public Object[][] dpmethod1(){
	  return new Object[][] 
		  {{3,2},{4,6},{3,9},{7,8}};
  
  }
  @Test(dataProvider="dataProvider2")
  public void testcaseString(String s,int a)
  {
	  System.out.println(s+a);
  }
  @DataProvider(name="dataProvider2")
  public Object[][] dpstring(){
	  return new Object[][] 
			  {{"swathy",1},{"Nihaara",3}};
  }
  @Test(dataProvider="datprovider3")
  public void testcasefloat(float a,float b)
  {
	  System.out.println(a+b);
  }
  @DataProvider(name="datprovider3")
  public Object[][] dpfloat(){
	  return new Object[][]
			  {{2.3f,4.6f},{5.5f,7.7f},{2.2f,4.4f}};
  }
}
