package demowebdrivers;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demotest {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
  }

  
  @SuppressWarnings("deprecation")
@Test
  public void f() throws InterruptedException {
	  driver.get("https://en.wikipedia.org/wiki/Main_Paage");
	  driver.findElement(By.name("search")).sendKeys("Selenium(software)");
	 driver.findElement(By.name("go")).click();
	 WebElement link = driver.findElement(By.linkText("Create account"));
	 Boolean status = link.isEnabled();
	  System.out.println("link status is " + status);
	  link.click();
	 String titile = driver.getTitle();
	 System.out.println(titile);
	 
	 Assert.assertEquals(titile, "Create account - Wikipedia");
	  System.out.println(driver.getCurrentUrl());
	 String URL = driver.getCurrentUrl();
	 if(URL.contains("wikipedia.org")){
		 System.out.println("internal link");
		 
	 }else{
		 System.out.println("external link");
	 }
	  
	 driver.navigate().back();
	 driver.navigate().to("https://www.seleniumhq.org/");
	 Thread.sleep(2000);
	 String titile1 = driver.getTitle();
	 System.out.println(titile1);
	 Assert.assertEquals(titile1, "Selenium(software) - Search results - Wikipedia");
	  System.out.println(driver.getCurrentUrl());
	  JavascriptExecutor jse = (JavascriptExecutor)driver;  
	  jse.executeScript("window.scrollBy(0,100)", "");
	  WebElement link1 = driver.findElement(By.xpath("//a[contains(text(),'www')]"));
		 Boolean status1 = link1.isEnabled();
		  System.out.println("link status is " + status1);
		  link.click();
		  String titile2 = driver.getTitle();
		  System.out.println(titile2);
			 Assert.assertEquals(titile2, "Create Account - Wikipedia");
			  System.out.println(driver.getCurrentUrl());
		  
			  if(URL.contains("wikipedia.org")){
					 System.out.println("internal link");
					 
				 }else{
					 System.out.println("external link");
				 }
	  
	  
	  
	  
	  
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
