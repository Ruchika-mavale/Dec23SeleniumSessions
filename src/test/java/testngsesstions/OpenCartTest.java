package testngsesstions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	//before annotations:
	@BeforeSuite
	public void dbConnection() {
		System.out.println("before suite : db Connection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("before test : crete user");
		
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("before class : launch browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("before method : login");
	}
	
	@Test
	public void titleTest() {
		System.out.println("tithe Test");
	}
	
	@Test
	public void headerTest() {
		System.out.println("header test");
	}
	
	@Test
	public void urlTest() {
		System.out.println("url Test");
	}
	
	//After annotations
	@AfterMethod
	public void logOut() {
		System.out.println("After method: logout test");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class : close browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("After Test : delete user");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("After suite : disconnect db");
	}

}
