package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///D:/Vaishnavi/n.html");
	 WebElement oblistbox = driver.findElement(By.id("ob"));
	 Select s1 = new Select(oblistbox);
	 s1.selectByIndex(2);//Chocolate Milkshekh
	 Thread.sleep(2000);
	 s1.selectByValue("bs");//Butter scotch
	 Thread.sleep(2000);
	 s1.selectByVisibleText("Lemon shikanji");
	 Thread.sleep(2000);
	// s1.deselectByIndex(0);//UnsupportedOperationException
	 System.out.println("get wrapped element:"+s1.getWrappedElement());
	 System.out.println("is multiple:"+s1.isMultiple());
	 Thread.sleep(2000);
	 driver.close();
	 

	}

}
