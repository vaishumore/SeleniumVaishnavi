package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		Thread.sleep(3000);
		driver.navigate().to("http://www.amazon.com");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.close();

	}

}
