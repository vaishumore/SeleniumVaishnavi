package testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P10 {

	@BeforeMethod
	public void apple() {
		System.out.println("@Before Method");
	}

	@Test
	public void mango() {
		System.out.println("Test Begin");
		SoftAssert S1 = new SoftAssert();
		S1.fail();
		System.out.println("Test Ends");
		S1.assertAll();
	}

	@AfterMethod
	public void banana() {
		System.out.println("@After Method");
	}

}
