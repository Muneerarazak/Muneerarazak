package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	public WebElement getSignout() {
		return signout;
	}




	@FindBy(xpath="//span[text()='Logout']")
	private WebElement signout;
	
	
	
	public void signoutbtn()
	{
		signout.click();
	}
	
	
	
	
}
