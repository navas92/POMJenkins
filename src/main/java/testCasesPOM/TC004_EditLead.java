package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.ProjectMethodsCommon;
import pagesPOM.MyHomePage;

public class TC004_EditLead extends ProjectMethodsCommon {
	
	@BeforeTest
	public void setValues() {
		
		
		browserName = "chrome";
		testCaseName = "Edit Functionality";
		testDescription = "Edit lead with Valid Values";
		testNodes = "Leads";
		category = "smoke";
		authors = "Rohith";
		dataSheetName  = "EditLead";
		
		
		/*excelName = "EditLead";
		testCaseName = "editLead";
		testDescription = "Edit The Leads";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";*/
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void editLead(String Uname,String Pwd,String fname, String loname) throws Exception {
		
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
		.Edit()
		.localname(loname)
		.update()
		.verfiyEditLead(loname);
		
		
		
	}
	
		
		
}
