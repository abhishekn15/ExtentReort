package Parallel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void assignnmet() {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	
          Set<String> sd = driver.getWindowHandles();
          String pTitle = driver.getTitle();
         
          System.out.println(sd +pTitle); 
          
          
          for ( String Window:sd) {
        	  driver.switchTo().window(Window);
        	  driver.get("http://www.flipkart.com");
        	  driver.close();
        	  
          }
	
	
}}