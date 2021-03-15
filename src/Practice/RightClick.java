package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	
	@Test
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		
		
		WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
	
		act.contextClick(click).perform();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.contextClick(doubleClick).perform();
		}
}
