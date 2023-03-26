package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForTitleUrlAlert {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.linkText("Register")).click();
		
		
	}
	public static String waitForTitleContains(String titleFractionValue,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleContains(titleFractionValue))) {
		return driver.getTitle();
	}
		else {
			System.out.println("expected title is not visible");
			return null;
		}
	}
	public static String waitForTitleIs(String titleVal,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(titleVal))) {
		return driver.getTitle();
	}
		else {
			System.out.println("expected title is not visible");
			return null;
		}
	}
	public static String waitForURLContains(String urlFractionValue,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleContains(urlFractionValue))) {
		return driver.getCurrentUrl();
	}
		else {
			System.out.println("expected url  is not visible");
			return null;
		}
	}
	public static String waitForURLToBe(String urlVal,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(urlVal))) {
			return driver.getCurrentUrl();
	}
		else {
			System.out.println("expected url  is not visible");
			return null;
		}
	}
	public static Alert waitForAlertPresentAndSwitch(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static String getAlertText(int timeout) {
		return waitForAlertPresentAndSwitch(timeout).getText();
	}
	public static void acceptAlert(int timeout) {
		waitForAlertPresentAndSwitch(timeout).accept();
	}
	public static void dismissAlert(int timeout) {
		waitForAlertPresentAndSwitch(timeout).dismiss();
	}
	public static void alertSendKeys(int timeout,String value) {
		waitForAlertPresentAndSwitch(timeout).sendKeys(value);

		
	}

}
