package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println("page tital is " + " " + title);

		// Checkpoint

		if (title.equals("Google")) {
			System.out.println("Correct title   Test pass");
		} else {
			System.out.println("incorrect title  Test fail");
		}

		String url = driver.getCurrentUrl();

		System.out.println(url);

		if (url.contains("google.com")) {
			System.out.println("url is pass");
		} else {
			System.out.println("url is not pass");
		}

		// close the browser
		// driver.close();

	}

}
