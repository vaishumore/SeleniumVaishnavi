package testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import automation.LoginpagePOMclass;

public class P7 {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test(priority = 1)
	public void openpage() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test(invocationCount = 5, priority = 2)
	public void loginpage() throws EncryptedDocumentException,IOException {
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
	}

	@Test(priority = 3)
	public void closepage() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
