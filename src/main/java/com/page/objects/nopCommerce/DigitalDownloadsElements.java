package com.page.objects.nopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsElements {
	public DigitalDownloadsElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")
	private WebElement digitalDownloadOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/35/1/1\"),!1']")
	private WebElement ifYouWantOption;
	@FindBy(css="button#add-to-cart-button-35")
	private WebElement ifYouWantAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/34/1/1\"),!1']")
	private WebElement nightVisionAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/36/1/1\"),!1']")
	private WebElement scienceFaithOption;
	@FindBy(css="button#add-to-cart-button-36")
	private WebElement scienceFaithAddCart;
	@FindBy(css="span.close")
	private WebElement closeNotification;
	public WebElement getDigitalDownloadOption() {
		return digitalDownloadOption;
	}
	public WebElement getIfYouWantOption() {
		return ifYouWantOption;
	}
	public WebElement getIfYouWantAddCart() {
		return ifYouWantAddCart;
	}
	public WebElement getNightVisionAddCart() {
		return nightVisionAddCart;
	}
	public WebElement getScienceFaithOption() {
		return scienceFaithOption;
	}
	public WebElement getScienceFaithAddCart() {
		return scienceFaithAddCart;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}

}
