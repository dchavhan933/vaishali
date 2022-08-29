package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReports {
	public  static ExtentReports extentreports() {
		ExtentSparkReporter reporter= new ExtentSparkReporter("ProectsReports.html");
		ExtentReports reports= new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("suite","regression");
		reports.setSystemInfo("tested by","xyz");
		return reports;	
	}
}
