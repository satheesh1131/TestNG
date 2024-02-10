package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
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

}
