package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8879925202");
		driver.findElement(By.id("pass")).sendKeys("Vithu@21");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//div[@aria-label='Your profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}