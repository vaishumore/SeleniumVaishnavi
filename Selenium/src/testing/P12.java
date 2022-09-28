package testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P12 {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@BeforeMethod
	public void Openpage() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public void testGoogle() {
		String expectedTitle = "Mozila";
		driver.get("http://www.google.com");
		String actualTitle = driver.getTitle();
		Reporter.log("Expected title:" + expectedTitle, true);
		Reporter.log("Actual title:" + actualTitle, true);
//		if(expectedTitle.equals(actualTitle)) {
//			Reporter.log("test is passed",true);
//		}
//		else {
//			Reporter.log("test is failed",true);
//			Assert.fail();
//		}
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterMethod
	public void closeApp() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./images/Google.png");
		FileUtils.copyFile(src, des);
		driver.close();

	}

}
