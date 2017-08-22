package newproject.test;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.intl.DateTimeFormat;

public class TrailTest {
	WebDriver driver;
    final Logger log  = LogManager.getLogger(TrailTest.class.getName());
	@Test
	public void setUp() {
		log.info("************");
		System.setProperty("webdriver.gecko.driver", "../test/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		log.info("Access to FireFox Browser ver:50");
		driver.get("http://192.168.0.122:9012/mifare-web/admin/login");
	}

	
	@AfterTest
	public void teardown() {
		driver.quit();

	}
}
