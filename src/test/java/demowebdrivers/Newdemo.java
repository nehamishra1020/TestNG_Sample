package demowebdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newdemo {
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
	  
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//i[contains(text(), 'Logout')]")).click();
	  
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
