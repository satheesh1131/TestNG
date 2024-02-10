package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login_Elements {
	public Fb_Login_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement userNameTextBox;
	@FindBy(id="pass")
	private WebElement passWordTextBox;
	@FindBy(name="login")
	private WebElement loginButton;
	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}
	public WebElement getPassWordTextBox() {
		return passWordTextBox;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
}