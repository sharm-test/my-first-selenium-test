package Ttests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	 public WebDriver driver;
	 
	 public WebDriver Superclass(){
		 System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 return driver;
	 }
	 
}
