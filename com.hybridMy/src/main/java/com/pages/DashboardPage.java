package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver=null;
	boolean flag;
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean titleee() {
		System.out.println(driver.getTitle()+"=============");
		if(driver.getTitle().equals("JavaByKiran | Dashboard"))
			flag=true;
		else 
			flag= false;
		return flag;
	}
	
//	public boolean check_title() {
//		
//		System.out.println("valid title:: "+valid_title);
//		if(valid_title.equals("JavaByKiran | Dashboard"))
//			return true;
//		else
//			return false;
//	}
	
	@FindBy(xpath="//h3")
	List<WebElement> courses;
	
	@FindBy(xpath="//span[text()='Users'")
	WebElement user_btn;
	
	
	public ArrayList<String> verifyCorses() {
		
		
		ArrayList<String> actualCourses=new ArrayList<String>();
		for(WebElement course:courses) {
			actualCourses.add(course.getText());
		}
		return actualCourses;
	}
	
	public UserPage clickUser() {
		user_btn.click();
		return new UserPage();
	}
	
}
