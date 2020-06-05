import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCompatibilityTest {

	public static void main(String[] args) {
		// Load drivers
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\drivers\\firefox_win64\\geckodriver.exe");
		FirefoxDriver f = new FirefoxDriver();
		f.get("google.com");
		

	}

}
