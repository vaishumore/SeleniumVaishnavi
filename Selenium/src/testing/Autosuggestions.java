package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("automation");
		List<WebElement> AutoSuggestions = driver.findElements(By.xpath("//span [contains(.,'mation')]"));
		System.out.println(AutoSuggestions.size());
		System.out.println("=====================================================================");
		for (int i = 0; i < AutoSuggestions.size(); i++) {

			System.out.println(AutoSuggestions.get(i).getText());

		}
		Thread.sleep(2000);
		driver.navigate().to("https://www.goindigo.in/");
		Thread.sleep(2000);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}

}
