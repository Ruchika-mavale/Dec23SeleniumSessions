package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTestMethod {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().frame("leftpanel");
		
		//a[text()='Joe Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//Joe Root
		//selectContent("Joe Root");
		//String cName = getCompanyName("Joe Root");
		//System.out.println(cName);
		//String phnNumber = getPhoneNumber("Joe Root");
		//System.out.println(phnNumber);
		ArrayList<String> infoList = getcontactInfoList("KL Rahul");
		System.out.println(infoList);
		ArrayList<String> OptionsList = getOptions("KL Rahul");
		System.out.println(OptionsList);
		
		
		
		

	}
	public static void selectContent(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();	
	}
	
	public static String getCompanyName(String name) {
		String companyXpath = "//a[text()='"+name+"']/parent::td/following-sibling::td/child::a[@context='company']";
		String companyName = driver.findElement(By.xpath(companyXpath)).getText();
		return companyName;
		
	}
	public static String getPhoneNumber(String name) {
		String phoneXpath ="//a[text()='"+name+"']/parent::td/following-sibling::td//span[@context='phone']";
		String number = driver.findElement(By.xpath(phoneXpath)).getText();
		return number;
		
	}
	public static ArrayList<String> getOptions(String name) {
		String optXpath = "//a[text()='"+name+"']/parent::td/following-sibling::td//child::i[@class]";
		List<WebElement> options =  driver.findElements(By.xpath(optXpath));
		ArrayList<String> allOptions = new ArrayList<String>();
		
		for(WebElement e : options) {
			String getOptions = e.getAttribute("class");
			allOptions.add(getOptions);
		}
		return allOptions;
		
		
	}
	public static ArrayList<String> getcontactInfoList(String name) {
		String listXpath ="//a[text()='"+name+"']/parent::td/following-sibling::td";
		List<WebElement> list =  driver.findElements(By.xpath(listXpath));
		ArrayList<String> arrayList  = new ArrayList<String>();
		
		
		for(WebElement e : list) {
			String text = e.getText();
			arrayList.add(text);
		}
		return arrayList;
		
		
	}
	

}
