package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	@Test(priority = 0, invocationCount = 5)
	public void kitkat() {
		System.out.println("Cadbury");
		Reporter.log("Nastle");
	}

	@Test(priority = 1, invocationCount = 6)
	public void Milkibar() {
		System.out.println("Dairymilk");
		Reporter.log("Nastle");
	}

	@Test(priority = 2, invocationCount = 3)
	public void Hustlenut() {
		System.out.println("Britaniya");
		Reporter.log("Nastle");
	}

}
