package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTabSequence {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/book-a-free-demo/");
		
		WebElement namefeild = driver.findElement(By.id("Form_getForm_FullName"));
		Actions act = new Actions(driver);
		
		act.sendKeys(namefeild, "Ruchika").pause(200)
		.sendKeys(Keys.TAB)
		.sendKeys("text@text.com").pause(200)
		.sendKeys(Keys.TAB)
		.sendKeys("test").build().perform();
		
		
		

	}

}
