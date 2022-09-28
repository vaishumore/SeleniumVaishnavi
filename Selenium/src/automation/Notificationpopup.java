package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.name("email")).sendKeys("8879925202");
		driver.findElement(By.id("pass")).sendKeys("Vithu@21");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//div[@aria-label='Your profile']")).click();
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
