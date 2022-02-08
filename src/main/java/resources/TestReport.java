package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestReport {
	
	static ExtentReports extent;
	public static ExtentReports getReportMethod()
	{
		String path = System.getProperty("user.dir"+"\\reports\\index.html");
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("QA Academy report");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vaibhav");
		
		return extent;
	}

}
