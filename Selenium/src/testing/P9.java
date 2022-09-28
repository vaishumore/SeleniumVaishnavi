package testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class P9 {
	@BeforeMethod
	public void apple() {
		System.out.println("@Before Method");

	}
    
	@Test
	public void Mango() {
		System.out.println("Test begins");
		Assert.fail(); // to fail the test case
		System.out.println("Test ends"); //won't execuate
	}

	@AfterMethod
	public void banana() {
		System.out.println("@After Method");
	}

}
