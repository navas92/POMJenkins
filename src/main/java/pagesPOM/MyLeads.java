package pagesPOM;

import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;

public class MyLeads extends ProjectMethodsCommon {
	
	public MyLeads() {
		PageFactory.initElements(driver, this);
	}

		
}
