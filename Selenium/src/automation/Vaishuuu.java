package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vaishuuu {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		driver.get("https://zams.co.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.meesho.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [@placeholder='Try Saree, Kurti or Search by Product Code']"))
				.sendKeys("shoes");
		Thread.sleep(2000);
		driver.close();

	}

}
