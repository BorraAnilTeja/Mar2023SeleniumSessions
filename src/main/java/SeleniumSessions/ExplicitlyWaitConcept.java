package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailid = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn =By.xpath("//input[@value='Login']");
		
		waitForElementPresence(emailid,10).sendKeys("anil@gmail.com");
		getElement(password).sendKeys("anil@123");
		getElement(loginBtn).click();
		
	}
	public  static WebElement   waitForElementPresence(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public  static WebElement   waitForElementVisible(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
