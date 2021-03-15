package Parallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void  test() {
		Reporter.log("this is this");
		
	}
	
	@Test
	public void testing() {
		Reporter.log("this is testing", false);
	}

}
