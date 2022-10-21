package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employeemodule {
	
	public Employeemodule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-users']")
	private WebElement emplyeedropdown;
	
	
	@FindBy(xpath="//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")
	private WebElement createemployee;


	public WebElement getEmplyeedropdown() {
		return emplyeedropdown;
	}


	public WebElement getCreateemployee() {
		return createemployee;
	}
	
	
	
	public void empleeclick()
	{
		emplyeedropdown.click();
		createemployee.click();
		
	}
	
	
	
	
	

}
