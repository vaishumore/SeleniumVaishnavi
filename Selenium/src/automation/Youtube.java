package automation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("playdate");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
	Thread.sleep(50000);
	driver.close();
	
	
	

	}

}
