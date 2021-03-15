package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement {

	@Test
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		WebElement des = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		
		WebElement col3 = driver.findElement(By.id("column-3"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDrop(src,des).perform();
		Thread.sleep(1000);
		act.dragAndDrop(des,col3).perform();
		

	}
}
