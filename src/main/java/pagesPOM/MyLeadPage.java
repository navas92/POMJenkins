package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;

public class MyLeadPage extends ProjectMethodsCommon {
	
	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText = "Create Lead")
	WebElement  eleCreartLead;
	
	@FindBy(linkText = "Merge Leads")
	WebElement  eleMergeLead;
	
	@FindBy(linkText = "Find Leads")
	WebElement  eleFindLead;
	
	@FindBy(linkText = "Leads")
	WebElement Leadstab;
	


	@And("click on Create Lead Button")
	public MyCreateLead clickCreateLead() {
		click(eleCreartLead);
		return new MyCreateLead();
	}
	
	public MyMergeSearch clickMergelead() {
		click(eleMergeLead);
		return new MyMergeSearch();
	}
	
	public MyFindLeadSearch clickFindlead() {
		click(eleFindLead);
		return new MyFindLeadSearch();
	}
	@And("Click on Leadstab")
	public MyFindLead MyLeadstab () {
		click(Leadstab);
		return new MyFindLead();
		
	}
	
}
