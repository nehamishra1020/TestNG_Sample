package demowebdrivers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoLinkEnable {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
  }

  
  @Test
  public void f() {
	  WebElement link = driver.findElement(By.linkText("Images"));
	  Boolean status = link.isEnabled();
	  System.out.println("link status is " + status);
	  link.click();
	  
	 String title = driver.getTitle();
	String url =  driver.getCurrentUrl();
	System.out.println("link tiitle is " + title);
	System.out.println("link url is " + url);
	Assert.assertEquals(title, "Google Images");
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
