package demowebdrivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestWindowhandle {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
	}


	@Test
	public void f() {
		String handleP =driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(.,'Online Chat Support')]")).click();
		Set<String> handleALL =driver.getWindowHandles();
		for(String Child:handleALL){

			driver.switchTo().window(Child);
			System.out.println(Child);
		}
		System.out.println("switch to child window" + driver.getTitle());
		driver.findElement(By.xpath("//input[contains(@type,'Submit')]")).click();
		System.out.println("child window closed");
		driver.switchTo().window(handleP);
		System.out.println("switch to parent window" + driver.getTitle());
	}


	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}


