package TestScripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.WebDriver_Utility;
import ObjectRepository.CreateNewEmployee;
import ObjectRepository.Employeemodule;
import ObjectRepository.HomePage;

public class EmployeeModulesTest extends BaseClass {
	@Test
	public void employeetest() throws Throwable
	{
		 wlib.waitForPageToLoad(driver);
		HomePage home=new HomePage(driver);

		Employeemodule emp =new Employeemodule(driver);
	    emp.empleeclick();
	    CreateNewEmployee crtnew=new CreateNewEmployee(driver);
	    
	   String FNAME= exlu.getDatatExcelsheet("Sheet1", 1, 0);
	    crtnew.firstname(FNAME);
	     
	   String LNAME= exlu.getDatatExcelsheet("Sheet1", 1, 1);
	   crtnew.lasttname(LNAME);
	      
	   String EMAIL= exlu.getDatatExcelsheet("Sheet1", 1, 2);
	    crtnew.email(EMAIL);
	    
	   String MOB= exlu.getDatatExcelsheet("Sheet1", 1, 3);
	    crtnew.mobile(MOB);
	    
	    crtnew.calender();
	   crtnew.radio();
	   String Locat= exlu.getDatatExcelsheet("Sheet1", 1, 4);
	   crtnew.add(Locat);
	   
	      
	   wlib.select(crtnew.getDropdwoncountryname(),1);
	   wlib.select(crtnew.getCityidselect(), 4);
	   
	    crtnew.qacourse();
	    crtnew.savebt();
	   
	}

}
