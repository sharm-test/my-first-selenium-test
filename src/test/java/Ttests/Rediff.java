package Ttests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff {
	
	public  static void main(String args[]) {
	System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://portfolio.rediff.com/portfolio-login");
	driver.findElement(By.name("email-id")).sendKeys("hello@gmail.com");
	driver.findElement(By.name("emailsubmit")).click();
	driver.findElement(By.id("userpass")).sendKeys("hello");
}
}
