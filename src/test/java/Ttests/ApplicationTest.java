package Ttests;

import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	@Test
	public void login() {
		System.out.println("Login Test");
	}
	@Test(dependsOnMethods={"login"})
	public void hello(){
		System.out.println("Hello Test");
	}
	
	@Test
	public void register() {
		throw new SkipException("Skipped test");
		
	}
	
	@BeforeTest
	public void Before() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void After() {
		System.out.println("after test");
	}
	@BeforeMethod
	public void call_method() {
		System.out.println("Before method");
	}

}
