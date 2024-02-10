package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.nopCommerce.BooksElements;
import com.resources.BaseClass;

public class NopCommerceBooks extends BaseClass{
	BooksElements elements;
	@Parameters({"browserName","pageUrl"})
	@Test(priority = 0)
	public void startUp(String browserName,String pageUrl) {
		NopCommerceSetup temp = new NopCommerceSetup();
		temp.browserSetup(browserName, pageUrl);
		elements=new BooksElements(getDriver());
	}
	@Test(priority=10,groups="books")
	public void farenheit451() {
		reload();
		click(elements.getBooksOption());
		click(elements.getFahrenheit451AddCart());
	}
	@Test(priority=20,groups="books")
	public void prizePies() {
		reload();
		click(elements.getBooksOption());
		click(elements.getFirstPrizePiesAddCart());
	}
	@Test(priority=30,groups="books")
	public void prideAndPrejudice() {
		reload();
		click(elements.getBooksOption());
		click(elements.getPrideAndPrejudiceAddCart());
	}
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	

}
