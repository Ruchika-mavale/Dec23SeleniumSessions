package testngsesstions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest {
	
	WebDriver driver;
	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login", "titale is not match");
	}
	
	@Test(priority = 2)
	public void imgTest() {
		boolean img = driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		Assert.assertTrue(img);
	}
	
	@Test(priority = 3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("opencart"), "url is not correct");
	}
	
	

}
