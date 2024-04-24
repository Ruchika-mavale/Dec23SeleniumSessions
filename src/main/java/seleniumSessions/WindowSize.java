package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
		
//		Dimension dim = new Dimension(400, 800);
//		
//		driver.manage().window().setSize(dim);
		
		WebElement ele = driver.findElement(By.name("email"));
		
		int height = ele.getSize().getHeight();
		int width =ele.getSize().getWidth();
		
		System.out.println(height);
		System.out.println(width);
		
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		
		System.out.println(x);
		System.out.println(y);
		
		//button[text()='Checkout here']
		WebElement btn = driver.findElement(By.xpath("//button[text()='Checkout here']"));
		
		String btnClr = btn.getCssValue("background-color");
		System.out.println(btnClr);
		
		
		
		
		

	}

}
