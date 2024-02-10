package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.nopCommerce.ComputerOptionElements;
import com.resources.BaseClass;

public class NopCommerceComputer extends BaseClass {
	ComputerOptionElements elements;
	@Parameters({"browserName","pageUrl"})
	@Test(priority = 0)
	public void startUp(String browserName,String pageUrl) {
		NopCommerceSetup temp = new NopCommerceSetup();
		temp.browserSetup(browserName, pageUrl);
		elements=new ComputerOptionElements(getDriver());
	}
	@Test(priority = 10)
	public void deskTop() {
		reload();
		click(elements.getComputerMenu());
		click(elements.getDesktopOption());
	}
	@Test(priority = 11,dependsOnMethods = "deskTop",groups = "desktop")
	public void cpu() {
		click(elements.getCpuOption());
		selectByIndex(elements.getRamSelectDD(), 1);
		click(elements.gethdd320GButton());
		click(elements.getCpuAddCart());
		click(elements.getCloseNotification());
		back();
	}
	@Test(priority = 12,dependsOnMethods = "deskTop",groups = "desktop")
	public void customPC() {
		click(elements.getCustomPerformancePcAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 13,dependsOnMethods = "deskTop",groups = "desktop")
	public void lenevoIdeaCentre() {
		click(elements.getLenevoIdeaCentreAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 20)
	public void noteBooks() {
		reload();
		click(elements.getComputerMenu());
		click(elements.getNotebookOption());
	}
	@Test(priority = 21,dependsOnMethods = "noteBooks",groups = "notebooks")
	public void appleMac() {
		click(elements.getAppleMacbookOption());
		click(elements.getAppleMacbookAddCart());
		click(elements.getCloseNotification());
		back();
	}
	@Test(priority = 22,dependsOnMethods = "noteBooks",groups = "notebooks")
	public void asusN551() {
		click(elements.getAsusLaptopAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 23,dependsOnMethods = "noteBooks",groups = "notebooks")
	public void hpEnvy() {
		click(elements.getHpEnvyAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 24,dependsOnMethods = "noteBooks",groups = "notebooks")
	public void hpSpectre() {
		click(elements.getHpSpectreAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 25,dependsOnMethods = "noteBooks",groups = "notebooks")
	public void lenovoThinkpad() {
		click(elements.getLenevoThinkpadAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 26,dependsOnMethods = "noteBooks",groups = "notebooks")
	public void samsungUltrabook() {
		click(elements.getSamsungUltrabookAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 30)
	public void softWare() {
		reload();
		click(elements.getComputerMenu());
		click(elements.getSoftwareOption());
	}
	@Test(priority = 31,dependsOnMethods = "softWare",groups = "software")
	public void soundForge() {
		click(elements.getSoundForgeAddCart());
		click(elements.getCloseNotification());
	}
	@Test(priority = 32,dependsOnMethods = "softWare",groups = "software")
	public void windows8() {
		click(elements.getWindows8proAddCart());
		click(elements.getCloseNotification());
	}
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	

}
