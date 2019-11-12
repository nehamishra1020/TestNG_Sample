package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShopPOM {
	
	WebDriver driver;
	
	
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
			
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demowebshop.tricentis.com/login");
	  }
	  
  @Test(dataProvider ="credentials")
  public void f(String username, String password) throws InterruptedException {
	  DemoWebShopOR objectOR =new DemoWebShopOR(driver);
	  PageFactory.initElements(driver, DemoWebShopOR.class);
	  System.out.println(driver.getTitle());
	  objectOR.username.sendKeys(username);
	  objectOR.password.sendKeys(password);
	  objectOR.login.click();
	  Thread.sleep(2000);
	  objectOR.logout.click();
	  objectOR.loginnew.click();
	  
  }

  
  @DataProvider(name="credentials")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "pratiksha@test.com", "pratiksha" },
      new Object[] { "kalpesh@test.com", "kalpesh" },
  };
  }
}
  

