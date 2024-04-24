package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormByClass {
	
	public static String getRandomEmail() {
		return "ruchikaScript"+System.currentTimeMillis()+"@text.com";
		
	}

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("Chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By Fname = By.id("input-firstname");
		By lanme = By.name("lastname");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By phn = By.cssSelector("#input-telephone");
		By pass = By.id("input-password");
		By confPass = By.id("input-confirm");
		
		By radioYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By radioNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		
		By checkYes = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		
		By submitCTA = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By tagName = By.tagName("h1");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(Fname, "RuchikaText");
		eleUtil.doSendKeys(lanme, "TextLname");
		eleUtil.doSendKeys(email, getRandomEmail());
		eleUtil.doSendKeys(phn, "7868888888");
		eleUtil.doSendKeys(pass, "ruchi123");
		eleUtil.doSendKeys(confPass, "ruchi123");
		eleUtil.doElementClick(radioYes);
		eleUtil.doElementClick(checkYes);
		eleUtil.doElementClick(submitCTA);
		String textverify = eleUtil.doGetElementText(tagName);
		if(textverify.equals("Your Account Has Been Created!")) {
			System.out.println("Text pass");
		}else {
			System.out.println("Text fail");
		}
		
		
		
		
		
		
		
		

	}

}
