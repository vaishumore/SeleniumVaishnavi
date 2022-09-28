package testing;

import org.testng.annotations.Test;

public class P3 {

	@Test(invocationCount = 5, priority = 1)
	public void dog() {
		System.out.println("bhooobhooooo");

	}

	@Test(invocationCount = 4, priority = 1)
	public void cat() {
		System.out.println("Mewomewomewomewo");
	}

	@Test(invocationCount = 3, priority = 2)
	public void cow() {
		System.out.println("hamamamamamam");
	}

}
