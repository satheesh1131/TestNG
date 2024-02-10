package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.nopCommerce.DigitalDownloadsElements;
import com.resources.BaseClass;

public class NopCommerceDigitalDownloads extends BaseClass{
	DigitalDownloadsElements elements;
	@Parameters({"browserName","pageUrl"})
	@Test(priority = 0)
	public void startUp(String browserName,String pageUrl) {
		NopCommerceSetup temp = new NopCommerceSetup();
		temp.browserSetup(browserName, pageUrl);
		elements=new DigitalDownloadsElements(getDriver());
	}
	@Test(priority=10,groups="digitalDownloads")
	public void ifYouWant() {
		reload();
		click(elements.getDigitalDownloadOption());
		click(elements.getIfYouWantOption());
		click(elements.getIfYouWantAddCart());
	}
	@Test(priority=20,groups="digitalDownloads")
	public void nightVision() {
		reload();
		click(elements.getDigitalDownloadOption());
		click(elements.getNightVisionAddCart());
	}
	@Test(priority=30,groups="digitalDownloads")
	public void scienceFaith() {
		reload();
		click(elements.getDigitalDownloadOption());
		click(elements.getScienceFaithOption());
		click(elements.getScienceFaithAddCart());
	}
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	
}
