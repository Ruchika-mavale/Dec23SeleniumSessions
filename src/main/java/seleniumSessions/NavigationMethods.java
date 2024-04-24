package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		// back and forward
		// get vs to
		// refresh

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart");

		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.google.com/");

		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());

		driver.navigate().forward();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());

		driver.navigate().refresh();

	}

}
