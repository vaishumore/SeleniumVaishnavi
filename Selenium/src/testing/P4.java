package testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P4 {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test(priority = 1)
	public void openpage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void testgoogle() {
		driver.get("http://www.google.com");
		driver.getCurrentUrl();
		driver.getTitle();
		driver.getPageSource();
	}

	@Test(priority = 3)
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
