package com.page.objects.nopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsOptionElements {
	public ElectronicsOptionElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Electronics ']")
	private WebElement electronicsOption;
	@FindBy(xpath="//a[text()=' Camera & photo ']")
	private WebElement cameraPhotoOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/13/1/1\"),!1']")
	private WebElement nikonDslrOption;
	@FindBy(css="button#add-to-cart-button-15")
	private WebElement nikonDslrRedAddCart;
	@FindBy(css="button#add-to-cart-button-14")
	private WebElement nikonDslrBlackAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/16/1/1\"),!1']")
	private WebElement leicaDigiCameraAddCart;
	@FindBy(css="span.close")
	private WebElement closeNotification;
	@FindBy(xpath="//a[text()=' Cell phones ']")
	private WebElement cellphoneOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/1/1\"),!1']")
	private WebElement htcOneAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/19/1/1\"),!1']")
	private WebElement htcOneMiniAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/20/1/1\"),!1']")
	private WebElement nokiaLumiaAddCart;
	@FindBy(xpath="//a[text()=' Others ']")
	private WebElement othersOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/21/1/1\"),!1']")
	private WebElement beatsWireLessSpeakerAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/23/1/1\"),!1']")
	private WebElement potableSpeakerAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/22/1/1\"),!1']")
	private WebElement uniTabletCoverAddCart;
	public WebElement getElectronicsOption() {
		return electronicsOption;
	}
	public WebElement getCameraPhotoOption() {
		return cameraPhotoOption;
	}
	public WebElement getNikonDslrOption() {
		return nikonDslrOption;
	}
	public WebElement getNikonDslrBlackAddCart() {
		return nikonDslrBlackAddCart;
	}
	public WebElement getLeicaDigiCameraAddCart() {
		return leicaDigiCameraAddCart;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}
	public WebElement getCellphoneOption() {
		return cellphoneOption;
	}
	public WebElement getHtcOneAddCart() {
		return htcOneAddCart;
	}
	public WebElement getHtcOneMiniAddCart() {
		return htcOneMiniAddCart;
	}
	public WebElement getNokiaLumiaAddCart() {
		return nokiaLumiaAddCart;
	}
	public WebElement getOthersOption() {
		return othersOption;
	}
	public WebElement getBeatsWireLessSpeakerAddCart() {
		return beatsWireLessSpeakerAddCart;
	}
	public WebElement getPotableSpeakerAddCart() {
		return potableSpeakerAddCart;
	}
	public WebElement getUniTabletCoverAddCart() {
		return uniTabletCoverAddCart;
	}
	public WebElement getNikonDslrRedAddCart() {
		return nikonDslrRedAddCart;
	}

}
