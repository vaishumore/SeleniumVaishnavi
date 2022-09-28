package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
			throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		LoginpagePOMclass l1 = new LoginpagePOMclass(driver);
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for (int i = 0; i <= 5; i++) {
			
			String un = wb.getSheet("sheet1").getRow(i).getCell(0).toString();
			l1.setusername(un);
			String pw = wb.getSheet("sheet1").getRow(i).getCell(1).toString();
			l1.setpassword(pw);
			l1.clicklogin();
		}

		Thread.sleep(6000);
		driver.close();

	}

}
