package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hiddendiv2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.name("policynumber")).sendKeys("885922413122590");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement monthlb = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s1 = new Select(monthlb);
		s1.selectByValue("3");
		Thread.sleep(2000);
		WebElement yearlb = driver.findElement(By.xpath("(//select)[2]"));
		Select s2 = new Select(yearlb);
		s2.selectByVisibleText("1999");
		Thread.sleep(2000);
		driver.findElement(By.linkText("20")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("2578961241");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Lets Renew']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
