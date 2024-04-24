package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert
//		driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']")).click();
//		
//		Alert art = driver.switchTo().alert();
//		String artText = art.getText();
//		System.out.println(artText);
//		
//		art.accept();
		//art.dismiss();
		
		//****************
		//Confirm Click for JS Confirm
		
//		driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']")).click();
//		Alert cmfAlert = driver.switchTo().alert();
//		String cmfText = cmfAlert.getText();
//		System.out.println(cmfText);
//		//cmfAlert.accept();
//		cmfAlert.dismiss();
		
		//****************
		//Prompt
		
		driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']")).click();
		Alert pmtAlert = driver.switchTo().alert();
		pmtAlert.sendKeys("Ruchika");
		pmtAlert.accept();
		
		
		
	}

}
