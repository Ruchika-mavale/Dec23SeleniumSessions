package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoWebTable {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/zimbabwe-domestic-twenty20-2023-24-1422046/mountaineers-vs-southern-rocks-5th-match-1422054/full-scorecard");
		
		//String xpath = "//a[@title='Tony Munyonga']/span/ancestor::td/following-sibling::td[text()='c Campbell b Mashinge']";
		
		//getwktTakerName("Donald Tiripano");
		ArrayList<String> list = getScoarCard("Salman Mirza");
		System.out.println(list);
		

	}
	
//	public static void getwktTakerName(String name) {
//		String xpath = "//span[text()='"+name+"']/ancestor::td/following-sibling::td[@class = 'ds-min-w-max !ds-pl-[100px]']";
//
//		String wktTakerName = driver.findElement(By.xpath(xpath)).getText();
//		
		//ArrayList<String> list = getScoarCard("");
		

//	}
	
	public static ArrayList<String> getScoarCard(String name) {
		String xpath ="//span[text()='"+name+"']/ancestor::td/following-sibling::td[contains(@class , 'ds-w-0 ds-whitespace-nowrap ds-min-w-max ds-text-right')]";
		
		List<WebElement> listContent = driver.findElements(By.xpath(xpath));
		ArrayList<String> listElement = new ArrayList<String>();
		
		
		for(WebElement e : listContent) {
			String getInfoText = e.getText();
			listElement.add(getInfoText);
			
		}
		return listElement;
		
	}
	

}
