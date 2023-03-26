package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		By element = By.name("search");
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static boolean  isSingleElementExist(By locator) {
		
		int actCount = getElements(locator).size();
		System.out.println("actual count of element :"+actCount);
		if(actCount==1) {
		return true;
		}
		return false;
		}
    public static boolean  isTwoElementExist(By locator) {
		
		int actCount = getElements(locator).size();
		System.out.println("actual count of element :"+actCount);
		if(actCount==2) {
		return true;
		}
		return false;
		}
public static boolean  isMultipleElementExist(By locator) {
		
		int actCount = getElements(locator).size();
		System.out.println("actual count of element :"+actCount);
		if(actCount>1) {
		return true;
		}
		return false;
		}
		
		
	public static boolean  isMultipleElementExist(By locator,int expectedCount) {
		
		int actCount = getElements(locator).size();
		System.out.println("actual count of element :"+actCount);
		if(actCount==expectedCount) {
		return true;
		}
		return false;
		}
		}
	
