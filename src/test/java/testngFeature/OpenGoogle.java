package testngFeature;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenGoogle {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.get("https://www.seleniumhq.org/");
		Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
