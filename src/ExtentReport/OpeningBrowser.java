package ExtentReport;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpeningBrowser {
//valid login check
	private WebDriver driver;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		//Properties po = new Properties();
		//po.load("./Property/data.properties");
		driver.get("http://automationpractice.com/index.php");
		driver.quit();
		
	}
	@Test(priority=1)
	public void openBrowser1() {
		System.setProperty("webdriver.gecko.driver","./Driver/firefoxdriver.exe");
		 driver=new ChromeDriver();
		//Properties po = new Properties();
		//po.load("./Property/data.properties");
		driver.get("http://automationpractice.com/index.php");
		driver.quit();
		
	}
}
