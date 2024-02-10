package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.page.objects.Fb_Login_Elements;
import com.page.objects.InstagramLoginElements;
import com.resources.Reusauble_Methods;

public class ParallelExecution extends Reusauble_Methods{
	@Test(dataProviderClass = dataProvider.DataProviderAll.class,dataProvider = "facebook")
	public void fbLog(String email,String pass) {
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
	public void instaLog(String email,String pass) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		InstagramLoginElements elements = new InstagramLoginElements(driver);
		sendText(elements.getUserNameTextBox(), email);
		sendText(elements.getPassWordTextBox(), pass);
		click(elements.getLoginButton());
		driver.quit();
	}

}
