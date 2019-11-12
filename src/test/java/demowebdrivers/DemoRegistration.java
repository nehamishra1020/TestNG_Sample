package demowebdrivers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoRegistration {
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
	  }
	
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("neha");
	  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("mishra");
	  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("091245555");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("nehamishra");
	  driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("c-1105 punawale");
	  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
	  driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
	  driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("400133");
	  Select sec= new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  //sec.selectByIndex(107);
	  //sec.selectByValue("92");	  
	  sec.selectByVisibleText("INDIA");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("neha@test.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1234");
	  driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("test1234");
	  driver.findElement(By.xpath("//input[@name='register']")).submit();
	  String title= driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Register: Mercury Tours");
	  
	  
	  
	  
	  
	  
  }
 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
