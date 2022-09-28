package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pumacrazzzyyyyyyyyyyshoeee {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.manage().deleteAllCookies();
		driver.get("https://in.puma.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='×']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span [@class='p-nav-item-link-inner'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://www.amazon.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("http://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("admin");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("manager");
		Thread.sleep(2000);
		driver.close();

	}

}
