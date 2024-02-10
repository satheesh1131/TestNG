package testNG;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.excel.methods.Excel_Methods;
import com.page.objects.NopCommerceElements;
import com.resources.Reusauble_Methods;

public class Nop_Commerce extends Reusauble_Methods{
	Excel_Methods em;
	NopCommerceElements element;
	@BeforeSuite(alwaysRun = true)
	public void browser() {
		try {
			em=new Excel_Methods("C:\\Users\\dell\\Documents\\WorkBook\\MavenWorkBook.xlsx");
		} catch (IOException e) {
			e.printStackTrace();
		}
		openBrowser(em.getCellValue("NC", 0, 1));
		element=new NopCommerceElements(driver);
		loadUrl(em.getCellValue("NC", 0, 0));
	}
	@BeforeTest(alwaysRun = true)
	public void waits() {
		implicityWait();
	}
	@Test(priority = 0,groups = "category")
	public void homePage() {
		click(element.getComputerOption());
	}
	@Test(priority = 1,groups = "category")
	public void computerOptionPage() {
		click(element.getNoteBookOption());
	}
	@Test(priority = 3,groups = "selectProduct",dependsOnGroups = "category")
	public void appleProductPage() {
		click(element.getAppleMacBook());
		click(element.getAppleMacBookAddCart());
		click(element.getCloseNotification());
	}
	@Test(priority = 2,groups = "selectProduct")
	public void hpProductPage() {
		click(element.getHpSpectreAddCart());
		click(element.getCloseNotification());
	}
	@Test(priority = 4,groups = "cart",dependsOnGroups = "selectProduct")
	public void shopCartPage() {
		click(element.getShoppingCart());
		click(element.getTermsOfServiceCheckbox());
		click(element.getCheckOutButton());
	}
	@Test(priority = 5,groups = "cart")
	public void checkOut() {
		click(element.getCheckOutGuestButton());
	}
	@Test(priority = 6,groups = "orderCompletion",dependsOnGroups = "cart")
	public void billingAddressPage() {
		sendText(element.getFirstNameInput(), em.getCellValue("NC", 0, 2));
		sendText(element.getLastNameInput(), em.getCellValue("NC", 0, 3));
		sendText(element.getEmailInput(), em.getCellValue("NC", 0, 4));
		sendText(element.getCompanyNameInput(), em.getCellValue("NC", 0, 5));
		selectByValue(element.getCountryDD(), em.getCellValue("NC", 0, 6));
		sendText(element.getCityNameInput(), em.getCellValue("NC", 0, 7));
		sendText(element.getAddressInput(), em.getCellValue("NC", 0, 8));
		sendText(element.getPinCodeInput(), em.getCellValue("NC", 0, 9));
		sendText(element.getPhoneNumberInput(), em.getCellValue("NC", 0, 10));
		click(element.getContinueBillingAddress());
	}
	@Test(priority = 7,groups = "orderCompletion")
	public void shipMethodPage() {
		click(element.getContinueShippingMethod());
	}
	@Test(priority = 8,groups = "orderCompletion")
	public void paymentMethodPage() {
		click(element.getContinuePaymentMethod());
	}
	@Test(priority = 9,groups = "orderCompletion")
	public void paymentInfoPage() {
		click(element.getContinuePaymentInfo());
	}
	@Test(priority = 10,groups = "orderCompletion")
	public void confirmOrderPage() {
		click(element.getConfirmOrderButton());
	}
	@Test(priority = 11,groups = "home",dependsOnGroups = "orderCompletion")
	public void returnHomePage() {
		click(element.getContinueHomeButton());
	}
	
	@AfterMethod(alwaysRun = true)
	public void screenShot(ITestResult result) {
		screenShotPage("./Screenshot/NopCommerceXML/"+result.getMethod().getMethodName()+".png");
	}
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		try {
			em.woorBookClose();
		} catch (IOException e) {
			e.printStackTrace();
		}
		closeBrowser();
	}
	
	
	
	

}
