package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.instagram.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
