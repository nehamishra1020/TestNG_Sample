package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DemotestDay3 {
	
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
	  
	  String title1=driver.getTitle();
	  Assert.assertEquals(title1, "Welcome: Mercury Tours");
	  System.out.println(title1);
	  driver.findElement(By.xpath("//a[contains(.,'SIGN-ON')]")).click();
	  driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(.,'SIGN-OFF')]")));
	  String title2=driver.getTitle();
	  System.out.println(title2);
	  Assert.assertEquals(title2, "Find a Flight: Mercury Tours:");
	  System.out.println(title2);
	  driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	  String title3=driver.getTitle();
	  System.out.println(title3);
	  Assert.assertEquals(title3, "Select a Flight: Mercury Tours");
	  System.out.println(title2);
	  driver.findElement(By.xpath("//input[contains(@value,'Blue Skies Airlines$361$271$7:10')]")).click();
	  driver.findElement(By.xpath("//input[@height='23']")).click();
	  
	  
	  
	  
	  
	  
	  
  }
}
