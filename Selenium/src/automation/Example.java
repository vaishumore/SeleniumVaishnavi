package automation;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Example {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://www.youtube.com/");
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("arabic kuthu");
	    driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
        wait.until(ExpectedConditions.titleContains("arabic"));
        Thread.sleep(2000);
        System.out.println("Test is passed");
        driver.close();
	}

}
