package testing;

import org.testng.annotations.Test;

public class P2 {

	@Test(priority = 1)
	public void chickoo() {
		System.out.println("chickoo");

	}

	@Test(priority = 2)
	public void apple() {
		System.out.println("apple");
	}

	@Test(priority = 3)
	public void banana() {
		System.out.println("banana");
	}
}
