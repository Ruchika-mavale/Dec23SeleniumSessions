package testngsesstions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@BeforeTest
	public void createUser() {
		System.out.println("user created");
	}
	
	@Test(invocationCount = 10, priority = 2)
	public void createUserTest() {
		System.out.println("create User Test");
		
	}
	
	@Test(priority = 1)
	public void paymentTest() {
		System.out.println("pyment Test");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("user deleted");
	}

}
