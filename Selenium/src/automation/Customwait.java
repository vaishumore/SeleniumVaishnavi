package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customwait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	int i = 1;
	while(true) {
		try {
			    driver.findElement(By.id("logoutLink")).click();
			    break;
		}
		catch (Exception e) {
			System.out.println("trying for"+(i++)+"th"+"time");
		}
		
	}
	driver.close();
	}
}
	

	


