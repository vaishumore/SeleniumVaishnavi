package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePOMclass {

	@FindBy(name = "username")
	private WebElement untb;
	@FindBy(name = "pwd")
	private WebElement pwtb;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginbtn;

	 public LoginpagePOMclass(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setusername(String un) {

		untb.sendKeys(un);
	}

	public void setpassword(String pw) {
		pwtb.sendKeys(pw);

	}

	public void clicklogin() {
		loginbtn.click();

	}

}
