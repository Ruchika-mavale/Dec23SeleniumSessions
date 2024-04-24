package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchCrawl {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By searchText = By.name("q");
		//By stagingLinks = By.xpath("//div[@class= 'notranslate HGLrXd NJjxre iUh30 ojE3Fb']//div[@class='byrV5b']/cite");
		By stagingLinks = By.xpath("//h3[@class ='LC20lb MBeuO DKV0Md']");
		String text = "site:kylas.staging.digital.beyondwalls.com";
		ArrayList<String>resutURLS = searchResult(searchText,stagingLinks,text);
		System.out.println(resutURLS);
		

	}
	public static ArrayList<String> searchResult(By locator, By linkLocator,String value) throws InterruptedException {
		
		WebElement searchBox = driver.findElement(locator);
		searchBox.sendKeys(value);
		Thread.sleep(4000);
		searchBox.submit();
		
		List<WebElement> result = driver.findElements(linkLocator);
		
		
		ArrayList<String> urlList = new ArrayList<String>();
		
		for(WebElement e : result) {
			String totalLinks = e.getText();
			urlList.add(totalLinks);
		}
		return urlList;
		
		
	
		
		
		
		
	}

}
