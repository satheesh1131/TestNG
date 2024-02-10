package testNG;

import org.testng.annotations.*;

public class Annotation1 {
	@BeforeSuite
	public void BS() {
		System.out.println("beforeSuite");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void AM() {
		System.out.println("afterMethod");
	}
	@AfterSuite
	public void AS() {
		System.out.println("afterSuite");
	}
	@BeforeClass
	public void BC() {
		System.out.println("beforeClass");
	}
	@BeforeTest
	public void BT() {
		System.out.println("beforeTest");
	}
	@AfterTest
	public void AT() {
		System.out.println("afterTest");
	}
	@AfterClass
	public void AC() {
		System.out.println("afterClass");
	}
	@Test
	public void faceBook() {
		System.out.println("Facebook");
	}
	@Test
	public void instagram() {
		System.out.println("Instagram");
	}
	@Test
	public void whatsApp() {
		System.out.println("Whatsapp");
	}
	

}
