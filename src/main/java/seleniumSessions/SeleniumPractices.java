package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPractices {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		String title = driver.getTitle();

		System.out.println(title);

		if (title.equals("Google")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("test fail");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.contains("google")) {
			System.out.println("get current url test pass");
		} else {
			System.out.println("get current url test fail");
		}

	}

}
