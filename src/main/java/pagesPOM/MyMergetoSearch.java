package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;

public class MyMergetoSearch extends ProjectMethodsCommon {
	
	public MyMergetoSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name = 'firstName'])[1]")
	WebElement FirstName2;
	
	
	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement findButton;
	
	
	@FindBy(xpath = "(//a[@class='linktext'])[1]")
	WebElement FirstElement;
	
	

	public MyMergetoSearch FirstName2(String name2) {
		type(FirstElement, name2);
		return this;
			}
	
	public MyMergetoSearch FindButton() {
		click(findButton);
		return this;
	}
	
	public MyMergeSearch FirstElement() {
		click(findButton);
		return new MyMergeSearch();
	}
	
	public MyMergeFromSearch window2() {
		switchToWindow(0);
		return new MyMergeFromSearch();
}
}
