package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.ProjectMethodsCommon;
import pagesPOM.MyHomePage;


public class TC005_DeleteLead extends ProjectMethodsCommon {
	
	@BeforeTest
	public void setValues() {
		
		browserName = "chrome";
		testCaseName = "DeleteLead Functionality";
		testDescription = "Delete a created Lead";
		testNodes = "Leads";
		category = "smoke";
		authors = "Rohith";
		dataSheetName  = "DeleteLead";
		
		
		/*excelName = "DeleteLead";
		testCaseName = "deleteLead";
		testDescription = "Delete To Leads";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";*/
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void deleteLead(String Uname,String Pwd,String fname) throws Exception {
		
		new MyHomePage()
		.typeUserName(Uname)
		.typePassword(Pwd)
		.clickLogin()
		.ClickCrf()
		.clickLeads()
		.clickFindlead()
		.FirstName(fname)
		.FindLead()
		.sleep()
		.Firstlink()
		.Delete();
		
		
		
	}
	
		
		
}
