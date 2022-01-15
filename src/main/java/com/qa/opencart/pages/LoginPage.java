package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class LoginPage {

	//1. By Locators or Page Objects or Object Repository
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By login = By.xpath("//input[@value='Login']");
}
