package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject_s {

	@FindBy(xpath = "//input[@value='radio1']")
	public WebElement radioBtn1;

	@FindBy(xpath = "//input[@value='radio2']")
	public WebElement radioBtn2;

	@FindBy(xpath = "//input[@value='radio3']")
	public WebElement radioBtn3;

}
