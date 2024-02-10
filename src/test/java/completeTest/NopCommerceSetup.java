package completeTest;

import java.io.IOException;

import com.excel.methods.Excel_Methods;
import com.resources.BaseClass;

public class NopCommerceSetup extends BaseClass{
	Excel_Methods em;
	public void browserSetup(String browserName,String pageUrl) {
		openBrowser(browserName);
		loadUrl(pageUrl);
		implicityWait();
	}
	public Excel_Methods excelSetup(String wbLocation) {
		try {
			em = new Excel_Methods(wbLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return em;
	}
	public void tearDown() {
		try {
			em.woorBookClose();
		} catch (IOException e) {
			e.printStackTrace();
		}
		closeBrowser();
	}

}
