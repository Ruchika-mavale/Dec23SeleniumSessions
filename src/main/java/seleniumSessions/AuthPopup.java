package seleniumSessions;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//use another method because if the user name and password content @ the the above line is not work
		//selenium 4.x introduce below method
		
		//((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, password));
		
		
		String username = "admin";
		String password ="password";
		
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, password));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	

	}

}
