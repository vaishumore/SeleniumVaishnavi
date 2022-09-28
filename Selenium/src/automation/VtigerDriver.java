package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerDriver {
	static  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
    VtigerLoginpage l1 = new VtigerLoginpage(driver);
    l1.clicklogin();
    Thread.sleep(2000);
    l1.setusername("");
    Thread.sleep(2000);
    l1.setpassword("123456");
    Thread.sleep(2000);
    driver.close();
    
    
    
    
    
	}

}
