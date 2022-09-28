package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	Thread.sleep(4000);
	driver.close();
	
	

	}

}
