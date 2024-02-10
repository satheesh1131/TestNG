package com.page.objects.nopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksElements {
	public BooksElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Books ']")
	private WebElement booksOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/37/1/1\"),!1']")
	private WebElement fahrenheit451AddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/38/1/1\"),!1']")
	private WebElement firstPrizePiesAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/39/1/1\"),!1']")
	private WebElement prideAndPrejudiceAddCart;
	@FindBy(css="span.close")
	private WebElement closeNotification;
	public WebElement getBooksOption() {
		return booksOption;
	}
	public WebElement getFahrenheit451AddCart() {
		return fahrenheit451AddCart;
	}
	public WebElement getFirstPrizePiesAddCart() {
		return firstPrizePiesAddCart;
	}
	public WebElement getPrideAndPrejudiceAddCart() {
		return prideAndPrejudiceAddCart;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}


}
