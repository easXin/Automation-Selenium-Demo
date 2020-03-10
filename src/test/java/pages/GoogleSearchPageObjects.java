package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/*
 *  Step 1 create a class for each web page
 *  Step 2 Add object locators
 *  Step 3 Add action methods
 *  Step 4 Create class for test case
 *  Step 5 Create object for page class
 *  Step 6 refer action methods 
 */
public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	By textbox_search = By.xpath("//input[@name='q']");
	
	By button_search = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
