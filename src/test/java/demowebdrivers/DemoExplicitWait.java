package demowebdrivers;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoExplicitWait {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	}
	
	
	
	@Test
  public void f() {
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
	List<WebElement> logout=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("SINGN-OFF")));
	Assert.assertNotNull(logout);
		
  }
}
