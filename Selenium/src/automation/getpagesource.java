package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		driver.close();

	}

}
