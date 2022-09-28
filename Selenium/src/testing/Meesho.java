package testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho {
	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	@Test(priority = 1)
	public void openpage() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void homepage() throws InterruptedException {
		driver.get("https://meesho.com/");
		driver.findElement(By.xpath("//span[.='Women Western']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Dresses']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Classy Graceful Women Dresses'])[1]"));
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void closepage() throws InterruptedException, IOException {
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./images/meesho.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		driver.close();

	}

}
