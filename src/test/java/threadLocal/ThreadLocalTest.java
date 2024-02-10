package threadLocal;

import org.testng.annotations.Test;

import com.page.objects.Fb_Login_Elements;
import com.resources.BaseClass;


public class ThreadLocalTest extends BaseClass{
	@Test(dataProviderClass = threadLocal.DataProviderFB.class,dataProvider =  "fbInputs")
	public void FbChrome(String email,String pass) {
		openBrowser("chrome");
		Fb_Login_Elements elements=new Fb_Login_Elements(getDriver());
		System.out.println("test1  "+Thread.currentThread().getId());
		loadUrl("https://www.facebook.com/");
		sendText(elements.getUserNameTextBox(), email);
		sendText(elements.getPassWordTextBox(), pass);
		elements.getLoginButton().click();
		System.out.println("test1  "+Thread.currentThread().getId());
		closeBrowser();
	}
	@Test(dataProviderClass = threadLocal.DataProviderFB.class,dataProvider =  "fbInputs")
	public void FbEdge(String email,String pass) {
		openBrowser("edge");
		Fb_Login_Elements elements=new Fb_Login_Elements(getDriver());
		System.out.println("test2  "+Thread.currentThread().getId());
		loadUrl("https://www.facebook.com/");
		sendText(elements.getUserNameTextBox(), email);
		sendText(elements.getPassWordTextBox(), pass);
		elements.getLoginButton().click();
		System.out.println("test2  "+Thread.currentThread().getId());
		closeBrowser();
	}

}
