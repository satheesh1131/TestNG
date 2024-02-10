package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.resources.Reusauble_Methods;
public class ParameterisationFB extends Reusauble_Methods {
	@BeforeMethod
	public void browser() {
		openBrowser("chrome");
	}
	@Parameters({"email","pass"})
	@Test(priority = 1,timeOut = 3000)
	public void loginTest1(String userName,String passWord) {
		newWindow("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);
		driver.findElement(By.name("login")).click();
	}
	@Parameters({"email1","pass1"})
	@Test(priority = 0,invocationCount = 1,invocationTimeOut = 3000)
	public void loginTest2(String userName,String passWord) {
		newWindow("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);
		driver.findElement(By.name("login")).click();
	}
	@AfterMethod
	public void closeTestWindow() {
		closeBrowser();
	}
}
