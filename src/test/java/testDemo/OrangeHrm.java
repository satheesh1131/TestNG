package testDemo;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.page.objects.OrangeHrmPage;
import com.resources.BaseClass;

public class OrangeHrm extends BaseClass{
	OrangeHrmPage elements;
	@BeforeSuite
	public void browserLauch() {
		openBrowser("chrome");
		implicityWait();
		loadUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		elements=new OrangeHrmPage(getDriver());
	}
	@Test(priority = 0)
	public void loginPage() {
		sendText(elements.getUsernameInput(),"Admin");
		sendText(elements.getPasswordInput(), "admin123");
		click(elements.getSubmitButton());		
	}
	@Test(priority = 1)
	public void loginVerify() {
		Assert.assertEquals(getPageUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	@AfterSuite
	public void teardown() {
		closeBrowser();
	}

}
