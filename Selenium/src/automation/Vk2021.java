package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vk2021 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.meesho.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		String s1 = driver.getPageSource();
		System.out.println(s1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]"));
		driver.close();

	}

}
