package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.ProjectMethodsCommon;
import pagesPOM.MyHomePage;

public class TC002_CreateLeadNeg extends ProjectMethodsCommon {
	
	@BeforeTest
	public void setValues() {
		
		browserName = "chrome";
		testCaseName = "Create nagtive flow for CreateLead";
		testDescription = "Login to LeafTaps";
		testNodes = "Leads";
		category = "smoke";
		authors = "Rohith";
		dataSheetName  = "CreateLeadNeg";
		
		/*excelName = "CreateLeadNeg";
		testCaseName = "createLeadNeg";
		testDescription = "Create Lead Neagtive Scenario";
		category = "Sanity";
		author = "Rohith";
		moduleName = "Leads";*/
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void createLead(String Uname,String Pwd,String cname, String Fname, String Lname, String PNo, String ErrorMsg) {
		
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
		.pNo(PNo)
		.createSubmitNeg()
		.errorMsg(ErrorMsg);
		/*.createSubmit()
		.verfiyCreateLead(Fname);*/
	}

}
