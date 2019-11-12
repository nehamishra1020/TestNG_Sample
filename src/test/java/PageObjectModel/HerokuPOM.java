package PageObjectModel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class HerokuPOM {
	
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
		  
		  HerokuOR objectOR =new HerokuOR(driver);
		  PageFactory.initElements(driver, HerokuOR.class);
		  objectOR.username.sendKeys("tomsmith");
		  objectOR.pwd.sendKeys("SuperSecretPassword!");
		  objectOR.login.click();
		 
		  
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

	}
