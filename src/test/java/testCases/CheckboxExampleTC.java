package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import base.PageObject_s;


public class CheckboxExampleTC extends Base {

	@Test(priority = 3)
	public void checkboxExample() throws InterruptedException {

		PageObject_s p = PageFactory.initElements(driver, PageObject_s.class);
		hardWaitMethod(2000);

		boolean checkbox1Displayed = p.chechboxOption1.isDisplayed();
		Assert.assertEquals(checkbox1Displayed, true);

		boolean checkbox2Displayed = p.chechboxOption2.isDisplayed();
		Assert.assertEquals(checkbox2Displayed, true);

		clickMethod(p.chechboxOption2);

		for (WebElement ref : p.allCheckBoxOptions) {
			System.out.println("All checkbox options are shown here: " + ref.getText());
		}

	}

}
