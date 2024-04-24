package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfreameHandals {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("main");
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		

	}

}
