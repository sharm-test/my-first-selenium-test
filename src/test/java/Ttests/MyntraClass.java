package Ttests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyntraClass {
	WebDriver driver;
	
	@BeforeClass
	public void init()
	{
		
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test
	public void a_openmyntra(){
	
	driver.get("http://www.myntra.com");
	System.out.println("*************************Site Opened**********************");
	
}
	@Test
	public void b_clickonProfile() {
		
		WebElement ele = driver. findElement(By. xpath("//span[@class='desktop-userTitle']"));
		System. out. println(ele. getText());
		List <WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println("******************Links*************"+links);
		String text = driver.findElement(By.xpath("//span[@class='desktop-userTitle']")).getText();
		System.out.println(text);
				
		
	}
}
