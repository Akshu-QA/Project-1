package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;
import base.PageObject_s;

public class ElementDisplayedExampleTC extends Base {

	@Test(priority = 4)
	public void switchToAlertExample() throws InterruptedException {

		PageObject_s p = PageFactory.initElements(driver, PageObject_s.class);

		boolean hidebtnDisplayed = p.hidebtn.isDisplayed();
		softAssertMethod(hidebtnDisplayed);

		boolean showBtnDisplayed = p.showbtn.isDisplayed();
		softAssertMethod(showBtnDisplayed);

		boolean hideShowExField = p.hideShowExampleInputField.isDisplayed();
		softAssertMethod(hideShowExField);

		hardWaitMethod(2000);
		p.hidebtn.click();
		hardWaitMethod(2000);
		p.showbtn.click();

		System.out.println("ElementDisplayedExampleTC: PASS");

	}

}
