package GenericLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver_Utility wlib=new WebDriver_Utility();
	public Excel_Utility exlu=new Excel_Utility();
	
	public static WebDriver sDriver;
	public WebDriver driver=null;
	 propertyUtility plib=new  propertyUtility();

	@BeforeSuite
	public void BS()
	{
		System.out.println("Database connection");
		
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Execute Script in Parallel");
    }
	


 @BeforeClass
 public void BC() throws Throwable
 {
		String Browser=plib.getPropertyKeyValue("browser");
	   if(Browser.equalsIgnoreCase("edge"))
	   {
	   
    	WebDriverManager.edgedriver().setup();
    	 driver=new EdgeDriver();
	   }
	   else 
		   if(Browser.equalsIgnoreCase("firefox"))
		   {
			   WebDriverManager.firefoxdriver().setup();
		    	 driver=new FirefoxDriver(); 
		   }
		   else
			   if(Browser.equalsIgnoreCase("chrome"))
			   {
				   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
			   }
			   else
			   {
			    	 driver=new ChromeDriver();
  
			   }
sDriver=driver;
 }


@BeforeMethod
 public void BM() throws Throwable
{
	 System.out.println("LOGIN TO Application");
	 String Url=plib.getPropertyKeyValue("url");
	 String username=plib.getPropertyKeyValue("un");
	 String password=plib.getPropertyKeyValue("pwd");
	 driver.get(Url);
     driver.manage().window().maximize();

     LoginPage loginpage=new LoginPage(driver);
	 loginpage.login(username, password);
		
	
}

@AfterMethod
public void AM()
{

	System.out.println("logout from application");
}

@AfterClass(groups={"smoketest","regressionTest"})
public void AC()
{
	System.out.println("CLOSING THE BROWSER");
}

@AfterTest(groups={"smoketest","regressionTest"})
public void AT()
{
	System.out.println("EXECUTE AFTER ALL TEST METHODS");
}


@AfterSuite

public void AS()
{
	System.out.println("close the database connection");

}
}





