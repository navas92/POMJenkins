package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.ProjectMethodsCommon;
import pagesPOM.MyHomePage;

public class TC003_MergeLead extends ProjectMethodsCommon {
	
	@BeforeTest
	public void setValues() {
		
		browserName = "chrome";
		testCaseName = "MergeLead Functionality";
		testDescription = "Merge Two Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "Rohith";
		dataSheetName  = "MergeLead";
		
		
	/*	
		excelName = "MergeLead";
		testCaseName = "mergelead";
		testDescription = "Merge To Leads";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";*/
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void mergelead(String Uname,String Pwd,String name1, String name2) throws Exception {
		
		new MyHomePage()
		.typeUserName(Uname)
		.typePassword(Pwd)
		.clickLogin()
		.ClickCrf()
		.clickLeads()
		.clickMergelead()
		.ClickFrom()
		.windowone()
		.firstname1(name1)
		.findButton()
		.sleep()
		.FirstElement()
		.windowzero()
		.ClickTo()
		.windowtwo()
		.FirstName2(name2)
		.FindButton()
		
		.FirstElement()
		.ClickMerge()
		.Alert();
		
		
		
		
		
		
	}
	
		
		
}
