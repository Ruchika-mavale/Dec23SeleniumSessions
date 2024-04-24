package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(colCount-1);
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
		System.out.println(rowCount);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i = 1 ; i<=colCount ; i++) {
			String fullXpath = beforeXpath + i + afterXpath;
			List<WebElement> list = driver.findElements(By.xpath(fullXpath));
			for(WebElement e : list) {
				String listText = e.getText();
				System.out.println(listText);
			}
		}
		
		System.out.println("********+++++++*********");
		System.out.println("********+++++++*********");
		
		//WebElement rowContent = driver.findElement(By.xpath("(//th[text()='Company']/parent::tr/following-sibling::tr)[1]"));
		
		List<WebElement> AllContent = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td"));
		
		for(WebElement ele : AllContent) {
			String textEle = ele.getText();
			System.out.println(textEle);
			
		}
		System.out.println("********+++++++*********");
		System.out.println("********+++++++*********");
		
		//th[text()='Company']/parent::tr/following-sibling::tr/td[1]
		
		for(int col=1 ; col<=colCount ; col++) {
			List<WebElement> data = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td["+col+"]"));
			for(WebElement el : data) {
				String featchData = el.getText();
				System.out.println(featchData);
			}
		}
		
		

	}

}
