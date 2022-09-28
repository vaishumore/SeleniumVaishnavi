package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectTestcase3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login '] ")).click();
		driver.findElement(By.xpath("//a[@class='content tasks'] ")).click();
		driver.findElement(By.xpath("//div[.='Add New'] ")).click();
		driver.findElement(By.xpath("//div[.='+ New Tasks'] ")).click();
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]"));
		driver.findElement(By.xpath("(//div[.='Galaxy Corporation'])[2]")).click();
		driver.findElement(By.id("closeCreateTasksPopupButton")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
