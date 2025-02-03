package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver=null;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(xpath="//button")
WebElement submit_btn;
public void login_to_application(String uname,String pwd) {
	username.sendKeys(uname);
	password.sendKeys(pwd);
	submit_btn.click();
	
}
public DashboardPage valid_Login() {
	username.sendKeys("kiran@gmail.com");
	password.sendKeys("123456");
	submit_btn.click();
	return new DashboardPage(driver); 	
}

}
