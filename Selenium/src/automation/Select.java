package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
	
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.name("username")).sendKeys("123");
	   driver.close();  
	   
		
	 
		
		
		
		
	 
		
		
		
		
		
		

	}

}
