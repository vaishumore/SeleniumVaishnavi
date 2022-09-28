package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup2quit {
    static {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Thread.sleep(2000);
	driver.quit();
	

	}

}
