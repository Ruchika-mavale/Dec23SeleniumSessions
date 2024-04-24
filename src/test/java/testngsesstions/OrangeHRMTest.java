package testngsesstions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void titleTest() {
		//driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Book Your Free Demo | OrangeHRM", "titale is not match");
	}
	
	
	
	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm"), "url is not correct");
	}
	
	
}
