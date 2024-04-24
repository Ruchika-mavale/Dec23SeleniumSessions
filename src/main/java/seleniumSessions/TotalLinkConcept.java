package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total Number of links" + " " + allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {
			String linkText = allLinks.get(i).getText();
			// System.out.println(linkText);
			if (linkText.length() != 0) {
				System.out.println(linkText);
			}

		}

		System.out.println("========");

		for (WebElement e : allLinks) {
			String text = e.getText();
			// System.out.println(text);
			if (text.length() != 0) {
				System.out.println(text);
			}
		}
		
		System.out.println("=======");
		
		//total number of text fields
		List<WebElement> allTextfields = driver.findElements(By.className("form-control"));
		System.out.println("total text fields"+ " " + allTextfields.size());
		
	}

}
