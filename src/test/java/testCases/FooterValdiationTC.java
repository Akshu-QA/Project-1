package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Base;
import base.PageObject_s;

public class FooterValdiationTC extends Base {

	@Test
	public void validateAllLinks() {

		PageObject_s p = PageFactory.initElements(driver, PageObject_s.class);

		boolean discountLinkDisplayed = p.discountCouponLink.isDisplayed();
		boolean discountLinkEnabled = p.discountCouponLink.isEnabled();

		boolean restAPILinkDisplayed = p.discountCouponLink.isDisplayed();
		boolean restAPILinkEnabled = p.discountCouponLink.isEnabled();

		boolean brokenLinkDisplayed = p.discountCouponLink.isDisplayed();
		boolean brokenLinkEnabled = p.discountCouponLink.isEnabled();

		softAssertMethod(discountLinkDisplayed);
		softAssertMethod(discountLinkEnabled);

		softAssertMethod(restAPILinkDisplayed);
		softAssertMethod(restAPILinkEnabled);

		softAssertMethod(brokenLinkDisplayed);
		softAssertMethod(brokenLinkEnabled);

	}

}
