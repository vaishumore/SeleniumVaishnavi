package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLoginpage {

	@FindBy(css = "a[id='login']")
	private WebElement loginbtn;
	@FindBy(name = "username")
	private WebElement untb;
	@FindBy(name = "password")
	private WebElement pwtb;

	VtigerLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicklogin() {

		loginbtn.click();

	}

	public void setusername(String un) {
		untb.sendKeys(un);

	}

	public void setpassword(String pw) {

		pwtb.sendKeys(pw);

	}

}
