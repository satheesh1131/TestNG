package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginElements {
	public InstagramLoginElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextBox;
	@FindBy(xpath="//input[@name='password']")
	private WebElement passWordTextBox;
	@FindBy(xpath="//button[@class='_acan _acap _acas _aj1-']")
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
