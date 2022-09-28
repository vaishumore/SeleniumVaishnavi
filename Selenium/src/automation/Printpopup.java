package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Robot r1 = new Robot();
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		for (int i = 1; i <= 9; i++) {
			r1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
		}
//	 r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		driver.close();

	}

}
