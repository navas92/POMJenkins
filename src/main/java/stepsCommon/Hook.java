package stepsCommon;

import commonMethods.SeMethodsCommon;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends SeMethodsCommon{

	@Before
	public void before(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("gopi");
		startApp("chrome");
	}
	@After
	public void after() {
		//After method
		closeAllBrowsers();
		//After Suite
		endResult();
	}

}





