package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandals {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		String parentWindow = itr.next();
		System.out.println("parent Window id = "+ parentWindow);
		
		String ChildWindow = itr.next();
		System.out.println("Child Window id = "+ ChildWindow);
		
		//switchto
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
		
		
		
		

	}

}
