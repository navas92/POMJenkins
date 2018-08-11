package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;

public class MyFindLead extends ProjectMethodsCommon {
	
	public MyFindLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Find Leads")
	WebElement  Findleadlink;
	
	
	@And("Click on FindLead link")
	public MyFindLeadSearch Findleadlink() {
		
		click(Findleadlink);
		
		return new MyFindLeadSearch();
	}
	
}