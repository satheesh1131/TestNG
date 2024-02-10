package threadLocal;

import java.io.IOException;

import org.testng.annotations.Test;

import com.excel.methods.Excel_Methods;
import com.page.objects.SauceDemoElements;
import com.resources.BaseClass;

public class SauceDemoParallel extends BaseClass{
	Excel_Methods em;
	String sN;
	SauceDemoElements elements;
	@Test(priority = -1)
	public void browser() {
		try {
			em = new Excel_Methods("C:\\Users\\dell\\Documents\\WorkBook\\MavenWorkBook.xlsx");
		} catch (IOException e) {
			e.printStackTrace();
		}
		sN= em.getSheetName(2);
		openBrowser(em.getCellValue(sN, 0, 0));
		loadUrl(em.getCellValue(sN, 0, 1));
		elements = new SauceDemoElements(getDriver());
	}
	@Test(priority = 1,dependsOnMethods = "login")
	public void addToCart() {
		click(elements.getAddCartButton().get(1));
		click(elements.getShopCartButton());
	}
	@Test(priority = 4,dependsOnMethods = "personalDetails")
	public void finishOrder() {
		System.out.println(getText(elements.getTotalPrice()));
		click(elements.getFinishOrderButton());
		System.out.println(getText(elements.getOrderConfirmMessage()));
	}
	@Test(priority = 0)
	public void login() {
		sendText(elements.getUsernameTextBox(), em.getCellValue(sN, 0, 2));
		sendText(elements.getPasswordTextBox(), em.getCellValue(sN, 0, 3));
		click(elements.getLoginButton());
	}
	@Test(priority = 2,dependsOnMethods = "addToCart")
	public void checkOut() {
		click(elements.getCheckoutButton());
	}
	@Test(priority = 3,dependsOnMethods = "checkOut")
	public void personalDetails() {
		sendText(elements.getFirstNameTextbox(), em.getCellValue(sN, 0, 4));
		sendText(elements.getLastNameTextbox(), em.getCellValue(sN, 0, 5));
		sendText(elements.getPincodeTextbox(), em.getCellValue(sN, 0, 6));
		click(elements.getContinueToOrder());
	}
	@Test(priority = 5,dependsOnMethods = "finishOrder")
	public void tearDown() {
		try {
			em.woorBookClose();
		} catch (IOException e) {
			e.printStackTrace();
		}
		closeBrowser();
	}

}
