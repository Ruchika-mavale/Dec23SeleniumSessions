package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggableEle = driver.findElement(By.id("draggable"));
		WebElement droppableEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		Action actPerform = act.clickAndHold(draggableEle).moveToElement(droppableEle).release().build();
		actPerform.perform();
		
		//act.dragAndDrop(draggableEle, droppableEle).build().perform();

		

	}

}
