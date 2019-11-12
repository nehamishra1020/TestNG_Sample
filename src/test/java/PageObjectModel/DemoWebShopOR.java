package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopOR {
	
	public DemoWebShopOR(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Email")
	public WebElement username;
	
	@FindBy(how = How.NAME, using="Password")
	public WebElement password;
	

	@FindBy(how = How.XPATH, using="//input[@value='Log in']")
	public WebElement login;
	
	@FindBy(how = How.XPATH, using="//a[@class='ico-logout']")
	public WebElement logout;
	
	@FindBy(how = How.XPATH, using="//a[contains(@class,'ico-login')]")
	public WebElement loginnew;
	
	
	
	
	
	
	

}
