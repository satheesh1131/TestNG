package com.page.objects.nopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardOptionElements {
	public GiftCardOptionElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")
	private WebElement giftCardOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/43/1/1\"),!1']")
	private WebElement virtualGiftCardOption;
	@FindBy(css="input#giftcard_43_RecipientName")
	private WebElement vgcRecipientsNameTextBox;
	@FindBy(css="input#giftcard_43_RecipientEmail")
	private WebElement vgcRecipientsEmailTextBox;
	@FindBy(css="input#giftcard_43_SenderName")
	private WebElement vgcSendersNameTextBox;
	@FindBy(css="input#giftcard_43_SenderEmail")
	private WebElement vgcSendersEmailTextBox;
	@FindBy(css="textarea#giftcard_43_Message")
	private WebElement vgcMessageTextBox;
	@FindBy(css="button#add-to-cart-button-43")
	private WebElement virtualGiftCardAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/44/1/1\"),!1']")
	private WebElement physicalGiftCard50Option;
	@FindBy(css="input#giftcard_44_RecipientName")
	private WebElement pgc50RecipientsNameTextBox;
	@FindBy(css="input#giftcard_44_SenderName")
	private WebElement pgc50SendersNameTextBox;
	@FindBy(css="textarea#giftcard_44_Message")
	private WebElement pgc50MessageTextBox;
	@FindBy(css="button#add-to-cart-button-44")
	private WebElement physicalGiftCard50AddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/45/1/1\"),!1']")
	private WebElement physicalGiftCard100Option;
	@FindBy(css="input#giftcard_45_RecipientName")
	private WebElement pgc100RecipientsNameTextBox;
	@FindBy(css="input#giftcard_45_SenderName")
	private WebElement pgc100SendersNameTextBox;
	@FindBy(css="textarea#giftcard_45_Message")
	private WebElement pgc100MessageTextBox;
	@FindBy(css="button#add-to-cart-button-45")
	private WebElement physicalGiftCard100AddCart;
	public WebElement getGiftCardOption() {
		return giftCardOption;
	}
	public WebElement getVirtualGiftCardOption() {
		return virtualGiftCardOption;
	}
	public WebElement getVgcRecipientsNameTextBox() {
		return vgcRecipientsNameTextBox;
	}
	public WebElement getVgcRecipientsEmailTextBox() {
		return vgcRecipientsEmailTextBox;
	}
	public WebElement getVgcSendersNameTextBox() {
		return vgcSendersNameTextBox;
	}
	public WebElement getVgcSendersEmailTextBox() {
		return vgcSendersEmailTextBox;
	}
	public WebElement getVgcMessageTextBox() {
		return vgcMessageTextBox;
	}
	public WebElement getVirtualGiftCardAddCart() {
		return virtualGiftCardAddCart;
	}
	public WebElement getPhysicalGiftCard50Option() {
		return physicalGiftCard50Option;
	}
	public WebElement getPgc50RecipientsNameTextBox() {
		return pgc50RecipientsNameTextBox;
	}
	public WebElement getPgc50SendersNameTextBox() {
		return pgc50SendersNameTextBox;
	}
	public WebElement getPgc50MessageTextBox() {
		return pgc50MessageTextBox;
	}
	public WebElement getPhysicalGiftCard50AddCart() {
		return physicalGiftCard50AddCart;
	}
	public WebElement getPhysicalGiftCard100Option() {
		return physicalGiftCard100Option;
	}
	public WebElement getPgc100RecipientsNameTextBox() {
		return pgc100RecipientsNameTextBox;
	}
	public WebElement getPgc100SendersNameTextBox() {
		return pgc100SendersNameTextBox;
	}
	public WebElement getPgc100MessageTextBox() {
		return pgc100MessageTextBox;
	}
	public WebElement getPhysicalGiftCard100AddCart() {
		return physicalGiftCard100AddCart;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}
	@FindBy(css="span.close")
	private WebElement closeNotification;
}
