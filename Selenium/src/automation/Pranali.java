package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pranali {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> Autosuggestions = driver.findElements(By.xpath("//span[contains(.,'ava')]"));
		System.out.println("Total auto suggestions:" + Autosuggestions.size());
		Thread.sleep(2000);
		System.out.println("====================================================");
		for (int i = 0; i < Autosuggestions.size(); i++) {
			System.out.println(Autosuggestions.get(i).getText());
		}
		driver.close();
	}

}
