package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignOne {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");
		// driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Your Store")) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.contains("naveenautomationlabs")) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
		//driver.close();

	}

}
