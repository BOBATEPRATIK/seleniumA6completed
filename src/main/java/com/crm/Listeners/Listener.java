package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.BaseClass1;

//import Base.DwsScreenShot;

public class Listener extends BaseClass1 implements  ITestListener
{
		ExtentSparkReporter spark;
		ExtentReports report;
		ExtentTest test;
		@Override
		public void onTestStart(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			Reporter.log(t_name+" is executed");
			test=report.createTest(t_name);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			test.log(Status.PASS,t_name+" is success");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			test.log(Status.FAIL,t_name+" is Failure");
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			String screenshot=ts.getScreenshotAs(OutputType.BASE64);
//			test.addScreenCaptureFromBase64String(screenshot);

		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String t_name=result.getMethod().getMethodName();
			test.log(Status.SKIP,t_name+" is Skipped");

		}

		

		@Override
		public void onStart(ITestContext context) {
			//create spark reporter
					spark=new ExtentSparkReporter("./Reports/FailTestCase.html");
					//configure the spark reporter
					spark.config().setDocumentTitle("SampleReport");
					spark.config().setReportName("Pratik");
					spark.config().setTheme(Theme.DARK);
					//create the extent report
					 report=new ExtentReports();
					//configure extent report
					report.setSystemInfo("Os","Window-11");
					report.setSystemInfo("Browser","Chrome-100");
					//attach the spark reporter to the extent report
					report.attachReporter(spark);
//					 test=report.createTest("BasicReport");
//					test.log(Status.INFO,"report is successfully createad");
//					report.flush();
//			
		}

		@Override
		public void onFinish(ITestContext context) {
			report.flush();
		}
	
	} 