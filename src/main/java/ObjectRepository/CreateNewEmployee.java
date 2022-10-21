package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewEmployee {
	
	
	public  CreateNewEmployee(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

@FindBy(id="FirstName")
private WebElement Firstnametext;



@FindBy(id="LastName")
private WebElement  Lastnametext;

@FindBy(id="EmailId")
private WebElement emailidtext;

@FindBy(id="MobileNo")
private WebElement Mobilenotext;

@FindBy(xpath="//i[@class='fa fa-calendar']")
private WebElement Calenderselect;

@FindBy(xpath="//td[@data-date='1664496000000']")
private WebElement selectdate;



@FindBy(xpath="//input[@class='cursor-P']")
private WebElement radiobtn;


@FindBy(id="Address")
private WebElement addresstext;


@FindBy(id="CountryId")
private WebElement dropdwoncountryname;


@FindBy(name="CityId")
private WebElement cityidselect;



@FindBy(id="chkSkill_1")
private WebElement courseselection;


@FindBy(xpath="//button[text()='Save']")
private WebElement savebtn;


@FindBy(id="chkSkill_1")
private WebElement qasecetion;



public WebElement getFirstnametext() {
	return Firstnametext;
}


public WebElement getLastnametext() {
	return Lastnametext;
}


public WebElement getEmailidtext() {
	return emailidtext;
}


public WebElement getMobilenotext() {
	return Mobilenotext;
}


public WebElement getCalenderselect() {
	return Calenderselect;
}

public WebElement getRadiobtn() {
	return radiobtn;
}


public WebElement getAddresstext() {
	return addresstext;
}


public WebElement getDropdwoncountryname() {
	return dropdwoncountryname;
}


public WebElement getCityidselect() {
	return cityidselect;
}


public WebElement getCourseselection() {
	return courseselection;
}


public WebElement getSavebtn() {
	return savebtn;
}

public WebElement getQasecetion() {
	return qasecetion;
}

public void firstname(String fname)

{
	Firstnametext.sendKeys(fname);
}

public void lasttname(String lname)

{
	Lastnametext.sendKeys(lname);
}



public void email(String emailname)
{
	emailidtext.sendKeys(emailname);
}


public void mobile(String num)
{
	Mobilenotext.sendKeys(num);
}


public void calender()
{
	Calenderselect.click();
	selectdate.click();
}

public void radio()
{
	radiobtn.click();
}

public void add(String address)
{
	addresstext.sendKeys(address);
}

public void selectcounty()
{
	dropdwoncountryname.click();
}
public void selectcity()
{
	cityidselect.click();
	
}

public void qacourse()
{
	qasecetion.click();

}

public void savebt()
{
	savebtn.click();
}





}