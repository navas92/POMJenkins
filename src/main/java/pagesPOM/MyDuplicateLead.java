package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;
public class MyDuplicateLead extends ProjectMethodsCommon {
	
	public MyDuplicateLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "createLeadForm_firstNameLocal")
	WebElement  FlocalName;
	
	@FindBy(xpath = "(//input[@name='submitButton'])[1]")
	WebElement  update;
	
	@And("Enter the First Name as (.*)")
	public MyDuplicateLead firstname(String fname1) {
		
		type(FlocalName,fname1);
		return this;
	}
	
	@And("Click on Update Button")
	public MyVerifyLead update() {
		
	click(update);
	return new MyVerifyLead();
	}
}
