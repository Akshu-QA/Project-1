package base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageObject_s {

	@FindBy(xpath = "//input[@value='radio1']")
	public WebElement radioBtn1;

	@FindBy(xpath = "//input[@value='radio2']")
	public WebElement radioBtn2;

	@FindBy(xpath = "//input[@value='radio3']")
	public WebElement radioBtn3;

	@FindBy(xpath = "//input[@id='autocomplete' and @type='text']")
	public WebElement countrySearchInputField;

	@FindBy(xpath = "//div[@class='ui-menu-item-wrapper']")
	public List<WebElement> allOptionsSuggestionClass;

}
