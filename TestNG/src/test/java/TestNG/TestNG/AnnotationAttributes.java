package TestNG.TestNG;

import org.testng.annotations.*;

public class AnnotationAttributes {
	
	//@Test(description="This is first")
	@Test(timeOut=200)
	public void testCase1() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Mobile Login TestCase");
	}
    @Test(description="This is testcase2")
	public void testCase2() {
		System.out.println("Web Login TestCase");
	}

    @Test(description="This is testcase3")
   	public void testCase3() {
   		System.out.println("Api Login TestCase");
}
}
