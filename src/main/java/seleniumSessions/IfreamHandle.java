package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfreamHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("//div[@id = 'imageTemplateContainer']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')] ")));
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Ruchika");
	}

}
