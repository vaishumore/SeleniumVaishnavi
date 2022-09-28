package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(3000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String v : allWindowHandles) {
			if (v.equals(parentwindow)) {

			} else {
				WebDriver childwindow = driver.switchTo().window(v);
				childwindow.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		driver.close();
	}

}