package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P6 {

	@AfterSuite
	public void a2() {
		System.out.println("After suite");
	}

	@BeforeTest
	public void cherry() {
		System.out.println("Before Test of P6");
	}

	@AfterTest
	public void strawberry() {
		System.out.println("After Test of P6");
	}

	@AfterClass
	public void sitaphal() {
		System.out.println("sitaphal");
	}

	@BeforeClass
	public void ramphal() {
		System.out.println("ramphal");
	}

	@BeforeMethod
	public void greenapple() {
		System.out.println("green apple");

	}

	@Test
	public void apple() {
		System.out.println("apple");
	}

	@Test
	public void custardapple() {
		System.out.println("custard apple");
	}

	@AfterMethod
	public void pineaaple() {
		System.out.println("pineaaple");
	}

	@BeforeSuite
	public void a3() {
		System.out.println("Before suite");
	}

}
