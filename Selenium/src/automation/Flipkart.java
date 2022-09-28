package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//a"));
		System.out.println("Total Autosuggestions:" + autosuggestions.size());
		for (int i = 0; i < autosuggestions.size(); i++) {
			System.out.println(autosuggestions.get(i).getText());

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Mobiles'])[2]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
