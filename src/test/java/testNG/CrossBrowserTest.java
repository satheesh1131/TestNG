package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.page.objects.Fb_Login_Elements;
import com.resources.Reusauble_Methods;

public class CrossBrowserTest extends Reusauble_Methods{
	@Test(dataProviderClass = dataProvider.DataProviderAll.class,dataProvider = "facebook")
	public void fbLog1(String email,String pass) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Fb_Login_Elements elements=new Fb_Login_Elements(driver);
		sendText(elements.getUserNameTextBox(), email);
		sendText(elements.getPassWordTextBox(), pass);
		click(elements.getLoginButton());
		driver.quit();
	}
	@Test(dataProviderClass = dataProvider.DataProviderAll.class,dataProvider = "instagram")
	public void fbLog2(String email,String pass) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Fb_Login_Elements elements=new Fb_Login_Elements(driver);
		sendText(elements.getUserNameTextBox(), email);
		sendText(elements.getPassWordTextBox(), pass);
		click(elements.getLoginButton());
		driver.quit();
	}

}
