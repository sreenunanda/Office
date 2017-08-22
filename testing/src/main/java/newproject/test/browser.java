package newproject.test;

import java.io.FileInputStream;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class browser {
public static WebDriver driver;
@BeforeMethod
	public static void getbrowser() throws Exception
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sreenu\\workspace\\selenium\\config.properties");
		prop.load(fis);
		if(prop.get("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\WalletAdmin\\utilities\\geckodriver.exe");

			 driver = new FirefoxDriver();
		}
		if(prop.get("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\WalletAdmin\\utilities\\chromedriver.exe");

			 driver = new ChromeDriver();  
		}
		else
		{
			System.out.println("browser not found");
		}
		driver.get(prop.getProperty("url"));

	}
}
