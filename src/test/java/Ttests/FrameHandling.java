package Ttests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
		Thread.sleep(2000);
		//WebElement element = driver.findElement(By.linkText("This is a link"));
		//element.click();
		//driver.switchTo().frame("iframeResult");
		//System.out.println("hello");
	    //WebElement element = driver.findElement(By.linkText("This is a link"));
		//element.click();
		
		int totalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrames);
		
		for(int i=0;i<totalFrames;i++) {
		 driver.switchTo().frame(i);
			int s = driver.findElements(By.linkText("This is a link")).size();
			System.out.println("Size-->"+s);
		if(s==0)
			driver.switchTo().defaultContent();
		else
			break;
		}
		
		
		WebElement e = driver.findElement(By.linkText("This is a link"));
		e.click();
			
		}
		
		
		

	}

