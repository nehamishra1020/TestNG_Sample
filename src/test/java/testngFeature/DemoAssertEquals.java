package testngFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertEquals {
	
  @Test
  public void test1() {
	  System.out.println("Test1 started");
	 Assert.assertEquals("Hello1", "Hello");
	  
	  System.out.println("Test1 completed");
	  
  }
  
  @Test
  public void test2() {
  System.out.println("Test2 started");
  
  Assert.assertNotEquals("Hello1", "Hello");
	  
	  System.out.println("Test2 completed");
	  
  }
  
  @Test
  public void test3() {
  System.out.println("Test3 started");
	 Object test=null;
	 Assert.assertNull(test, "test not null");
	  
	  System.out.println("Test3 completed");
	  
  }
  
  @Test
  public void test4() {
  System.out.println("Test4 started");
	 Assert.fail("Failing the test");
	  
	  System.out.println("Test4 completed");
	  
  }
  
}
