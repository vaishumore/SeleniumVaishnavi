package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectTestcase2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Project']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='itemRow cpItemRow '])[5]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
