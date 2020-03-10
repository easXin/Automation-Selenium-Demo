package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	public static void googleSearchTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\googleDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		driver.close();
	}
}
