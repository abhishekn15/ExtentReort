package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchingBrowser {
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		
		for (String hand:handles) {
			driver.switchTo().window(hand);
			driver.get("http://www.flipkart.com");
			System.out.println(driver.getWindowHandle());			
		}
		driver.close();

	}

}
