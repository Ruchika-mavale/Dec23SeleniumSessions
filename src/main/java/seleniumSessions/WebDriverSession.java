package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.close();// browser is closed
		// session is invalid with the same id: //NoSuchSessionException: invalid
		// session id
		// sid=123--invalid

		// driver.quit();//browser is closed: 123
		// NoSuchSessionException: Session ID is null. Using webDriver after calling
		// quit()?
		// s.id=null
		driver = new ChromeDriver();// open browser: new session id = 456
		driver.get("https://www.google.com");// enter url: 456
		System.out.println(driver.getTitle()); // 456
		// ChromeDriver: chrome on mac (null)

	}

}
