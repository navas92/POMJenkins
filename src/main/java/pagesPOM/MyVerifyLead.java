package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MyVerifyLead extends ProjectMethodsCommon {
	
	public MyVerifyLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "viewLead_firstName_sp")
	WebElement  firstName;
	@FindBy(id = "viewLead_firstNameLocal_sp")
	WebElement FlocalName;
	
	@Then("Verify the first Name as (.*)")
	public MyVerifyLead verfiyCreateLead(String expect) {
		
		verifyExactText(firstName, expect);
		
		return this;
	}
	
	@And("Verify the Local FirstName as (.*)")
	public MyVerifyLead verfiyEditLead(String expect) {
		
		verifyExactText(FlocalName, expect);
		
		return this;
	}
	
	@And("Verify the duplicate First Name as (.*)")
	public MyVerifyLead verfiyDuplicateLead(String expect) {
		
		verifyExactText(FlocalName, expect);
		
		return this;
	}
}
