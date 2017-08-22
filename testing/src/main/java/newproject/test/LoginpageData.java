package newproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageData {

	public LoginpageData(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email]")
	WebElement sendemail;
	@FindBy(id = "pass")
	WebElement password;
	@FindBy(id = "loginbutton")
	WebElement login;

	public WebElement enteremail() {
		return sendemail;

	}

	public WebElement enterpassword() {
		return password;

	}

	public WebElement clicklogin() {
		return login;

	}

	public void logintest1() {
		sendemail.sendKeys("user1");
		password.sendKeys("pass1");
		login.click();
	}
}
