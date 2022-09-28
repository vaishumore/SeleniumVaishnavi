			package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div [.='Login ']")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("abchdgdn");
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(2000);
		// to handle this pop up
		Alert al = driver.switchTo().alert();
		al.accept();// Clicks on ok button
		// al.dismiss();// Clicks on cancel button
		Thread.sleep(2000);
		driver.close();

	}

}
