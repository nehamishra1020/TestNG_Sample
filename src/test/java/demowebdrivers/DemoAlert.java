package demowebdrivers;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoAlert {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
  }
  
  @Test(priority=1)
  public void f() {
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]")).click();
	  String msg =driver.switchTo().alert().getText();
	  Assert.assertEquals(msg, "I am an alert box!");
	  System.out.println(msg);
			
	  driver.switchTo().alert().accept();
	  
  }
  
  @Test(priority=2)
  public void f2() {
	  
	  driver.findElement(By.xpath("//a[contains(.,'Alert with OK & Cancel')]")).click();
	  driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  String msg2 =driver.switchTo().alert().getText();
	  Assert.assertEquals(msg2, "Press a Button !");
	  System.out.println(msg2);
	  driver.switchTo().alert().dismiss();  
	  
	   
  }
  
  @Test(priority=3)
  public void f3() {
	  
	  driver.findElement(By.xpath("//a[contains(.,'Alert with Textbox')]")).click();
	  driver.findElement(By.xpath("//button[contains(@class,'btn btn-info')]")).click();
	  driver.switchTo().alert().sendKeys("Neha Mishra");
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
	  
	  
	   
  }


}
