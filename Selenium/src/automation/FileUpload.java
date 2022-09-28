package automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vaishnavi/v.html");
		Thread.sleep(2000);
		File f = new File("./CV/Vaishu More.txt");
		String path = f.getAbsolutePath();
		System.out.println(path);   //(it is not mandatory to print the path)
		driver.findElement(By.id("f1")).sendKeys(path);
		Thread.sleep(2000);
		driver.close();

	}

}
