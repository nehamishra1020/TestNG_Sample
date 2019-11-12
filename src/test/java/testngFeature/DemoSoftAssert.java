package testngFeature;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
 
	@Test
  public void f() {
		
		SoftAssert sa = new SoftAssert();
		System.out.println("Test1 started");
	    sa.assertEquals(10, 12);
	    
	    System.out.println("Test2 started");
	    sa.assertNotEquals("Hello", "Hello");
	    
	    sa.assertAll(); //collects all the error and display on console
  }
}
