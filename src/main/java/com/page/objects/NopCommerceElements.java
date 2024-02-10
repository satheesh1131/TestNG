package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceElements {
	public NopCommerceElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Computers ']")
	private WebElement computerOption;
	@FindBy(xpath="//a[text()=' Notebooks ']")
	private WebElement noteBookOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/4/1/1\"),!1']")
	private WebElement appleMacBook;
	@FindBy(css = "button#add-to-cart-button-4")
	private WebElement appleMacBookAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/7/1/1\"),!1']")
	private WebElement hpSpectreAddCart;
	@FindBy(css="span.cart-label")
	private WebElement shoppingCart;
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement termsOfServiceCheckbox;
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkOutButton;
	@FindBy(xpath="//button[@class='button-1 checkout-as-guest-button']")
	private WebElement checkOutGuestButton;
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	private WebElement firstNameInput;
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	private WebElement lastNameInput;
	@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
	private WebElement companyNameInput;
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	private WebElement emailInput;
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	private WebElement cityNameInput;
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	private WebElement addressInput;
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	private WebElement countryDD;
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement pinCodeInput;
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phoneNumberInput;
	@FindBy(xpath="//button[@onclick='Billing.save()']")
	private WebElement continueBillingAddress;
	@FindBy(xpath="//button[@onclick='ShippingMethod.save()']")
	private WebElement continueShippingMethod;
	@FindBy(xpath="//button[@onclick='PaymentMethod.save()']")
	private WebElement continuePaymentMethod;
	@FindBy(xpath="//button[@onclick='PaymentInfo.save()']")
	private WebElement continuePaymentInfo;
	@FindBy(xpath="//button[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderButton;
	@FindBy(xpath="//button[@onclick='setLocation(\"/\")']")
	private WebElement continueHomeButton;
	@FindBy(css="span.close")
	private WebElement closeNotification;
	public WebElement getCloseNotification() {
		return closeNotification;
	}
	public WebElement getComputerOption() {
		return computerOption;
	}
	public WebElement getNoteBookOption() {
		return noteBookOption;
	}
	public WebElement getAppleMacBook() {
		return appleMacBook;
	}
	public WebElement getAppleMacBookAddCart() {
		return appleMacBookAddCart;
	}
	public WebElement getHpSpectreAddCart() {
		return hpSpectreAddCart;
	}
	public WebElement getShoppingCart() {
		return shoppingCart;
	}
	public WebElement getTermsOfServiceCheckbox() {
		return termsOfServiceCheckbox;
	}
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	public WebElement getCheckOutGuestButton() {
		return checkOutGuestButton;
	}
	public WebElement getFirstNameInput() {
		return firstNameInput;
	}
	public WebElement getLastNameInput() {
		return lastNameInput;
	}
	public WebElement getCompanyNameInput() {
		return companyNameInput;
	}
	public WebElement getEmailInput() {
		return emailInput;
	}
	public WebElement getCityNameInput() {
		return cityNameInput;
	}
	public WebElement getAddressInput() {
		return addressInput;
	}
	public WebElement getCountryDD() {
		return countryDD;
	}
	public WebElement getPinCodeInput() {
		return pinCodeInput;
	}
	public WebElement getPhoneNumberInput() {
		return phoneNumberInput;
	}
	public WebElement getContinueBillingAddress() {
		return continueBillingAddress;
	}
	public WebElement getContinueShippingMethod() {
		return continueShippingMethod;
	}
	public WebElement getContinuePaymentMethod() {
		return continuePaymentMethod;
	}
	public WebElement getContinuePaymentInfo() {
		return continuePaymentInfo;
	}
	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}
	public WebElement getContinueHomeButton() {
		return continueHomeButton;
	}
	
}
