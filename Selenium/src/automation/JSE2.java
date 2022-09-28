package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("confirm('hii')");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();

	}

}
