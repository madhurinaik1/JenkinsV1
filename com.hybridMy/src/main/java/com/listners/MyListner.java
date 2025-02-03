package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utilities.DriverUtils;

public class MyListner extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Test Case success with name:: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("hELLO");
		String path=DriverUtils.captureScreenshot(result.getName());
		test.log(Status.FAIL,"Test Case Fail with name:: "+result.getName());
		test.addScreenCaptureFromPath(path);
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,"Test Case Skipped with name:: "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();// to save data in extent report
		
	}

}
