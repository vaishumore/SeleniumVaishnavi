package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPOMclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		LoginpagePOMclass l1 = new LoginpagePOMclass(driver);
		l1.setusername("vaishu");
		Thread.sleep(2000);
		l1.setpassword("123456");
		Thread.sleep(2000);
		l1.clicklogin();
		Thread.sleep(2000);
		l1.setusername("admin");
		Thread.sleep(2000);
		l1.setpassword("manager");
		Thread.sleep(2000);
		l1.clicklogin();
		Thread.sleep(20000);
		driver.close();

		
	}

}
