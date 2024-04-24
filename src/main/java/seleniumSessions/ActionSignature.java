package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSignature {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://signaturegenerator.com/draw");
		
		WebElement canvas = driver.findElement(By.xpath("//canvas[@class = 'canvas__inner']"));
		
		Actions act = new Actions(driver);
		
//		Action signatureLine = act.click(canvas)
//				.moveToElement(canvas, 30, 40)
//				.clickAndHold(canvas)
//				.moveToElement(canvas, -200, -50)
//				.moveByOffset(50, -50)
//				.moveByOffset(50, -50)
//				.moveByOffset(3, 3)
//				.release(canvas)
//				.build();
		
		Action signatureLine = act.click(canvas).moveToElement(canvas, 30, 40)
				.clickAndHold(canvas).moveToElement(canvas,-200, -50)
				.moveByOffset(50, -50).moveByOffset(50, -50).moveByOffset(3, 3).release(canvas).build();
		
		signatureLine.perform();

	}

}
