package demowebdrivers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWindows {
	
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
	  driver.get("http://the-internet.herokuapp.com/windows");
	  String handleP =driver.getWindowHandle();
	  System.out.println(handleP);
	  driver.findElement(By.xpath("//a[contains(.,'Click Here')]")).click();
	  Set<String> handleALL =driver.getWindowHandles();
	  for(String Child:handleALL){
		  
		  driver.switchTo().window(Child);
		  System.out.println(Child);
	  }
	  System.out.println("switch to child window" + driver.getTitle());
	 
	  
	  driver.switchTo().window(handleP);
	  System.out.println("switch to parent window" + driver.getTitle());
	  
  }


@AfterTest
public void afterTest() {
	  driver.quit();
}
}

