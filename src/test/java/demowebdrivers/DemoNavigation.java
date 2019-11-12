package demowebdrivers;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoNavigation {
	
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
  }
  

@Test
  public void f() {
	  driver.get("http://www.google.com");
	  
	  System.out.println(driver.getTitle());
	 driver.navigate().to("http://www.seleniumhq.com");
	 System.out.println(driver.getTitle());
	 driver.navigate().back();
	 System.out.println(driver.getTitle());
	 driver.navigate().refresh();
	 System.out.println(driver.getTitle());
	 
	 
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
