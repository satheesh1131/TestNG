package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.nopCommerce.JewelryOptionElements;
import com.resources.BaseClass;

public class NopCommerceJewelry extends BaseClass {
	JewelryOptionElements elements;
	@Parameters({"browserName","pageUrl"})
	@Test(priority = 0)
	public void startUp(String browserName,String pageUrl) {
		NopCommerceSetup temp = new NopCommerceSetup();
		temp.browserSetup(browserName, pageUrl);
		elements=new JewelryOptionElements(getDriver());
	}
	@Test(priority=10,groups="jewelry")
	public void gemNecklace() {
		reload();
		click(elements.getJewelryOption());
		click(elements.getGemstoneNecklaceRent());
		click(elements.getGemNecklaceRentStartDate());
		click(elements.getStartDateTable());
		click(elements.getGemNecklaceRentEndDate());
		click(elements.getEndDateTable());
		click(elements.getGemNecklaceAddCart());
	}
	@Test(priority=20,groups="jewelry")
	public void flowerBracelet() {
		reload();
		click(elements.getJewelryOption());
		click(elements.getFlowerBraceletAddCart());
	}
	@Test(priority=30,groups="jewelry")
	public void vintageRing() {
		reload();
		click(elements.getJewelryOption());
		click(elements.getEngagementRingAddCart());
	}
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	

}
