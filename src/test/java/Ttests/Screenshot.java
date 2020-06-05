package Ttests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		String imgpath = System.getProperty("user.dir")+"/"+"Screenshots/capture.png";
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(imgpath));	
		
		

	}

}
