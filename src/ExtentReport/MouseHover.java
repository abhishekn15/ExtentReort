package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {

	@Test
	public void Login() {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         
		driver.get("http://automationpractice.com/index.php");
		
		WebElement mouseHoverDress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseHoverDress).perform();
		driver.quit();

	}}
