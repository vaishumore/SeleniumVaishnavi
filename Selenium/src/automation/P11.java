package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://www.fb.com");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("MAUALI");
		Thread.sleep(3000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(3000);
		driver.close();

	}

}
