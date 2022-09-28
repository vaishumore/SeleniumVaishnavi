package automation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingTask {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("ab@$12d");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1$%4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [.=' Login '] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [.=' Login '] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("vaishnavi");
		Thread.sleep(2000);
		driver.findElement(By.name("middleName")).sendKeys("more");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("vaishu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("4567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("8910");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
