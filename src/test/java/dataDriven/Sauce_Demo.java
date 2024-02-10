package dataDriven;

import java.io.IOException;

import com.excel.methods.Excel_Methods;
import com.page.objects.SauceDemoElements;
import com.resources.Reusauble_Methods;

public class Sauce_Demo extends Reusauble_Methods {
	public static void main(String[] args) throws IOException {
		Excel_Methods em = new Excel_Methods("C:\\Users\\dell\\Documents\\WorkBook\\MavenWorkBook.xlsx");
		String sN = em.getSheetName(2);
		openBrowser(em.getCellValue(sN, 0, 0));
		SauceDemoElements elements = new SauceDemoElements(driver);
		loadUrl(em.getCellValue(sN, 0, 1));
		screenShotPage("./Screenshot/SauceDemo/img1.png");
		waitForElementVisible(elements.getUsernameTextBox());
		sendText(elements.getUsernameTextBox(), em.getCellValue(sN, 0, 2));
		sendText(elements.getPasswordTextBox(), em.getCellValue(sN, 0, 3));
		click(elements.getLoginButton());
		screenShotPage("./Screenshot/SauceDemo/img2.png");
		click(elements.getAddCartButton().get(3));
		click(elements.getShopCartButton());
		screenShotPage("./Screenshot/SauceDemo/img3.png");
		click(elements.getCheckoutButton());
		sendText(elements.getFirstNameTextbox(), em.getCellValue(sN, 0, 4));
		sendText(elements.getLastNameTextbox(), em.getCellValue(sN, 0, 5));
		sendText(elements.getPincodeTextbox(), em.getCellValue(sN, 0, 6));
		screenShotPage("./Screenshot/SauceDemo/img4.png");
		click(elements.getContinueToOrder());
		System.out.println(getText(elements.getTotalPrice()));
		click(elements.getFinishOrderButton());
		System.out.println(getText(elements.getOrderConfirmMessage()));
		screenShotPage("./Screenshot/SauceDemo/img5.png");
		click(elements.getBackHomeButton());
		em.woorBookClose();
		closeBrowser();
	}
}
