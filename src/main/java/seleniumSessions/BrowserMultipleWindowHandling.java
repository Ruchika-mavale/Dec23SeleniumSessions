package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String prarentWindow = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'youtube')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) {
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			if(!childWindow.equals(prarentWindow)) {
				driver.close();
			}
			//driver.close();
			//Thread.sleep(1000);
		}
		
		driver.switchTo().window(prarentWindow);
		System.out.println(driver.getTitle());
		
		

	}

}
