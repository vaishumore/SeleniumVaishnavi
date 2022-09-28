package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.pantaloons.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[.='WOMEN']"));
		Thread.sleep(2000);
		driver.close();

	}

}
