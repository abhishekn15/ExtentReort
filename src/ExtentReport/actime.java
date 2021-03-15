package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class actime {
	@Test
	public void openApp() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		         WebDriver driver = new ChromeDriver();
		         driver.get("http://www.facebook.com");
		         driver.close();
		         ExtentReports reports = new ExtentReports("./reports/extentreports.html",false);
				    ExtentTest test = reports.startTest("openapp");
				    test.log(LogStatus.PASS, "tc is passed");
				   
				    reports.endTest(test);
				    reports.flush();
	}
	@Test
	public void openAppe() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		         WebDriver driver = new ChromeDriver();
		         driver.get("http://www.facebook.com");
		         driver.close();
		         ExtentReports reports = new ExtentReports("./reports/extentreports.html",false);
				    ExtentTest test = reports.startTest("openapp");
				    test.log(LogStatus.PASS, "tc is passed");
				   
				    reports.endTest(test);
				    reports.flush();
	}

}
