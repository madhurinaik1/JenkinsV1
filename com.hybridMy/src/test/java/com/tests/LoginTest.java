package com.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage lp=null;
	
	@BeforeSuite
	public void setup() throws IOException {
		intialization();
		reportInit();
		lp=new LoginPage(driver);
	}
	
	@Test
	public void test01() {
		Assert.assertTrue(true);
		lp.valid_Login();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");	
	}
	
	@Test
	public void test02() {
		
//		Assert.assertEquals(driver.getTitle(), "JavvaByKiran | Dashboard111");	
		Assert.assertTrue(false);
	}

	@Test
	public void test03() {
		throw new SkipException("Test got skipped");
	}
}
