package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.get("http://www.fb.com");
		driver.switchTo().activeElement().sendKeys("MAUALI");
		Thread.sleep(5000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(5000);
		driver.close();

	}

}
