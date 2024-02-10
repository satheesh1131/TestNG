package completeTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.methods.Excel_Methods;
import com.page.objects.nopCommerce.GiftCardOptionElements;
import com.resources.BaseClass;

public class NopCommerceGiftCards extends BaseClass {
	GiftCardOptionElements elements;
	Excel_Methods em;
	NopCommerceSetup ncs=new NopCommerceSetup();
	@Parameters({"browserName","pageUrl","workBook"})
	@Test(priority = 0)
	public void startUp(String browserName,String pageUrl,String wbLocation) {
		NopCommerceSetup temp = new NopCommerceSetup();
		temp.browserSetup(browserName, pageUrl);
		elements=new GiftCardOptionElements(getDriver());
		em=ncs.excelSetup(wbLocation);
	}
	@Test(priority=10,groups="giftCards")
	public void virtualGiftCard() {
		reload();
		click(elements.getGiftCardOption());
		click(elements.getVirtualGiftCardOption());
		sendText(elements.getVgcRecipientsNameTextBox(),em.getCellValue(em.getSheetName(0), 1, 0));
		sendText(elements.getVgcRecipientsEmailTextBox(), em.getCellValue(em.getSheetName(0), 1, 1));
		sendText(elements.getVgcSendersNameTextBox(),em.getCellValue(em.getSheetName(0), 1, 2));
		sendText(elements.getVgcSendersEmailTextBox(), em.getCellValue(em.getSheetName(0), 1, 3));
		click(elements.getVgcMessageTextBox());
		sendText(elements.getVgcMessageTextBox(), em.getCellValue(em.getSheetName(0), 1, 4));
		click(elements.getVirtualGiftCardAddCart());
	}
	@Test(priority=20,groups="giftCards")
	public void physicalGiftCard50() {
		reload();
		click(elements.getGiftCardOption());
		click(elements.getPhysicalGiftCard50Option());
		sendText(elements.getPgc50RecipientsNameTextBox(),em.getCellValue(em.getSheetName(0), 1, 0));
		sendText(elements.getPgc50SendersNameTextBox(), em.getCellValue(em.getSheetName(0), 1, 2));
		click(elements.getPgc50MessageTextBox());
		sendText(elements.getPgc50MessageTextBox(),em.getCellValue(em.getSheetName(0), 1, 4));
		click(elements.getPhysicalGiftCard50AddCart());
	}
	@Test(priority=30,groups="giftCards")
	public void physicalGiftCard100() {
		reload();
		click(elements.getGiftCardOption());
		click(elements.getPhysicalGiftCard100Option());
		sendText(elements.getPgc100RecipientsNameTextBox(),em.getCellValue(em.getSheetName(0), 1, 0));
		sendText(elements.getPgc100SendersNameTextBox(), em.getCellValue(em.getSheetName(0), 1, 2));
		click(elements.getPgc100MessageTextBox());
		sendText(elements.getPgc100MessageTextBox(),em.getCellValue(em.getSheetName(0), 1, 4));
		click(elements.getPhysicalGiftCard100AddCart());
	}
	@AfterMethod(alwaysRun = true)
	public void screenshot(ITestResult result) {
		screenShotPage("./Screenshot/ncComplete/"+result.getMethod().getMethodName()+".png");
	}
	

}
