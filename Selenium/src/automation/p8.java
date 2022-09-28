package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.fb.com");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Mauali");
		Thread.sleep(5000);
		driver.close();

	}

}
