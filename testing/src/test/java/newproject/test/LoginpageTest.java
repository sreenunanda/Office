package newproject.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginpageTest extends browser {

@Test
	public void logintest() {

/*	System.setProperty("webdriver.chrome.driver", "../test/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();*/
	
//	driver.get("https://www.facebook.com/login/");
		LoginpageData page = new LoginpageData(driver);
		page.logintest1();

	}
}
