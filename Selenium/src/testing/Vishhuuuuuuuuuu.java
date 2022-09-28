package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vishhuuuuuuuuuu {

	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test(priority = 1)
	public void filpkart() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(24));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void hiddenpopup() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
