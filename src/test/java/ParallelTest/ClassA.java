package ParallelTest;

import org.testng.annotations.Test;


public class ClassA {

	@Test
	public void testA() throws InterruptedException {
		System.out.println("Start Test A");
		Thread.sleep(2000);
	}
}
