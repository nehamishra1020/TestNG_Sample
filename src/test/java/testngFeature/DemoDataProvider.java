package testngFeature;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemoDataProvider {
	
  @Test(dataProvider ="credentials")
  public void login(String username, String password) {
	  System.out.println("User Name is :" + username);
	  System.out.println("Password is :" + password);
	  
  }

  @DataProvider(name="credentials")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "selenium", "basic" },
      new Object[] { "mercury", "test" },
      new Object[] { "neha", "bajpai" },
    };
  }
}
