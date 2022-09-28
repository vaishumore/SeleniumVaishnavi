package automation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yt3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	 driver.get("https://www.youtube.com/");
	 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("night");
	 driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
	 wait.until(ExpectedConditions.titleContains("night"));
	 Thread.sleep(4000);
	 System.out.println("Test is passed");
	 driver.close();

	}
   
  
   
   
}
    