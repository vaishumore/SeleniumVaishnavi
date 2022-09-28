package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the broswer and go the cleartrip.com
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		// go to the from text field and type the 'Ban'
		driver.findElement(By.xpath("(//input)[@placeholder='Any worldwide city or airport'][1]")).sendKeys("Ban");
		Thread.sleep(4000);
		// print the counts of all the auto suggestions
		List<WebElement> AutoSuggestions = driver.findElements(By.xpath("//p[contains(.,'Ban')]"));
		System.out.println("Total no of suggestions :" + AutoSuggestions.size());
		// print every Auto suggestion
		for (int i = 0; i < AutoSuggestions.size(); i++) {
			System.out.println(AutoSuggestions.get(i).getText());
		}
		// close the broswer
		driver.close();
	}

}