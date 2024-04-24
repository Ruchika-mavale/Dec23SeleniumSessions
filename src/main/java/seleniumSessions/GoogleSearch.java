package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
//		driver.findElement(By.name("q")).sendKeys("selenium");
//		Thread.sleep(3000);
//		List<WebElement> searchList = driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d' and @role='presentation']//span"));
//		for(WebElement e : searchList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(e.getText().contains("selenium ide")) {
//				e.click();
//				break;
//			}
//			
//		}
		By searchFeaild = By.name("q");
		By suggections = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d' and @role='presentation']//span");
		doSearch(searchFeaild, suggections, "selenium", "selenium ide");

		

	}
	
	public static void doSearch(By searchlocator, By surchSuggection, String searchKey, String value ) throws InterruptedException   {
		driver.findElement(searchlocator).sendKeys(searchKey);
		Thread.sleep(3000);
		List<WebElement> searchList = driver.findElements(surchSuggection);
		for(WebElement e : searchList) {
			String text = e.getText();
			System.out.println(text);
			if(e.getText().contains(value)) {
				e.click();
				break;
			}
			
		}
		

		
		
	}

}
