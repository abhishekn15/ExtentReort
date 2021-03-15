package ExtentReport;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport_class {
	
	@Test
	public void correspondent() {
		    ExtentReports reports = new ExtentReports("./reports/extentreports.html",false);
		    ExtentTest test = reports.startTest("regression test case");
		    test.log(LogStatus.PASS, "tc is passed");
		    test.log(LogStatus.FAIL, "tc is fail");
		    test.log(LogStatus.SKIP, "tc is skipped");
		    reports.endTest(test);
		    reports.flush();
		    
	}

}
