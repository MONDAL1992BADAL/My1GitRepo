package TestNG.TestNG;
import org.testng.annotations.*;
public class CurrentAcTestClass2 {
	
		@Test(enabled=false)
		public void test1() {
			System.out.println("Current a/c testcase1");
		}

		@Test
		public void test2() {
			System.out.println("Current a/c testcase2");
		}
	

}
