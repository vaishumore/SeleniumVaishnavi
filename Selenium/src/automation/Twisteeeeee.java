package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twisteeeeee {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		Thread.sleep(3000);
		String t1 = driver.getTitle();
		System.out.println(t1);
		driver.switchTo().activeElement().sendKeys("Mauali");
		Thread.sleep(2000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://www.fb.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mu");
		List<WebElement> allAutoSuggs = driver.findElements(By.xpath("//p[contains(.,'Mu')]"));
		System.out.println("allAutoSuggestions"+allAutoSuggs);
		for(int i =0; i<allAutoSuggs.size();i++)
		{
			System.out.println(allAutoSuggs.get(i).getText());
		}
		Thread.sleep(2000);
		driver.close();

	}

}
