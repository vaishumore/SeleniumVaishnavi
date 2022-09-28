package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Youtube {

	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test(priority = 1)
	public void Openpage() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test(priority = 2)
	public void Youtubeopenpg() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("param sundri");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[8]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void palysong() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id=\"video-title\"])[1]")).click();
		Thread.sleep(20000);
		driver.close();

	}

}
