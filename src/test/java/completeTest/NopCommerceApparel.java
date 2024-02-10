package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.objects.nopCommerce.ApparelOptionElements;
import com.resources.BaseClass;

public class NopCommerceApparel extends BaseClass{
	ApparelOptionElements elements;
	@Parameters({"browserName","pageUrl"})
	@Test(priority = 0)
	public void startUp(String browserName,String pageUrl) {
		NopCommerceSetup temp = new NopCommerceSetup();
		temp.browserSetup(browserName, pageUrl);
		elements=new ApparelOptionElements(getDriver());
	}
	@Test(priority=10,groups="shoes")
	public void shoes() {
		reload();
		click(elements.getApparelOption());
		click(elements.getShoeOption());
	}
	@Test(priority=11,groups="shoes",dependsOnMethods = "shoes")
	public void adidasCampus() {
		click(elements.getAdidasShoeOption());
		selectByVisibleText(elements.getAdidasShoeSizeDD(),"8");
		click(elements.getAdidasShoeColor());
		click(elements.getAdidasShoeAddCart());
		back();
	}
	@Test(priority=12,groups="shoes",dependsOnMethods = "shoes")
	public void nikeRoshe() {
		click(elements.getNikeRosheShoeOption());
		selectByValue(elements.getNikeRosheSizeDD(), "13");
		selectByVisibleText(elements.getNikeRoshecolorDD(),"White/Blue");
		click(elements.getNikeRoshePrintOption());
		click(elements.getNikeRosheAddCart());
		back();
	}
	@Test(priority=13,groups="shoes",dependsOnMethods = "shoes")
	public void nikeMint() {
		click(elements.getNikeMintAddCart());
	}
	@Test(priority=20,groups="cloths")
	public void clothing() {
		reload();
		click(elements.getApparelOption());
		click(elements.getClothingOption());
	}
	@Test(priority=21,groups="cloths",dependsOnMethods = "clothing")
	public void customTshirt() {
		click(elements.getCustomTshirtOption());
		sendText(elements.getCustomTshirtInputText(), "Greens");
		click(elements.getCustomTshirtAddCart());
		back();
	}
	@Test(priority=22,groups="cloths",dependsOnMethods = "clothing")
	public void levis511Jeans() {
		click(elements.getLevisTshirtAddCart());
	}
	@Test(priority=23,groups="cloths",dependsOnMethods = "clothing")
	public void nikeTshirt() {
		click(elements.getNikeTshirtOption());
		selectByIndex(elements.getNikeTshirtSizeDD(), 4);
		click(elements.getNikeTshirtAddCart());
		back();
	}
	@Test(priority=24,groups="cloths",dependsOnMethods = "clothing")
	public void overSizedTshirt() {
		click(elements.getOversizedTshirtAddCart());
	}
	@Test(priority=30,groups="accesories")
	public void accesories() {
		reload();
		click(elements.getApparelOption());
		click(elements.getAccesoriesOption());
	}
	@Test(priority=31,groups="accesories",dependsOnMethods = "accesories")
	public void obeyHat() {
		click(elements.getObeyHatOption());
		selectByValue(elements.getObeyHatSizeDD(),"35");
		click(elements.getObeyHatAddCart());
		back();
	}
	@Test(priority=32,groups="accesories",dependsOnMethods = "accesories")
	public void rayBanSunglass() {
		click(elements.getRayBanAddCart());
	}
	@Test(priority=33,groups="accesories",dependsOnMethods = "accesories")
	public void reversibleBelt() {
		click(elements.getReversibleBeltAddCart());
	}
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	
	
}
