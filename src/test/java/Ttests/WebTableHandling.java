package Ttests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "MCX";
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		int rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr")).size();
		int cols = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[1]/td")).size();
		
		System.out.println("Rows --->"+rows);
		System.out.println("Columns --->"+cols);
		
		//List<WebElement> names = driver.
				
				//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		
		
		
	}

}
