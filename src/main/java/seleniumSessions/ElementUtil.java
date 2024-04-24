package seleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		
	}
	
	private void nullBlankCheck(String value) {
		if (value == null || value.length() == 0) {
			throw new ElementUtilException("Visible Text can not be NULL");
		}
	}
	
	public By getBy(String locatorType, String locatorValue) {
		
		By locator = null;
		switch(locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssselector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;
		default:
			break;
			
		
		}
		return locator;
	}
	
	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}
	
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}
		catch(NoSuchElementException e) {
			System.out.println("Element is not present on Page");
			e.printStackTrace();
			return null;
		}
		return element;
		
	}
	
	public void doSendKeys(By locator, String value) {
		nullBlankCheck(value);
		getElement(locator).sendKeys(value);
	}
	
	//do send keys with wait
	public void doSendKeys(By locator, String value, int timeOut) {
		nullBlankCheck(value);
		//getElement(locator).sendKeys(value);
		waitForElementVisible(locator , timeOut).sendKeys(value);
	}
	
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}
	
	public void doElementClick(String locatorType, String locatorValue) {
		getElement(locatorType, locatorValue).click();
		
		
	}
	public void doElementClick(By locator) {
		getElement(locator).click();
	}
	
	//do Click with wait
	public void doElementClick(By locator, int timeOut) {
		//getElement(locator).click();
		waitForElementVisible(locator, timeOut).click();
	}
	
	public String doGetElementText(String locatorType, String locatorValue) {
		return getElement(locatorType,locatorValue).getText();
	}
		
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public String doGetAttribute(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}
	
	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public boolean isElementExist(By locator) {
		if (getElements(locator).size() == 1) {
			return true;
		}
		return false;
	}
	
	public boolean multipleElementsExist(By locator) {
		if (getElements(locator).size() > 0) {
			return true;
		}
		return false;
	}
	
	public boolean multipleElementsExist(By locator, int elementCount) {
		if (getElements(locator).size() == elementCount) {
			return true;
		}
		return false;
	}
	
	
	//GetElements util
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public ArrayList<String> getElementsText(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e : eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public  ArrayList<String> getElementsAttribute(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttributeList = new ArrayList<String>();
		
		for(WebElement e : eleList) {
			String attributeValue = e.getAttribute(attrName);
			if(attributeValue.length()!=0) {
				eleAttributeList.add(attributeValue);
			}			
		}
		return eleAttributeList; 	
		
	}
	
	//*******************select Base Utility***********
	public void doSelectByIndex(By locator, int index) {
		
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);	
	}
	
	public void doSelectByValue(By locator, String visibleText) {
		nullBlankCheck(visibleText);
		Select select = new Select(getElement(locator));
		select.selectByValue(visibleText);
	}
	
	public void soSelectByVisibleText(By locator, String value) {
		nullBlankCheck(value);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator)); 
		List<WebElement> listDropdown = select.getOptions();
		return listDropdown;
		
	}
	
	public int getDropdownValueCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	
	public ArrayList<String> getDropDownTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		ArrayList<String> optionTextList = new ArrayList<String>();
		
		for(WebElement e : optionsList) {
			String optionText = e.getText();
			optionTextList.add(optionText);	
		}
		return optionTextList;
	}
	
	public void doSelectDropdownValue(By locator, String slectValue) {
		List<WebElement> listDropdown = getDropDownOptionsList(locator);

		for (WebElement e : listDropdown) {
			String optionText = e.getText();

			if (optionText.equals(slectValue)) {
				e.click();
				break;

			}
		}

	}
	
	public void printSelectDropdownValues(By locator) {
		List<WebElement> listDropdown = getDropDownOptionsList(locator);
		for(WebElement e : listDropdown) {
			String optionText = e.getText();
			System.out.println(optionText);
		}
		
	}
	
	//select value without select class
	public void doSelectValueFromDropdown(By locator, String selectValue) {
		List<WebElement> optionList = getElements(locator);
		
		for(WebElement e : optionList) {
			String text  = e.getText();
			if(text.equals(selectValue)) {
				e.click();
				break;
			}
		}

		
	}
	
	
	//****************Action Util**************//
	public void handaleMenuAndSubMenu(By menuLocator, By subMenuLocator) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(menuLocator)).build().perform();
		Thread.sleep(3000);
		
		doElementClick(subMenuLocator);

		

	}
	public void handleMenuSubMenuleval4(By leval1menu,By leval2menu, By leval3menu, By leval4menu) throws InterruptedException {
		getElement(leval1menu).click();
		Thread.sleep(1500);
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(leval2menu)).build().perform();
		Thread.sleep(1500);
		act.moveToElement(getElement(leval3menu)).build().perform();
		Thread.sleep(1500);
		doElementClick(leval4menu);
		
		
		
	}
	public Actions getAction() {
		Actions act = new Actions(driver);
		return act;
	}
	public void doActionSendKeys(By locator, String value) throws InterruptedException {
		//Actions act = getAction();
		Thread.sleep(1500);
		getAction().sendKeys(getElement(locator), value).build().perform();
		
		
		
	}
	
	public void doActionClick(By locator) throws InterruptedException {
		//Actions act = new Actions(driver);
		Thread.sleep(1500);
		getAction().click(getElement(locator)).build().perform();
		
	}
	
	//send value with some pause
	public void doActionsSendValueWithPause(By locator, String value) {
		//Actions act = new Actions(driver);
		char val[] = value.toCharArray();
		
		for(char c: val) {
			getAction().sendKeys(getElement(locator), String.valueOf(c)).pause(1000).build().perform();
		}
		
	}
	
	//****************wait Utils*************************
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param locator
	 * @param timeOut
	 */
	public void clickWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		
	}
	
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. This does 
	 * notnecessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementVisible(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitForElementVisible(By locator , int timeOut, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locatorare visible. 
	 * Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
	
	
	
	//wait for title
	public String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		}
		catch (Exception e) {
			System.out.println("Title not found within time out" + timeOut);
		}
		
		return null;
	}
	
	//wait for title
	public String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		}
		catch (Exception e) {
			System.out.println("Title not found within time out" + timeOut);
		}
		
		return null;
	}
	
	// wait for URL
	public String waitForURLContains(String urlFraction , int timeUtit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeUtit));
		try {
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		}
		catch (Exception e) {
			System.out.println("URL not found of duration " + timeUtit + "time");
		}
		return null;
		
	}
	
	// wait for URL
	public String waitForURLIs(String url , int timeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeUnit));
		try {
		if(wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getCurrentUrl();
		}
		}
		catch (Exception e) {
			System.out.println("URL not found of duration " + timeUnit + "time");
		}
		return null;
	}
	
	//Alert with wait
	public Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofNanos(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public String getAlertText(int timeOut) {
		return waitForJSAlert(timeOut).getText();
		
	}
	
	public void accecptAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}
	
	public void dismissAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();
	}
	
	public void alertSendkeys(int timeOut, String value) {
		waitForJSAlert(timeOut).sendKeys(value);
	}
	
	//window handal with wait
	public boolean waitForWindow(int totalNumberOfWindowsToBe, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalNumberOfWindowsToBe));
		
	}
	

	
	

}
