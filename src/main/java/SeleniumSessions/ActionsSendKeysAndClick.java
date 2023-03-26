package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {
 static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By loginbtn =  By.xpath("//input[@value='Login']");
		
		doActionsSendKeys(email,"anil@gmail.com");
		doActionsSendKeys(pwd,"anil@123");
		doActionsClick(loginbtn);

		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsSendKeys(By locator,String value) {
		
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
		
	}
public static void doActionsClick(By locator) {
		
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
		
	}

}
