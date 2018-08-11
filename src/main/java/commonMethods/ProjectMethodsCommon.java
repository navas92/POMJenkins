package commonMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import commonMethods.ReadExcel;

public class ProjectMethodsCommon extends SeMethodsCommon{

	public String browserName;
	public String dataSheetName;

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}

	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp(browserName);		
	}

	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterMethod
	public void afterMethod(){
		closeAllBrowsers();
	}

	@DataProvider(name="getData")
	public  Object[][] getData(){
		return ReadExcel.getSheet(dataSheetName);		
	}	

}
