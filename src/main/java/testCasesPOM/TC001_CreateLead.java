package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.ProjectMethodsCommon;
import pagesPOM.MyHomePage;


public class TC001_CreateLead extends ProjectMethodsCommon {
	
	@BeforeTest
	public void setValues() {
		
		browserName = "chrome";
		testCaseName = "CreateLead for TestLeaf";
		testDescription = "Create Lead with Valid Values";
		testNodes = "Leads";
		category = "smoke";
		authors = "Rohith";
		dataSheetName  = "CreateLead";
		
		/*excelName = "CreateLead";
		testCaseName = "createLead";
		testDescription = "Create a new lead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";*/
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void createLead(String Uname,String Pwd,String cname, String Fname, String Lname, String PNo) {
		
		new MyHomePage()
		.typeUserName(Uname)
		.typePassword(Pwd)
		.clickLogin()
		.ClickCrf()
		.clickLeads()
		.clickCreateLead()
		.companyname(cname)
		.firstName(Fname)
		.lastName(Lname)
		//.SourceDD(Value1)
		.pNo(PNo)
		.createSubmit()
		.verfiyCreateLead(Fname);
	}

}
