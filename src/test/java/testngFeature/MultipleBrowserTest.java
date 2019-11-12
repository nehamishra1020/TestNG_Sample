package testngFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
	
	WebDriver  driver;
	@BeforeTest
	
	public void teststart(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
		
	}
  @Test(priority=1)
  public void OpenChrome() throws InterruptedException {
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mvnrepository.com");
		Thread.sleep(3000);//add wait for 3 seconds
		driver.close();
	  
  }
  @SuppressWarnings("deprecation")
@Test(priority=3)
  public void OpenIE() throws InterruptedException {
	  
	  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	  caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		driver=new InternetExplorerDriver(caps);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);//add wait for 3 seconds
		driver.switchTo().defaultContent();
		driver.close();
  }
  
  @Test(priority=2)
  public void OpenFirefox() throws InterruptedException {
	  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(3000);//add wait for 3 seconds
		driver.close();
  }
  
  
}
