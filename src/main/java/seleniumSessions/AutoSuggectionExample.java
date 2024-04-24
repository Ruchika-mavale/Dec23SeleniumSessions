package seleniumSessions;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggectionExample {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		WebElement searchFeild = driver.findElement(By.xpath("//textarea[@name = 'q']"));
//		searchFeild.sendKeys("selenium");
//		Thread.sleep(4000);
//		List<WebElement> suggectionList = driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[contains(@class, 'wM6W7d')]/span"));
//
//		//List<WebElement> suggectionList = driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class ='wM6W7d' and @role='presentation']/span"));
//		for(WebElement e: suggectionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("dev")) {
//				e.click();
//				break;
//			}
//		}
		
		By searchfeaild = By.xpath("//textarea[@name = 'q']");
		//By searchList1 = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[contains(@class,'wM6W7d')]/span");
		By searchList = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class ='wM6W7d' and @role='presentation']/span");
		//searchListMenu(searchfeaild, searchList, "selenium", "dev");
		//Thread.sleep(4000);
		ArrayList<String> printList = pringSearchValue(searchfeaild, searchList, "selenium");
		System.out.println(printList);

	}
	public static void searchListMenu(By search, By searchListvalue, String fieldValue, String text ) throws InterruptedException {
		driver.findElement(search).sendKeys(fieldValue);
		
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(searchListvalue);
		
		for(WebElement e:list) {
			String listValue = e.getText();
			if(listValue.contains(text)) {
				e.click();
				break;
			}
			
		}
		
			
	}
	
	public static ArrayList<String> pringSearchValue(By search, By searchListvalue, String fieldValue) throws InterruptedException {
		driver.findElement(search).sendKeys(fieldValue);
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(searchListvalue);
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for(WebElement e : list) {
			String text = e.getText();
			arrayList.add(text);
		}
		return arrayList;
		
		
	}
	

}
