package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(name="UserName")
	private WebElement usernametext;
	
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement signinbutn;


	public WebElement getUsernametext() {
		return usernametext;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getSigninbutn() {
		return signinbutn;
	}
	
	
	


	public void login(String username, String password) {
		usernametext.sendKeys(username);
		passwordTextField.sendKeys(password);
		signinbutn.click();
			
	}


	public void logincredential(String username, String password) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
