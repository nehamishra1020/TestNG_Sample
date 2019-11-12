package demowebdrivers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoCSSSelector {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://the-internet.herokuapp.com/login");
  }

  
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
	  driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.cssSelector("button.radius")).click();
	  Thread.sleep(2000);
	  
	  
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
