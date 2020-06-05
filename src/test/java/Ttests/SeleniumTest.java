package Ttests;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args){
		System.out.println("Hello to selenium project");
		
		// Load drivers
				System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\geckodriver.exe");
				FirefoxDriver f = new FirefoxDriver();
				f.get("google.com");
				
	}
}
