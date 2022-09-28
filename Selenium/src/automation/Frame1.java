package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vaishnavi/Page1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("abcd ");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("1230 ");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("ghjk ");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("4561 ");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("bnmv ");
		Thread.sleep(2000);
		WebElement p2 = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(p2);
		driver.findElement(By.id("t2")).sendKeys("9578 ");
		Thread.sleep(2000);
		driver.close();

	}

}
