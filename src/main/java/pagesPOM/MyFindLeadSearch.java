package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;

public class MyFindLeadSearch extends ProjectMethodsCommon {
	
	public MyFindLeadSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name = 'firstName'])[3]")
	WebElement FirstName;
	
	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement FindLead;
	
	@FindBy(xpath = "(//a[@class='linktext'])[4]")
	WebElement Firstlink;
	
	@And("Enter the FirstName as (.*)")
	public MyFindLeadSearch FirstName(String fName) {
		//clear(FirstName);
		type(FirstName, fName);
		return this;
	}
	
	@And("Click on Find Lead Button")
	public MyFindLeadSearch FindLead() {
		click(FindLead);
		return this;
	}
	public MyFindLeadSearch sleep() throws Exception {
		java.lang.Thread.sleep(3000);
		return this;
	}
	@And("Click on first Link")
		public MyViewLead Firstlink() {
		click(Firstlink);
		return new MyViewLead();
	}

	
}
