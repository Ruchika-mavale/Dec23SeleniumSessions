package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectWithoutSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement selectElement = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(selectElement);
		
//		if(select.isMultiple()) {
//			System.out.println("dropdown is multiselected dropdown");
//		}else {
//			System.out.println("dropdown is not multiselected dropdown");
//		}
		
		if(select.isMultiple()) {
			select.selectByValue("Greater");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByIndex(0);
			select.selectByIndex(2);
		}
		
//		select.deselectByValue("Lesser");
//		select.deselectAll();
		List<WebElement>list = select.getAllSelectedOptions();
		
		for(WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
			
		}
		
		
		

	}

}
