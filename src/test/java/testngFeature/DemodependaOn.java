package testngFeature;

import org.testng.annotations.Test;

public class DemodependaOn {
	
  @Test
  public void openBrowser() {
	  
	  System.out.println("Open browser method ");
  }
  
  @Test(dependsOnMethods={"openBrowser"})
  public void login() {
	  System.out.println("Open login ");
  }
  
  @Test(dependsOnMethods={"login"})
  public void logout() {
	  System.out.println("Open logout ");
  }
}
