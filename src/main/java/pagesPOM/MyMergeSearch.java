package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.ProjectMethodsCommon;

public class MyMergeSearch extends ProjectMethodsCommon {
	
	public MyMergeSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@src='/images/fieldlookup.gif'])[1]")
	WebElement From;
	
	@FindBy(xpath = "(//img[@src='/images/fieldlookup.gif'])[2]")
	WebElement To;
	
	@FindBy(xpath = "//a[text()='Merge']")
	WebElement Merge;
	
	
	public MyMergeSearch ClickFrom() {
		click(From);
		return this;
	}
	
	public MyMergeSearch ClickTo() {
		click(To);
		return this;
	}
	
	public MyMergeSearch ClickMerge() {
		click(Merge);
		return this;
	}
	
	
	public MyVerifyLead Alert() {
		acceptAlert();
		return new MyVerifyLead();
	}
	
	public MyMergeFromSearch windowone() {
		switchToWindow(1);
		return new MyMergeFromSearch();
}
	public MyMergetoSearch windowtwo() {
		switchToWindow(1);
		return new MyMergetoSearch();
}

	
}
