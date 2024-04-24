package seleniumSessions;

public class TopCastingConcepts {

	public static void main(String[] args) {
		// 1. WD d = new CD();
		// valid
		// WebDriver driver = new ChromeDriver();

		// 2. SC driver = new CD();
		// Valid but not recommended
		// SearchContext driver = new ChromeDriver();

		// 3. RWD driver = new CD();
		// valid
		// RemoteWebDriver driver = new ChromeDriver();

		// 4. CD driver = new CD();
		// valid but not recommended
		// ChromeDriver driver = new ChromeDriver();

		// 5. WD driver = new RWD
		// valid Recommended
		// WebDriver driver = new RemoteWebDriver(serverURL, Capability);

	}

}
