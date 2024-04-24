package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultilevelMenu {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By level1menu = By.xpath("(//span[text()='Shop by'])[2]");
		By level2menu = By.linkText("Beverages");
		By level3menu = By.linkText("Tea");
		By level4menu = By.linkText("Green Tea");
		handleMenuSubMenuleval4(level1menu, level2menu, level3menu, level4menu);
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void handleMenuSubMenuleval4(By leval1menu,By leval2menu, By leval3menu, By leval4menu) throws InterruptedException {
		getElement(leval1menu).click();
		Thread.sleep(1500);
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(leval2menu)).build().perform();
		Thread.sleep(1500);
		act.moveToElement(getElement(leval3menu)).build().perform();
		Thread.sleep(1500);
		getElement(leval4menu).click();
		
		
		
	}
	

}
