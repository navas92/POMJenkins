package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.ProjectMethodsCommon;
import pagesPOM.MyHomePage;

public class TC006_DuplicateLead extends ProjectMethodsCommon {
	
	@BeforeTest
	public void setValues() {
		
		browserName = "chrome";
		testCaseName = "DuplicateLead Functionality";
		testDescription = "DuplicateLead a created Lead";
		testNodes = "Leads";
		category = "smoke";
		authors = "Rohith";
		dataSheetName  = "DuplicateLead";
		
		
	/*	excelName = "DuplicateLead";
		testCaseName = "duplicateLead";
		testDescription = "DuplicateLead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";*/
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void duplicateLead(String Uname,String Pwd,String fname,String fname1) throws Exception {
		
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
		.Duplicate()
		.firstname(fname1)
		.update()
		.verfiyDuplicateLead(fname1);
		
	}	
		
}
