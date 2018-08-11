package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;

public class MyMergeFromSearch extends ProjectMethodsCommon {
	
	public MyMergeFromSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement FirstName1;
		
	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement findButton;
	
	@FindBy(xpath = "(//a[@class='linktext']/following::div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")
	WebElement FirstElement;
	
	public MyMergeFromSearch firstname1(String name1) {
		type(FirstName1, name1);
		return this;
			}
	public MyMergeFromSearch findButton() {
		click(findButton);
		return this;
	}
	
	public MyMergeFromSearch FirstElement() {
		click(FirstElement);
		return this;	}
	
	public MyMergeFromSearch sleep() throws Exception  {
		java.lang.Thread.sleep(3000);
		return this;
	}
	public MyMergeSearch windowzero() {
		switchToWindow(0);
		return new MyMergeSearch();
	
		}
}
	