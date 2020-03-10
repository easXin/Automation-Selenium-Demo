package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\googleDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch() {

		// go to google.com
		driver.get("http://www.google.com");
		// enter text in search textBox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		// click on search button
		// driver.findElement(By.name("btnk")).click();
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
	
	}

	@AfterTest
	public void tearDownTest() {
		// close browser
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}