package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotPractice {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement linksLoc = driver.findElement(By.cssSelector("div[id='gf-BIG']"));

		// screenshot code
		File f = ((TakesScreenshot) linksLoc).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("add location of your file here with name of file as ss1.png"));
		driver.close();

	}

}
