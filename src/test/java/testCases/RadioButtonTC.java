package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import base.PageObject_s;

public class RadioButtonTC extends Base {

	@Test( groups = {"grp1"})
	public void radioButtonExample() {

		PageObject_s p = PageFactory.initElements(driver, PageObject_s.class);

		boolean radioBtn1displayed = p.radioBtn1.isDisplayed();
		Assert.assertEquals(radioBtn1displayed, true);

		boolean radioBtn2displayed = p.radioBtn2.isDisplayed();
		Assert.assertEquals(radioBtn1displayed, true);

		boolean radioBtn3displayed = p.radioBtn3.isDisplayed();
		Assert.assertEquals(radioBtn1displayed, true);

		p.radioBtn1.click();
		p.radioBtn2.click();
		p.radioBtn3.click();

		System.out.println("RadioButtonTC : PASS");

	}

}
