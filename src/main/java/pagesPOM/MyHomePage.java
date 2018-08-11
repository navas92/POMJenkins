package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
public class MyHomePage extends ProjectMethodsCommon {
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogin;
	@FindBy(linkText = "Leads")
	WebElement  eleLeads;
	@FindBy(linkText = "CRM/SFA")
	WebElement  ClickCRM;
	
	@Given("enter the username as (.*)")
	public MyHomePage typeUserName(String data) {
		// eleUName = locateElement("username");
		type(eleUserName, data);		
		return this;
	}

	@And("enter the Password as (.*)")
	public MyHomePage typePassword(String data) {
		type(elePassword, data);
		return this;
	}


	@And("click on Login Button")
	public MyHomePage clickLogin() {
		click(eleLogin);	
		return new MyHomePage();
	}
	
	@And("verify the Login Successfully")
	public MyHomePage verifyLogin() {
		verifyEnabled(eleLogin);	
		return this;
	}
	@And("Click on CRFlink")
	public MyHomePage ClickCrf() {
		click(ClickCRM);	
		return this;
	}
	
	@And("Click CRF/SFA")
	public MyLeadPage clickLeads() {
		click(eleLeads);
		return new MyLeadPage();
	}
	
}
