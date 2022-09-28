package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Mauali");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("more");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9834882241");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Shiva@20");
		Thread.sleep(2000);
		WebElement daylb = driver.findElement(By.id("day"));
		Select s1 = new Select(daylb);
		s1.selectByValue("25");
		Thread.sleep(2000);
		WebElement monthlb = driver.findElement(By.id("month"));
		Select s2 = new Select(monthlb);
		s2.selectByVisibleText("Sep");
		Thread.sleep(2000);
		WebElement yearlb = driver.findElement(By.id("year"));
		Select s3 = new Select(yearlb);
		s3.selectByVisibleText("2001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Sign Up'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
