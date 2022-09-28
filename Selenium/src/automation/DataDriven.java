package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
			throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String path = "./data/Book.Xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String un = wb.getSheet("sheet1").getRow(3).getCell(0).toString();
		String pw = wb.getSheet("sheet1").getRow(3).getCell(1).toString();
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
