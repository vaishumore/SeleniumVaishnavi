package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("vamore100@gmail.com");
       Thread.sleep(4000);
       driver.findElement(By.xpath("//span[.='Next']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[.='Try again']")).click();
       Thread.sleep(3000);
       driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
