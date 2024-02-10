package com.page.objects.nopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryOptionElements {
	public JewelryOptionElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")
	private WebElement jewelryOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/41/1/1\"),!1']")
	private WebElement flowerBraceletAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/42/1/1\"),!1']")
	private WebElement engagementRingAddCart;
	@FindBy(css="span.close")
	private WebElement closeNotification;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/40/1/1\"),!1']")
	private WebElement gemstoneNecklaceRent;
	@FindBy(css="input#rental_start_date_40")
	private WebElement gemNecklaceRentStartDate;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[3]")
	private WebElement startDateTable;
	@FindBy(css="input#rental_end_date_40")
	private WebElement gemNecklaceRentEndDate;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]")
	private WebElement endDateTable;	
	@FindBy(css="button#add-to-cart-button-40")
	private WebElement gemNecklaceAddCart;
	public WebElement getJewelryOption() {
		return jewelryOption;
	}
	public WebElement getFlowerBraceletAddCart() {
		return flowerBraceletAddCart;
	}
	public WebElement getEngagementRingAddCart() {
		return engagementRingAddCart;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}
	public WebElement getGemstoneNecklaceRent() {
		return gemstoneNecklaceRent;
	}
	public WebElement getGemNecklaceRentStartDate() {
		return gemNecklaceRentStartDate;
	}
	public WebElement getStartDateTable() {
		return startDateTable;
	}
	public WebElement getGemNecklaceRentEndDate() {
		return gemNecklaceRentEndDate;
	}
	public WebElement getEndDateTable() {
		return endDateTable;
	}
	public WebElement getGemNecklaceAddCart() {
		return gemNecklaceAddCart;
	}

}
