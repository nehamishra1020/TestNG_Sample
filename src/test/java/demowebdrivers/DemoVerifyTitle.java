package demowebdrivers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoVerifyTitle {
	WebDriver driver;
	
  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.newtours.demoaut.com/");
  }
  
  @Test
  public void f() {
	 String runtime= driver.getTitle();
	 Assert.assertEquals(runtime, "Welcome: Mercury Tours");
	 driver.findElement(By.linkText("REGISTER")).click();
	 String RegisterPage =driver.getTitle();
	 Assert.assertEquals(RegisterPage, "Register: Mercury Tours");
	 
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
