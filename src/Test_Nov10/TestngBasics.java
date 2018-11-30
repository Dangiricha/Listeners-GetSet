package Test_Nov10;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestngBasics {
	
	@Test(priority=1)
	public void TestMethod1(){
		System.out.println("inside Testmethod1");
	}
	@Test(priority=2)
	public void TestMethod2(){
		System.out.println("inside Testmethod2");
		//Assert.fail();
	}
	@Test(priority=3)
	public void TestMethod3(){
		System.out.println("inside Testmethod3");
	}

	
}
