package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActitimeprojectTestcase1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a)[4]")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Vithu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='- Select Customer -'])[3]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Big Bang Company'])[2]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Create Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
         
	}

}
