package newproject.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


 public class screenshot {
 public static void getscreenshot(String filename, WebDriver driver)
	{
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./screenshots/"+filename+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}	

}