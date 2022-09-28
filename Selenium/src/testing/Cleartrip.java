package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mu");
		Thread.sleep(2000);
		List<WebElement> AutoSuggestions = driver.findElements(By.xpath("//p[contains(.,'Mu')]"));
		System.out.println("Total Autosuggestions = " + AutoSuggestions.size());
		System.out.println(
				"=========================================================================================================");

		for (int i = 0; i <= AutoSuggestions.size(); i++) {
			System.out.println(AutoSuggestions.get(i).getText());
		}
		Thread.sleep(2000);
		driver.close();

	}

}
