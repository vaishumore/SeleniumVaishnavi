package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P0122 {

	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}


	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vaishnavi/PR.html");
		Thread.sleep(2000);
		driver.findElement(By.id("un")).sendKeys("ABCD");
		Thread.sleep(2000);
		driver.findElement(By.name("h1")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot Password??? ")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("lg")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("cl")).click();
		Thread.sleep(4000);
		driver.close();
	}

		
}


