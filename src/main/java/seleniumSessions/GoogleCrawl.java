package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCrawl {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys("site:kylas.staging.digital.beyondwalls.com");
		 searchBox.submit();
		 
		 Thread.sleep(4000);
		 List<WebElement> searchResults = driver.findElements(By.cssSelector("div.r > a"));
		 ArrayList<String> list = new ArrayList<String>();
		 for (WebElement searchResult : searchResults) {
			 String addList = searchResult.getText();
			 list.add(addList);
				 
		 }
		System.out.println(list);
		
			

	}

}
