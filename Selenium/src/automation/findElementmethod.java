package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementmethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement untb = driver.findElement(By.name("username"));
		untb.sendKeys("abcd");
		Thread.sleep(3000);
		WebElement pwtb = driver.findElement(By.name("pwd"));
		pwtb.sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
