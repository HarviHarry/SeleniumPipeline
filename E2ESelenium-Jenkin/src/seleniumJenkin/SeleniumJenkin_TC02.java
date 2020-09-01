package seleniumJenkin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumJenkin_TC02 {
@Test
	
	public void E2ETC01() {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");		
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
driver.findElementById("email").sendKeys("Hello");
driver.findElementById("pass").sendKeys("Hello ji");
driver.quit();

	}
}
