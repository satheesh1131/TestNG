package dataDriven;

import java.io.IOException;

import com.excel.methods.Excel_Methods;
import com.page.objects.Fb_Login_Elements;
import com.resources.Reusauble_Methods;

public class FbLogin extends Reusauble_Methods {
	public static void main(String[] args) throws IOException {
		openBrowser("chrome");
		loadUrl("https://www.facebook.com/");
		screenShotPage("./Screenshot/FBLog/img1.png");
		Excel_Methods em = new Excel_Methods("C:\\Users\\dell\\Documents\\WorkBook\\MavenWorkBook.xlsx");
		Fb_Login_Elements elements = new Fb_Login_Elements(driver);
		sendText(elements.getUserNameTextBox(),em.getCellValue(em.getSheetName(0), 0, 0));
		sendText(elements.getPassWordTextBox(),em.getCellValue(em.getSheetName(0), 0, 1));
		screenShotPage("./Screenshot/FBLog/img2.png");
		click(elements.getLoginButton());
		em.woorBookClose();
		closeBrowser();
	}
}
