package mavendemo.mavensample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\n.e.mishra\\workspace\\mavensample\\Resources\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(3000);//add wait for 3 seconds
		driver.close();

	}

}
