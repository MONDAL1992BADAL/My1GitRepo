package TestNG.TestNG;
import org.testng.annotations.*;
public class TestCase1 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	public void test1() {
		System.out.println("This is test1..");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@Test
	public void test2() {
		System.out.println("This is test2..");
	}
}
