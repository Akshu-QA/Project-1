package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	protected static WebDriver driver;

	@BeforeTest
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public static void closeBrowser() {
		driver.close();
	}

	public void dropdown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void implicitWaitMethod(int timeValue) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeValue));
	}

	public void hardWaitMethod(int timeWait) throws InterruptedException {
		Thread.sleep(timeWait);
	}

	public void clickMethod(WebElement ele) {
		ele.click();
	}

	public void softAssertMethod(boolean ele1) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ele1, true);
		sa.assertAll();
	}

//	public void forLoopForAllElements(String allOptionsSuggestionClass) {
//		List<WebElement> allList = driver.findElements(By.xpath(allOptionsSuggestionClass));
//		for (WebElement ref : allList) {
//			System.out.println(ref.getText());
//		}
//	}

}
