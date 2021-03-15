package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseLoginWithExcelSheet {
	@Test
	public void Usinglogin() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Testing.xlsx"));
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		
		Cell c=wb.getSheet("Testing").getRow(1).getCell(0);
		String s = c.getStringCellValue();
		System.out.println(s);
		Thread.sleep(1500);
	username.sendKeys(s);
		
		WebElement password = driver.findElement(By.name("pwd"));
		Cell cc=wb.getSheet("Testing").getRow(0).getCell(1);
		String ss=c.getStringCellValue();
		System.out.println(ss);
		Thread.sleep(1500);
		password.sendKeys(ss);
		 driver.findElement(By.id("loginButton")).click();
		
		
	}

}
