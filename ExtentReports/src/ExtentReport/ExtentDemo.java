package src.ExtentReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {
	
	static ExtentReports reports;
	static ExtentTest logger;
	public static void main(String[] args) {
		
		/*
		 * 
		 * this code i have shared with you over GitHub
		 */
		String fileName=new SimpleDateFormat(" 'SampleDemo_'yyyyMMddHHmm'.html' ").format(new Date());
		String path="C:\\Users\\15186\\Desktop\\ExtentReports\\"+fileName;
		
		reports = new ExtentReports(path);
		logger = reports.startTest("Login into Gmail");
		logger.log(LogStatus.INFO, "We have entered valid email id");
		logger.log(LogStatus.PASS,"Enter email id");
		logger.log(LogStatus.INFO, "We have entered valid password");
		logger.log(LogStatus.PASS, "Enter Password");
		logger.log(LogStatus.PASS, "Click on login");
		
		reports = new ExtentReports(path);
		logger = reports.startTest("Remember Me");
		logger.log(LogStatus.INFO, "We have entered valid email id");
		logger.log(LogStatus.PASS,"Enter email id");
		logger.log(LogStatus.INFO, "We have entered valid password");
		logger.log(LogStatus.PASS, "Enter Password");
		logger.log(LogStatus.PASS, "Click on login");
		logger.log(LogStatus.PASS, "click on remember me");
		logger.log(LogStatus.PASS, "Click on login");
		
		reports.endTest(logger);
		reports.flush();
		
		
		
		
		
	}

}
