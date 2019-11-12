package demowebdrivers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemogetText {
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://book.theautomatedtester.co.uk/chapter1");
	  }
 

  
  @Test
  public void f() {
	  WebElement button= driver.findElement(By.id("secondajaxbutton"));
	String text=  button.getText();
	String newtext =button.getAttribute("value");
	 System.out.println(newtext);
	 button.click();
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
