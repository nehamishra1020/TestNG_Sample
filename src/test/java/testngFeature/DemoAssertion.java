package testngFeature;

import javax.swing.SingleSelectionModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion {
	
  @Test
  public void test1() {
	  System.out.println("Test1 started");
	  Assert.assertTrue(20<18, "Error : 81 less that 20");
	  
	  System.out.println("Test1 completed");
	  
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2 started");
	  Assert.assertFalse("Hello".contains("hi"), "Error");
	  
	  System.out.println("Test2 completed");
	  
	  
  }
  
  @Test
  public void test3() {
	  
	  System.out.println("Test3 started");
	  Assert.assertTrue("Hello".contains("hi"), "Error");
	  
	  System.out.println("Test3 completed");
  }
}
