package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vaishnavi/b.html");
		Thread.sleep(3000);
		driver.findElement(By.id("un")).sendKeys("Mauali");
		Thread.sleep(3000);
		driver.findElement(By.id("pw")).sendKeys("vithu");
		Thread.sleep(3000);
		driver.findElement(By.linkText("forgot password???")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("lg")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cl")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
