package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/Vaishnavi/c.html");
		WebElement untb = driver.findElement(By.id("un"));
		untb.sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.id("pw")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.linkText("LINK-1")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.linkText("LINK-2")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();

		;

	}

}
