package com.page.objects.nopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelOptionElements {
	public ApparelOptionElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Apparel ']")
	private WebElement apparelOption;
	@FindBy(xpath="//a[text()=' Shoes ']")
	private WebElement shoeOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/25/1/1\"),!1']")
	private WebElement adidasShoeOption;
	@FindBy(css="select#product_attribute_9")
	private WebElement adidasShoeSizeDD;
	@FindBy(xpath="//span[@style='background-color:#363656']")
	private WebElement adidasShoeColor;
	@FindBy(css="button#add-to-cart-button-25")
	private WebElement adidasShoeAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/24/1/1\"),!1']")
	private WebElement nikeRosheShoeOption;
	@FindBy(css="select#product_attribute_6")
	private WebElement nikeRosheSizeDD;
	@FindBy(css="select#product_attribute_7")
	private WebElement nikeRoshecolorDD;
	@FindBy(xpath="(//span[@class='attribute-square'])[1]")
	private WebElement nikeRoshePrintOption;
	@FindBy(css="button#add-to-cart-button-24")
	private WebElement nikeRosheAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/26/1/1\"),!1']")
	private WebElement nikeMintAddCart;
	@FindBy(xpath="//a[text()=' Clothing ']")
	private WebElement clothingOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/29/1/1\"),!1']")
	private WebElement customTshirtOption;
	@FindBy(css="input#product_attribute_12")
	private WebElement customTshirtInputText;
	@FindBy(css="button#add-to-cart-button-29")
	private WebElement customTshirtAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/30/1/1\"),!1']")
	private WebElement levisTshirtAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/27/1/1\"),!1']")
	private WebElement nikeTshirtOption;
	@FindBy(css="select#product_attribute_11")
	private WebElement nikeTshirtSizeDD;
	@FindBy(css="button#add-to-cart-button-27")
	private WebElement nikeTshirtAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/28/1/1\"),!1']")
	private WebElement oversizedTshirtAddCart;
	@FindBy(css="span.close")
	private WebElement closeNotification;
	@FindBy(xpath="//a[text()=' Accessories ']")
	private WebElement accesoriesOption;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/31/1/1\"),!1']")
	private WebElement obeyHatOption;
	@FindBy(css="select#product_attribute_13")
	private WebElement obeyHatSizeDD;
	@FindBy(css="button#add-to-cart-button-31")
	private WebElement obeyHatAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/33/1/1\"),!1']")
	private WebElement rayBanAddCart;
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/32/1/1\"),!1']")
	private WebElement reversibleBeltAddCart;
	public WebElement getAccesoriesOption() {
		return accesoriesOption;
	}
	public WebElement getObeyHatOption() {
		return obeyHatOption;
	}
	public WebElement getObeyHatSizeDD() {
		return obeyHatSizeDD;
	}
	public WebElement getObeyHatAddCart() {
		return obeyHatAddCart;
	}
	public WebElement getRayBanAddCart() {
		return rayBanAddCart;
	}
	public WebElement getReversibleBeltAddCart() {
		return reversibleBeltAddCart;
	}
	public WebElement getApparelOption() {
		return apparelOption;
	}
	public WebElement getShoeOption() {
		return shoeOption;
	}
	public WebElement getAdidasShoeOption() {
		return adidasShoeOption;
	}
	public WebElement getAdidasShoeSizeDD() {
		return adidasShoeSizeDD;
	}
	public WebElement getAdidasShoeColor() {
		return adidasShoeColor;
	}
	public WebElement getAdidasShoeAddCart() {
		return adidasShoeAddCart;
	}
	public WebElement getNikeRosheShoeOption() {
		return nikeRosheShoeOption;
	}
	public WebElement getNikeRosheSizeDD() {
		return nikeRosheSizeDD;
	}
	public WebElement getNikeRoshecolorDD() {
		return nikeRoshecolorDD;
	}
	public WebElement getNikeRoshePrintOption() {
		return nikeRoshePrintOption;
	}
	public WebElement getNikeRosheAddCart() {
		return nikeRosheAddCart;
	}
	public WebElement getNikeMintAddCart() {
		return nikeMintAddCart;
	}
	public WebElement getClothingOption() {
		return clothingOption;
	}
	public WebElement getCustomTshirtOption() {
		return customTshirtOption;
	}
	public WebElement getCustomTshirtInputText() {
		return customTshirtInputText;
	}
	public WebElement getLevisTshirtAddCart() {
		return levisTshirtAddCart;
	}
	public WebElement getNikeTshirtOption() {
		return nikeTshirtOption;
	}
	public WebElement getNikeTshirtSizeDD() {
		return nikeTshirtSizeDD;
	}
	public WebElement getNikeTshirtAddCart() {
		return nikeTshirtAddCart;
	}
	public WebElement getOversizedTshirtAddCart() {
		return oversizedTshirtAddCart;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}
	public WebElement getCustomTshirtAddCart() {
		return customTshirtAddCart;
	}

}
