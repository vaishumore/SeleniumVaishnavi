package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vaishnavi/c.html");
		WebElement t1 = driver.findElement(By.className("h1"));
		t1.sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.className("h2")).sendKeys("1234");
		Thread.sleep(3000);
		driver.close();

	}

}
