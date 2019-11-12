package testngFeature;

import org.testng.annotations.Test;

public class MercuryTravel {
	
	
  @Test(priority=1)
  public void OpenBrowser() {
	  System.out.println("Open browser");
  }
  
  @Test(priority=2)
  public void OpenURL() {
	  System.out.println("OpenURL");
  }
  
  
  @Test(priority=3)
  public void login() {
	  System.out.println("login");
  }
  
  
  @Test(priority=4, enabled=false)
  public void SearchFlight() {
	  System.out.println("SearchFlight");
  }
  
  
  @Test(priority=5)
  public void BookFlight() {
	  System.out.println("Bookflight");
  }
  
  
  @Test(priority=6)
  public void Logout() {
	  System.out.println("logout");
  }
  
  
  @Test(priority=7)
  public void CloseBrowser() {
	  System.out.println("close browser");
  }
  
  
}
