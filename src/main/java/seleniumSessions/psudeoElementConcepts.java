package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class psudeoElementConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		String script =  "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content');";
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mand_text = js.executeScript(script).toString();
		System.out.println(mand_text);
		
		
		

	}

}

