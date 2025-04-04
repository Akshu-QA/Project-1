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

	// checkbox class elements loc
	@FindBy(xpath = "//input[@id='checkBoxOption1']")
	public WebElement chechboxOption1;

	@FindBy(css = "input[id='checkBoxOption2']")
	public WebElement chechboxOption2;

	@FindBy(xpath = "//div[@id='checkbox-example']")
	public List<WebElement> allCheckBoxOptions;

	// Alert class elements loc
	@FindBy(xpath = "//input[@id='alertbtn']")
	public WebElement alertButton;

	@FindBy(xpath = "//input[@id='confirmbtn']")
	public WebElement confirmButton;

	@FindBy(xpath = "//input[@name='enter-name']")
	public WebElement enterNameInputField;

	// Element displayed example
	@FindBy(css = "input[id='hide-textbox']")
	public WebElement hidebtn;

	@FindBy(css = "input[id='show-textbox']")
	public WebElement showbtn;

	@FindBy(css = "input[id='displayed-text']")
	public WebElement hideShowExampleInputField;

	// SwitchTabExample
	@FindBy(xpath = "//a[@id='opentab']")
	public WebElement openTab;

	// Switch Window Example
	@FindBy(xpath = "//button[@id='openwindow']")
	public WebElement openWindow;

	// Switch To alert example
	@FindBy(xpath = "//input[@id='alertbtn']")
	public WebElement alertBtn;

	@FindBy(xpath = "//input[@id='confirmbtn']")
	public WebElement confirmBtn;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement enterYourname;

	// mouseHover
	@FindBy(xpath = "//button[@id='mousehover']")
	public WebElement mouseHover;

	@FindBy(xpath = "//a[text()='Top']")
	public WebElement topButton;

	@FindBy(xpath = "//a[text()='Reload']")
	public WebElement reloadButton;

	// Web Table Example
	@FindBy(xpath = "//table[@class='table-display']")
	public List<WebElement> webTableExample;

	// WebTable Fixed Header
	@FindBy(xpath = "//div[@class='tableFixHead']")
	public List<WebElement> webTableFixHeader;

	// i frame
	@FindBy(css = "iframe[id='courses-iframe']")
	public WebElement iFrame;

	// youtube visible
	@FindBy(css = "span[class='fa fa-youtube']")
	public WebElement youTubeIcon;

	// linkdin icon visible
	@FindBy(css = "span[class='fa fa-linkedin']")
	public WebElement linkdinIcon;

	// Register button
	@FindBy(xpath = "//a[text()='Register']")
	public WebElement registorButton;

	// Login Button
	@FindBy(xpath = "//a[@class='theme-btn register-btn']")
	public WebElement loginButton;

	// Courses link display
	@FindBy(xpath = "(//ul[@class='navigation clearfix']//a[contains(text(),'Courses')])[1]")
	public WebElement coursesLink;

	// All Access plan
	@FindBy(xpath = "(//ul[@class='navigation clearfix']//a[contains(text(),'All Access plan')])[1]")
	public WebElement allAccessPlanLink;

	// Learning Paths link
	@FindBy(xpath = "(//ul[@class='navigation clearfix']//a[contains(text(),'Learning paths')])[1]")
	public WebElement learningPathsLink;

	// Mentorship link
	@FindBy(xpath = "(//ul[@class='navigation clearfix']//a[contains(text(),'Mentorship')])[1]")
	public WebElement mentorshipLink;

	// job suppport link
	@FindBy(xpath = "(//ul[@class='navigation clearfix']//a[contains(text(),'Mentorship')])[1]")
	public WebElement jobSupport;

	// practice link
	@FindBy(xpath = "(//ul[@class='navigation clearfix']//a[contains(text(),'Practice')])[1]")
	public WebElement practicelink;

	// Blog link
	@FindBy(xpath = "(//ul[@class='navigation clearfix']//a[contains(text(),'Blog')])[1]")
	public WebElement blogLink;

	// more dropdown
	@FindBy(xpath = "//li[@class='dropdown open']")
	public WebElement dropDown;

//	----------------------------------------------- Footer all links locators 
	// Discount coupon link
	@FindBy(xpath = "//a[text()='Discount Coupons']")
	public WebElement discountCouponLink;

	// restApi link
	@FindBy(xpath = "//a[text()='REST API']")
	public WebElement restAPILink;

	// Soap UI link
	@FindBy(xpath = "//a[text()='SoapUI']")
	public WebElement soapUILink;

	// Appium link
	@FindBy(xpath = "//a[text()='Appium']")
	public WebElement appiumLink;

	// j meter link
	@FindBy(xpath = "//a[text()='JMeter']")
	public WebElement jMeterLink;

	// latestNews link
	@FindBy(xpath = "//a[text()='Latest News']")
	public WebElement latestnewsLink;

	// BrokenLiknk
	@FindBy(xpath = "//a[text()='Broken Link']")
	public WebElement brokenLink;

	// dummy content for testing
	@FindBy(xpath = "//a[text()='Dummy Content for Testing.']")
	public WebElement dummyContentForTesting;

	// content info link
	@FindBy(xpath = "//a[text()='Contact info']")
	public WebElement contentTestingLink;

	@FindBy(xpath = "//a[text()='Dummy Content for Testing.']")
	public WebElement dummyContentForTesting2;

	// SocialMedia link
	@FindBy(xpath = "//a[text()='Social Media']")
	public WebElement socialMediaLink;

	// Facebook link
	@FindBy(xpath = "//a[text()='Facebook']")
	public WebElement facebookLink;

	// twitter link
	@FindBy(xpath = "//a[text()='Twitter']")
	public WebElement twitterLink;

	// google+ link
	@FindBy(xpath = "//a[text()='Google+']")
	public WebElement googleLink;

	// Youtube link
	@FindBy(xpath = "//a[text()='Youtube']")
	public WebElement youTubeLink;

}
