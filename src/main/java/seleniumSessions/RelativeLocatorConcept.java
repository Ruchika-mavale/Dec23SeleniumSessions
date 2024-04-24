package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.linkText("Prince George, Canada"));
		
		
		//driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		String leftele = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftele);
		
		String rightele = driver.findElement(with(By.linkText("p")).toRightOf(ele)).getText();
		System.out.println(rightele);
		
		String aboveele = driver.findElement(with(By.linkText("p")).above(ele)).getText();
		System.out.println(aboveele);
		
		String belowele = driver.findElement(with(By.linkText("p")).below(ele)).getText();
		System.out.println(belowele);
		
		
		
		
		

	}

}
