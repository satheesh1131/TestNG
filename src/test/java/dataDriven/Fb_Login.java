package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fb_Login{
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/FbLogin/img1.png"));
		WebElement userName = driver.findElement(By.id("email"));
		WebElement passWord = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.cssSelector("button[name='login']"));
		File f = new File("C:\\Users\\dell\\Documents\\WorkBook\\MavenWorkBook.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wB = new XSSFWorkbook(fis);
		XSSFCell s1r1c1 = wB.getSheet("FB_Login").getRow(0).getCell(0);
		XSSFCell s1r1c2 = wB.getSheet("FB_Login").getRow(0).getCell(1);
		String userNameValue = s1r1c1.getStringCellValue();
		DataFormatter dF = new DataFormatter();
		String passWordValue = dF.formatCellValue(s1r1c2);
		userName.sendKeys(userNameValue);
		passWord.sendKeys(passWordValue);
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/FbLogin/img2.png"));
		login.click();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/FbLogin/img3.png"));
		wB.close();
		driver.quit();
	}
}
