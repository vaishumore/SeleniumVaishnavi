package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sql {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the broswer
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    // type sql in the search box
	    driver.findElement(By.name("q")).sendKeys("sql");
	    Thread.sleep(4000);
	    // count autosuggestions
List<WebElement>Allauto =driver.findElements(By.xpath("//span[contains(.,'sql')]"));
 System.out.println("Total Autosuggestion:"+Allauto.size());
 // print all auto suggestions
 for(int i=0;i<Allauto.size();i++) {
	 System.out.println(Allauto.get(i).getText());
 }
    // close the driver
      driver.close();
		
	}

}
