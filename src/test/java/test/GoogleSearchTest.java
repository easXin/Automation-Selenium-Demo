package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver =null;
	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\googleDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get("http://www.google.com");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test completed successfully");
	}
}
