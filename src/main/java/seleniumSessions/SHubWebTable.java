package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']
		//a[text()='John.Smith']/ancestor::tr/td/input[@type='checkbox']
		//Thread.sleep(3000);
		//WebElement eleClick = driver.findElement(By.xpath("//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']"));
		//eleClick.click();
		//John.Smith
		selectUser("John.Smith");
		selectUser("Kevin.Mathews");
		
		ArrayList<String> list = getUserDetails("John.Smith");
		System.out.println(list);
		
		
	}
	
	public static void selectUser(String user) {
		String xpath = "//a[text()='"+user+"']/ancestor::tr//input[@type='checkbox']";

		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public static ArrayList<String> getUserDetails(String userName) {
		String xpath = "//a[text()='"+userName+"']/parent::td/following-sibling::td";
		List<WebElement> allInfo = driver.findElements(By.xpath(xpath));
		ArrayList<String> AllInfoList = new ArrayList<String>();
		
		for(WebElement e : allInfo) {
			String getInfoText = e.getText();
			AllInfoList.add(getInfoText);
			
		}
		return AllInfoList;
	}

}
