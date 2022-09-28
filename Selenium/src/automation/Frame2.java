package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vaishnavi/Page1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("QWER ");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("1234 ");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("yuiop ");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("5689 ");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("vbnnh ");
		Thread.sleep(2000);
		WebElement vithu = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(vithu);
		driver.findElement(By.id("t2")).sendKeys("45621 ");
		Thread.sleep(2000);
		driver.close();

	}

}
