package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {
    static {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
    driver.findElement(By.xpath("//div[.='Login ']")).click();
    wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
    driver.findElement(By.xpath("//a[.='Logout']")).click();
    wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
    System.out.println("Test is Passed");
    driver.close();

	}

}
