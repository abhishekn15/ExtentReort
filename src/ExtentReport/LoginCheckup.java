package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginCheckup {
	
	@Test
	public void Login() {
		
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver	 driver=new ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.cssSelector(".login")).click();
			driver.findElement(By.id("email")).sendKeys("abhishek.kr.sn@gmail.com");
			driver.findElement(By.id("passwd")).sendKeys("singh15");
			driver.findElement(By.id("SubmitLogin")).click();
			System.out.println(driver.getTitle());
			driver.quit();
			
	}

}
