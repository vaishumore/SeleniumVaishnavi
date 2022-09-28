package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTrav1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(.,'Latest stable version')]/a")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
