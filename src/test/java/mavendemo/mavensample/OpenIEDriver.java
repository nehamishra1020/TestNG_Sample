package mavendemo.mavensample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "Resources\\IEDriverServer.exe");
		
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(3000);//add wait for 3 seconds
		driver.close();
	}

}
