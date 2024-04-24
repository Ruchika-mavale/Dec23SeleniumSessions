package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Actions act = new Actions(driver);
		
		
		//selenium 4.x updated
//		act.sendKeys(Keys.END).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.HOME).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.END).build().perform();
		
		//*************
		
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		//***********
		
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_UP).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//************
		
		Thread.sleep(3000);
		act.scrollToElement(driver.findElement(By.xpath("//a[normalize-space()='Careers']"))).
						click(driver.findElement(By.xpath("//a[normalize-space()='Careers']"))).build().perform();
		
		
		
		

	}

}
