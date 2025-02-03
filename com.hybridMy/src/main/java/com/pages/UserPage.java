package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
@FindBy(xpath="//button[text()='Add User']")
WebElement addUser;

	public AddUser clickAddUser() {
		addUser.click();
		return new AddUser();
	}
}
