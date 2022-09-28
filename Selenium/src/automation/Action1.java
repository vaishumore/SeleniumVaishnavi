package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]")).click();
		WebElement contactNo = driver.findElement(By.xpath("//p[contains(.,'Bengaluru, India')]/following-sibling::p"));
		System.out.println(contactNo.getText());
		Thread.sleep(4000);
		driver.close();

	}

}
