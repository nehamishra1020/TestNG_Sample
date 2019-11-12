package demowebdrivers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoPageScource {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
  }
  
  @Test
  public void f() {
	  driver.get("https://en.wikipedia.org/wiki/Main_Paage");
	  System.out.println(driver.getPageSource());
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
