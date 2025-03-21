package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;

	public static void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	public static void close() {
		driver.close();
	}
	
	

}
