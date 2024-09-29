package ITW_Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ITW_BO_MyBrands_FilterFunctionality_Testcases.ITW_BaseClass;

public class Reporting implements ITestListener{
	
	public ExtentSparkReporter reporter;//It is Provide the UI part of the report(Document Title,Report Name,Theme of the Report)
	public ExtentReports extent;//it is provide the common info of the User (Host name,Environment,OS,User Name,Browsers)
	public ExtentTest test;//it is the data into the report(provide the test case statuses (pass,fail or skip))
	
	public void onStart(ITestContext context) {
		//specify the location of folder
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\ExtentReports\\"+"Testreport-"+timestamp+".html");
		reporter.config().setDocumentTitle("ITW_CRM App Automation Test Document");
		reporter.config().setReportName("Brand Owner_MyBrands_Filter Functionality Report");
		reporter.config().setTheme(Theme.DARK);
		//common information about the Report
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("HostName", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("QA Name", "Kiran");
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("Browsers", "chrome,Edge,Firefox");
	}
	
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test is passed"+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test is failed"+result.getName());
		test.log(Status.FAIL, result.getThrowable());//When Test case should fail then ,get exception
		
		try {
			String ScreenshotPath=new ITW_BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(ScreenshotPath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "test is failed"+result.getName());
		test.log(Status.SKIP, result.getThrowable());
		
		try {
			String ScreenshotPath=new ITW_BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(ScreenshotPath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}


}
