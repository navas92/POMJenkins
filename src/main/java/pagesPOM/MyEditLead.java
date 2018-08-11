package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;

public class MyEditLead extends ProjectMethodsCommon {
	
	public MyEditLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "updateLeadForm_firstNameLocal")
	WebElement  FlocalName;
	
	@FindBy(xpath = "(//input[@name='submitButton'])[1]")
	WebElement  update;
	
	@And("Enter the localFirstName as (.*)")
	public MyEditLead localname(String loname) {
		
		type(FlocalName,loname);
		return this;
	}
	
	@And("Click on Update button")
public MyVerifyLead update() {
		
	click(update);
		return new MyVerifyLead();
	}
}
