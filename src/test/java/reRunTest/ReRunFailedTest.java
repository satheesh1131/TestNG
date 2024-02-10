package reRunTest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.objects.Fb_Login_Elements;
import com.resources.Reusauble_Methods;

public class ReRunFailedTest extends Reusauble_Methods{
	
	@Test
	public void fbLog() throws Exception {
		openBrowser("chrome");
		loadUrl("https://www.facebook.com/");
		Fb_Login_Elements elements= new Fb_Login_Elements(driver);
		String expected=getPageTitle();
		sendText(elements.getUserNameTextBox(), "jagan@gmail.com");
		sendText(elements.getPassWordTextBox(), "12345678");
		click(elements.getLoginButton());
		String pageTitle = getPageTitle();
		closeBrowser();
		Assert.assertEquals(pageTitle, expected);
	}
		
		
	

}
