package Ttests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		Set<String> winIDs = driver.getWindowHandles();
		System.out.println("Total windows------>"+winIDs.size()); //number of windows
		
		//Extract window ID and print
		Iterator<String> it = winIDs.iterator();
		
	//while(it.hasNext()){
		System.out.println(it.next());
		
		driver.get("http://naukri.com");
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		winIDs = driver.getWindowHandles();
		System.out.println("Total windows in naukri------>"+winIDs.size()); 
		
		it = winIDs.iterator();
		String First = it.next();
		String FirstPopup = it.next();
		
		System.out.println(First);
		System.out.println(FirstPopup);
		
		driver.switchTo().window(FirstPopup);
		driver.close();
		driver.switchTo().window(First);
		driver.close();
	//}
		

	}

}
