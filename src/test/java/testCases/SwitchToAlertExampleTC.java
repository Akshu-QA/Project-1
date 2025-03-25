package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;
import base.PageObject_s;

public class SwitchToAlertExampleTC extends Base {

	@Test(priority = 4)
	public void switchToAlertExample() {

		PageObject_s p = PageFactory.initElements(driver, PageObject_s.class);
		boolean alertBtnDispalyed = p.alertButton.isDisplayed();

		softAssertMethod(alertBtnDispalyed);
		
		System.out.println("SwitchToAlertExampleTC: PASS");

	}

}
