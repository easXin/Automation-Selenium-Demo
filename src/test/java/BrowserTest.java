import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Codin\\Downloads\\chromedriver\\chromedriver.exe");
		driver.get("https://mvnrepository.com");
		
	}
}
