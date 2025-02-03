package com.base;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertyUtils;

public class BaseClass {
	public static WebDriver driver; 
	public static ExtentReports report=null;
	public static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	Logger log= Logger.getLogger(BaseClass.class);
	
		public  void intialization() throws IOException {
		
		System.out.println("initializing webdriver");//print on console
		log.info("initialing webdriver");//print on log file
		String browserName=PropertyUtils.readProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "gecodriver.exe");
			driver=new ChromeDriver();
		}
		driver.get(PropertyUtils.readProperty("url"));
	}
	public  void reportInit() {
		report=new ExtentReports();
//		System.out.println("report path"+System.getProperty("user.dir")+"\\target");
		spark=new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReport.html");
//		spark=new ExtentSparkReporter("D:\\MyNwWorkspace\\com.Hybrid228\\target\\ExtentRepotrt.html");
		report.attachReporter(spark);
	}
}
