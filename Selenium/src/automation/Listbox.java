package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vaishnavi/n.html");
		WebElement Tajlb = driver.findElement(By.id("taj"));
		Select s1 = new Select(Tajlb);
		Thread.sleep(2000);
		s1.selectByIndex(0);// Chiken Tandoori
		Thread.sleep(2000);
		s1.selectByValue("bu"); // butter naan
		Thread.sleep(2000);
		s1.selectByVisibleText("Panner Lababdar");// panner lababdar
		Thread.sleep(2000);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByValue("pl");
		Thread.sleep(2000);
		s1.selectByVisibleText("Chiken Lolipop");
		Thread.sleep(2000);
		System.out.println("First selected option:"+s1.getFirstSelectedOption());
		System.out.println("all selected option:");
		List<WebElement> selectedoptions = s1.getAllSelectedOptions();
		for (int i=0;i<selectedoptions.size();i++) {
			System.out.println(selectedoptions.get(i).getText());
		}
		System.out.println("========================================================================");
		s1.deselectByIndex(2);
		Thread.sleep(2000);
		s1.deselectByValue("pl");
		Thread.sleep(2000);
		s1.deselectByVisibleText("Chiken Lolipop");
		s1.deselectAll();
		System.out.println("all options:");
		List<WebElement> alloptions = s1.getOptions();
		for (int i=0;i<alloptions.size(); i++)
		{
			System.out.println(alloptions.get(i).getText());
		}
		System.out.println("get wrapped element:"+s1.getWrappedElement());
		System.out.println("is multiple:"+s1.isMultiple());

		Thread.sleep(2000);
		driver.close();

	}

}
