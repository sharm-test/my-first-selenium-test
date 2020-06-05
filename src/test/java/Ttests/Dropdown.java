package Ttests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("remi");
		driver.findElement(By.name("password")).sendKeys("remi");
		driver.findElement(By.name("login")).click();
		WebElement dropdown = driver.findElement(By.name("fromPort"));
		Select s = new Select(dropdown);
		
		s.selectByIndex(1);
		//s.selectByVisibleText("Paris");
		s.selectByValue("London");
		List<WebElement> countoptions =  s.getOptions();
		System.out.println(countoptions.size());
		for(WebElement e:countoptions ){
			System.out.println(e.getText());
		}
		
		System.out.println("Selected city->"+s.getFirstSelectedOption().getText());
		
		
		// TODO Auto-generated method stub

	}

}
