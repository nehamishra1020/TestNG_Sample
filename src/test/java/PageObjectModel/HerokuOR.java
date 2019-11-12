package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HerokuOR {
	
	public HerokuOR(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="input#username")
	public WebElement username;
	
	@FindBy(css="input#password")
	public WebElement pwd;
	
	@FindBy(how = How.CSS, using="button.radius")
	public WebElement login;
	
	
	

}
