package com.page.objects.nopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerOptionElements {
	public ComputerOptionElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Computers ']")
	private WebElement computerMenu;
	@FindBy(xpath="//a[text()=' Desktops ']")
	private WebElement desktopOption;
	@FindBy(xpath="//a[text()=' Notebooks ']")
	private WebElement notebookOption;
	@FindBy(xpath="//a[text()=' Software ']")
	private WebElement softwareOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']")
	private WebElement cpuOption;
	@FindBy(id = "add-to-cart-button-1")
	private WebElement cpuAddCart;
	@FindBy(id="product_attribute_2")
	private WebElement ramSelectDD;
	@FindBy(css = "input#product_attribute_3_6")
	private WebElement hdd320GButton;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/2/1/1\"),!1']")
	private WebElement customPerformancePcAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/3/1/1\"),!1']")
	private WebElement lenevoIdeaCentreAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/4/1/1\"),!1']")
	private WebElement appleMacbookOption;
	@FindBy(css="button#add-to-cart-button-4")
	private WebElement appleMacbookAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/5/1/1\"),!1']")
	private WebElement asusLaptopAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/8/1/1\"),!1']")
	private WebElement hpEnvyAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/7/1/1\"),!1']")
	private WebElement hpSpectreAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/9/1/1\"),!1']")
	private WebElement lenevoThinkpadAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/6/1/1\"),!1']")
	private WebElement samsungUltrabookAddCart;
	@FindBy(css="span.close")
	private WebElement closeNotification;
	public WebElement getComputerMenu() {
		return computerMenu;
	}
	public WebElement getDesktopOption() {
		return desktopOption;
	}
	public WebElement getNotebookOption() {
		return notebookOption;
	}
	public WebElement getSoftwareOption() {
		return softwareOption;
	}
	public WebElement getCpuOption() {
		return cpuOption;
	}
	public WebElement getCpuAddCart() {
		return cpuAddCart;
	}
	public WebElement getRamSelectDD() {
		return ramSelectDD;
	}
	public WebElement gethdd320GButton() {
		return hdd320GButton;
	}
	public WebElement getCustomPerformancePcAddCart() {
		return customPerformancePcAddCart;
	}
	public WebElement getLenevoIdeaCentreAddCart() {
		return lenevoIdeaCentreAddCart;
	}
	public WebElement getAppleMacbookOption() {
		return appleMacbookOption;
	}
	public WebElement getAppleMacbookAddCart() {
		return appleMacbookAddCart;
	}
	public WebElement getAsusLaptopAddCart() {
		return asusLaptopAddCart;
	}
	public WebElement getHpEnvyAddCart() {
		return hpEnvyAddCart;
	}
	public WebElement getHpSpectreAddCart() {
		return hpSpectreAddCart;
	}
	public WebElement getLenevoThinkpadAddCart() {
		return lenevoThinkpadAddCart;
	}
	public WebElement getSamsungUltrabookAddCart() {
		return samsungUltrabookAddCart;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}
	public WebElement getSoundForgeAddCart() {
		return soundForgeAddCart;
	}
	public WebElement getWindows8proAddCart() {
		return windows8proAddCart;
	}
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/12/1/1\"),!1']")
	private WebElement soundForgeAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/11/1/1\"),!1']")
	private WebElement windows8proAddCart;
	

}
