package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightContextClick {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement clickableEle = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(clickableEle).build().perform();
		
//		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		List<WebElement> list = driver.findElements(By.cssSelector("ul.context-menu-list > li:not(.context-menu-separator)"));
		
		for(WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Delete")) {
				e.click();
				break;
			}
		}
		

	}

}
