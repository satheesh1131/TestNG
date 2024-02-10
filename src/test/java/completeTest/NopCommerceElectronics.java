package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.nopCommerce.ElectronicsOptionElements;
import com.resources.BaseClass;

public class NopCommerceElectronics extends BaseClass{
	ElectronicsOptionElements elements;
	@Parameters({"browserName","pageUrl"})
	@Test(priority = 0)
	public void startUp(String browserName,String pageUrl) {
		NopCommerceSetup temp = new NopCommerceSetup();
		temp.browserSetup(browserName, pageUrl);
		elements=new ElectronicsOptionElements(getDriver());
	}
	@Test(priority=10,groups="camera")
	public void cameraPhoto() {
		reload();
		click(elements.getElectronicsOption());
		click(elements.getCameraPhotoOption());
	}
	@Test(priority=11,groups="camera",dependsOnMethods = "cameraPhoto")
	public void nikonDslr() {
		click(elements.getNikonDslrOption());
		click(elements.getNikonDslrBlackAddCart());
		back();
	}
	@Test(priority=12,groups="camera",dependsOnMethods = "cameraPhoto")
	public void leicaDigitalCamera() {
		click(elements.getLeicaDigiCameraAddCart());
	}
	@Test(priority=20,groups="cellphone")
	public void cellPhone() {
		reload();
		click(elements.getElectronicsOption());
		click(elements.getCellphoneOption());
	}
	@Test(priority=21,groups="cellphone",dependsOnMethods = "cellPhone")
	public void htcOneM8() {
		click(elements.getHtcOneAddCart());
	}
	@Test(priority=22,groups="cellphone",dependsOnMethods = "cellPhone")
	public void htcMini() {
		click(elements.getHtcOneMiniAddCart());
	}
	@Test(priority=23,groups="cellphone",dependsOnMethods = "cellPhone")
	public void nokiaLumia() {
		click(elements.getNokiaLumiaAddCart());
	}
	@Test(priority=30,groups="others")
	public void othersOption() {
		reload();
		click(elements.getElectronicsOption());
		click(elements.getOthersOption());
	}
	@Test(priority=31,groups="others",dependsOnMethods = "othersOption")
	public void beatsPillSpeaker() {
		click(elements.getBeatsWireLessSpeakerAddCart());
	}
	@Test(priority=32,groups="others",dependsOnMethods = "othersOption")
	public void portableSpeakers() {
		click(elements.getPotableSpeakerAddCart());
	}
	@Test(priority=33,groups="others",dependsOnMethods = "othersOption")
	public void uniTabletCover() {
		click(elements.getUniTabletCoverAddCart());
	}
	
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	
}
