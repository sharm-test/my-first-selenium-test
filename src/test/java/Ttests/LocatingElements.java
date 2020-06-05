package Ttests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://cnn.com");
		
		//List <WebElement> links =  driver.findElements(By.xpath("//a"));
		List <WebElement> links =  driver.findElements(By.tagName("a"));

		//driver.findElement(By.name("userName")).sendKeys("exgty");
		//driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("xpath");
		//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("test");
				
System.out.println(links);
int size = links.size();
System.out.println(size);

for(int i =0;i<links.size();i++){
	System.out.println(links.get(i).getText()+"------------"+links.get(i).isDisplayed());
}
	}

}
