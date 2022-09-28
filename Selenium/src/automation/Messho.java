package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Messho {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://meesho.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("confirm('VithuMauali')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Robot r1 = new Robot();
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		for (int i = 1; i <= 9; i++) {
			r1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.close();

		driver.close();

	}

}
