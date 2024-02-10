package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.methods.Excel_Methods;
import com.page.objects.nopCommerce.OrderDetailsElements;
import com.resources.BaseClass;

public class NopCommerceOrderCompletion extends BaseClass{
	OrderDetailsElements element;
	Excel_Methods em;
	NopCommerceSetup ncs = new NopCommerceSetup();
	@Parameters("workBook")
	@Test(priority = -1,dependsOnMethods = "completeTest.NopCommerceComputer.windows8")
	public void setUp(String wbLocation) {
		em=ncs.excelSetup(wbLocation);
		element=new OrderDetailsElements(getDriver());
	}
	@Test(priority = 0,groups = "cart")
	public void shopCartPage() {
		reload();
		click(element.getShoppingCart());
		click(element.getTermsOfServiceCheckbox());
		click(element.getCheckOutButton());
	}
	@Test(priority = 1,groups = "cart")
	public void checkOut() {
		click(element.getCheckOutGuestButton());
	}
	@Test(priority = 2,groups = "orderCompletion",dependsOnGroups = "cart")
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
	@Test(priority = 3,groups = "orderCompletion")
	public void shipMethodPage() {
		click(element.getContinueShippingMethod());
	}
	@Test(priority = 4,groups = "orderCompletion")
	public void paymentMethodPage() {
		click(element.getContinuePaymentMethod());
	}
	@Test(priority = 5,groups = "orderCompletion")
	public void paymentInfoPage() {
		click(element.getContinuePaymentInfo());
	}
	@Test(priority = 6,groups = "orderCompletion")
	public void confirmOrderPage() {
		click(element.getConfirmOrderButton());
	}
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	@AfterSuite(alwaysRun = true)
	public void closeSession() {
		ncs.tearDown();
	}

}
