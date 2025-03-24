package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Base;
import base.PageObject_s;

public class RadioButtonTC extends Base {

	@Test
	public void radioButtonExample() {

		PageObject_s p = PageFactory.initElements(driver, PageObject_s.class);
		p.radioBtn1.click();

	}

}
