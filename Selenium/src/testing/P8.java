package testing;

import org.testng.annotations.Test;

public class P8 {
	@Test(priority = 1, invocationCount = 5)
	public void Dairymilk() {
		System.out.println("Dairymilk");
	}

	@Test(priority = 3, invocationCount = 6)
	public void Milkibar() {
		System.out.println("Milkibar");
	}

	@Test(priority = 2, invocationCount = 8)
	public void Kitkat() {
		System.out.println("Kitkat");
	}

}
