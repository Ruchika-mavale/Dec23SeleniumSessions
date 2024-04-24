package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		//headless vr headed
				//headless no browser visibility
				
				ChromeOptions co= new ChromeOptions();
				//co.addArguments ("--headless");
				co.addArguments("--incognito");
				WebDriver driver = new ChromeDriver(co);
				driver.get("https://naveenautomationlabs.com/opencart/");
				System.out.println(driver.getTitle());
				//driver.quit();
				

	}

}
