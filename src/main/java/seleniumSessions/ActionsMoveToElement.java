package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		//driver.get("https://www.bigbasket.com/");
		
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
		
		By menu = By.className("menulink");
		By subMenu = By.linkText("COURSES");
		
		handaleMenuAndSubMenu(menu, subMenu);
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void handaleMenuAndSubMenu(By menuLocator, By subMenuLocator) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(menuLocator)).build().perform();
		Thread.sleep(3000);
		
		getElement(subMenuLocator).click();
		
		
		
	}

}
