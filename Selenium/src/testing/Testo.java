package testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testo {

	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test(priority = 1)
	public void P1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void P2() throws InterruptedException {
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void P3() throws IOException, InterruptedException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./images/filpkartttttt.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		List<WebElement> Autosuggestions = driver.findElements(By.xpath("//a"));
		System.out.println("Total Autosuggestions " + Autosuggestions.size());
		for (int i = 1; i < Autosuggestions.size(); i++) {
			System.out.println(Autosuggestions.get(i).getText());
		}
		driver.close();
	}

}
