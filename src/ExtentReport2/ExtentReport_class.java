package ExtentReport2;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport_class {
	ExtentReports report=new ExtentReports("./reports/extentreports.html\",false");
	//ExtentReports report=new ExtentReports("/reports/extentreports.html",true);
	ExtentTest test=report.startTest("Test case report");
	  test.log(LogStatus.PASS, "tc is passed");
	    test.log(LogStatus.FAIL, "tc is fail");
	    test.log(LogStatus.SKIP, "tc is skipped");

}
