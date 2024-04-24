package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMenthodPract {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		Thread.sleep(1500);
//		WebElement ele = driver.findElement(By.className("menulink"));
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(ele).build().perform();
//		Thread.sleep(1500);
//		
//		driver.findElement(By.linkText("COURSES")).click();
		driver.get("https://www.bigbasket.com/");
		
//		WebElement eleOne = driver.findElement(By.xpath("(//span[text()='Shop by'])[2]"));
//		eleOne.click();
//		Thread.sleep(1500);
//		
//		Actions act = new Actions(driver);
//		
//		WebElement eletwo = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(eletwo).build().perform();
//		Thread.sleep(1500);
//		WebElement elethree = driver.findElement(By.linkText("Tea"));
//		act.moveToElement(elethree).build().perform();
//		Thread.sleep(1500);
//		WebElement elefour = driver.findElement(By.linkText("Green Tea"));
//		
//		elefour.click();

		By eleOne = By.xpath("(//span[text()='Shop by'])[2]");
		By eletwo = By.linkText("Beverages");
		By elethree = By.linkText("Tea");
		By elefour = By.linkText("Green Tea");
		getMoveToElement(eleOne, eletwo, elethree, elefour);
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void getMoveToElement(By eleOne, By eletwo, By elethree, By elefour) throws InterruptedException {
		getElement(eleOne).click();
		Thread.sleep(1500);
		Actions act = new Actions(driver);
		act.moveToElement(getElement(eletwo)).build().perform();
		Thread.sleep(1500);
		act.moveToElement(getElement(elethree)).build().perform();
		Thread.sleep(1500);
		getElement(elefour).click();
	}
	
	

}
