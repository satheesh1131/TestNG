package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPage {
	public WebElement getUsernameInput() {
		return usernameInput;
	}
	public WebElement getPasswordInput() {
		return passwordInput;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameInput;
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordInput;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement submitButton;
	public OrangeHrmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
}
