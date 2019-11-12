package demowebdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoFrames {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
	}
	
	@Test
  public void f() throws InterruptedException {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(.,'org.openqa.selenium.chrome')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.xpath("//a[@href='ChromeDriver.html'][contains(.,'ChromeDriver')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[contains(.,'org.openqa.selenium.remote.RemoteWebDriver')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();	
		
		
		
		
  }
}
