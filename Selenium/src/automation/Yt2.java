package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yt2 {
 static {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
 
 
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("maji pandharichi maay");
	driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
	driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
	Thread.sleep(50000);
	driver.close();

	}

}
