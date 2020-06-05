package ParallelTest;

import org.testng.annotations.Test;


public class ClassB {

	@Test
	public void testB() throws InterruptedException {
		System.out.println("Start Test B");
		Thread.sleep(2000);
	}
}
