package newproject.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class niteesh {
	public static WebDriver driver;

/*public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreenu\\workspace\\testing\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Krishna");
	  driver.findElement(By.id("u_0_4")).sendKeys("Hari");
	  driver.findElement(By.id("u_0_7")).sendKeys("9876433478");
	  driver.findElement(By.id("u_0_e")).sendKeys("radhaji");
	  Select sel =new Select(driver.findElement(By.id("day")));
	  sel.selectByVisibleText("17");
	  Select sel1 = new Select(driver.findElement(By.id("month")));
	  sel1.selectByIndex(11);
	  Select sel2 = new Select(driver.findElement(By.id("year")));
	  sel2.selectByValue("2016");
 driver.findElement(By.xpath(".//*[@id='u_0_h']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='u_0_h']")).isSelected());
	
	  driver.findElement(By.id("u_0_m")).click();
}*/
/*public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreenu\\workspace\\testing\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	 driver.get("https://book2.spicejet.com/");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Student']")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Student']")).isSelected());

}*/
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreenu\\workspace\\testing\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	 driver.get("http://irctc.co.in");
	  driver.findElement(By.xpath("//font[contains(text(),'IRCTC Tourism ')]"));
	  Set<String> set = driver.getWindowHandles();
	  Iterator<String> it = set.iterator();
	  String parentwindowID = it.next();
	  String ChildwindowID = it.next();

	  driver.switchTo().window(ChildwindowID);
	  System.out.println(driver.getTitle());
}
}
