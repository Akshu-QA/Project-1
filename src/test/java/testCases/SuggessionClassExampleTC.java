package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import base.PageObject_s;

public class SuggessionClassExampleTC extends Base {

	@Test(priority = 2)
	public void SuggessionClassExample() {
		PageObject_s p = PageFactory.initElements(driver, PageObject_s.class);
		implicitWaitMethod(5);
		p.countrySearchInputField.sendKeys("uni");
		for (WebElement ref : p.allOptionsSuggestionClass) {
			System.out.println(ref.getText());
			if (ref.getText().equalsIgnoreCase("United Arab Emirates")) {
				ref.click();
			}
		}

	}

}
