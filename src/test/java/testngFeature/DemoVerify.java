package testngFeature;

import org.testng.annotations.Test;

public class DemoVerify {
  @Test
  public void f() {
	  
	  System.out.println("test 1 started ");
	  try{
	  int data = 50/0;
	  }catch (Exception e){
		  System.out.println("error divide by 0");
	  }
	  
	  System.out.println("test 1 completed ");
	  
	  
  }
}
