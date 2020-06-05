package Ttests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrowsercompatibilityTestNG {
	
	@Test
	public void firefox_check(){
		// Load drivers
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
		
	}
	
	@Test
	public void chrome_check(){
		// Load drivers
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver g = new ChromeDriver();
		g.get("http://google.com");
		
	}
	
	@Test
	public void ie_check(){
		// Load drivers
		System.setProperty("webdriver.ie.driver","H:\\Selenium\\drivers\\iedriver_win64\\IEDriverServer.exe");
		InternetExplorerDriver h = new InternetExplorerDriver();
		h.get("http://google.com");
		
	}
	
	

}
