package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("site:kylas.staging.digital.beyondwalls.com");
		searchBox.submit();
		Thread.sleep(4000);
		List<WebElement> result = driver.findElements(By.xpath("//div[@class= 'notranslate HGLrXd NJjxre iUh30 ojE3Fb']//div[@class='byrV5b']/cite"));
		for(WebElement e : result) {
			String text = e.getText();
			System.out.println(text);
		}
		
		

	}

}
