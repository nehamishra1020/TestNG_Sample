package demowebdrivers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoCheckbox {
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
  }
  
  @Test
  public void f() throws InterruptedException {
	  WebElement box= driver.findElement(By.name("selected(1234)"));
	 if(box.isSelected()){
		 System.out.println("Check box is selected");
	 }
	 else{
		 System.out.println("Check box is NOT selected");
	 }
	 box.click();
	 Thread.sleep(2000);
	 if(box.isSelected()){
		 System.out.println("Check box is selected");
	 }
	 else{
		 System.out.println("Check box is NOT selected");
	 }
	 
  }
  
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
