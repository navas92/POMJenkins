package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;

public class MyViewLead extends ProjectMethodsCommon {
	
	public MyViewLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Edit']")
	WebElement  Edit;
	
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement  Delete;
	
	@FindBy(xpath = "//a[text()='Duplicate Lead']")
	WebElement  Duplicate;
	
		
	@And("Click on Edit Button")
	public MyEditLead Edit() {
		
		click(Edit);
		
		return new MyEditLead();
	}

	@And("Click on Delete Button")
public MyLeads Delete() {
		
		click(Delete);
		
		return new MyLeads();
	}
@And("Click on Duplicate Button")
public MyDuplicateLead Duplicate() {
	click(Duplicate);
	return new MyDuplicateLead();
}
	
}
