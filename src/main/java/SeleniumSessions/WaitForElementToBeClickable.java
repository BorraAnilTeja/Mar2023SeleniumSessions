package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementToBeClickable {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("anil");
		driver.findElement(By.name("password")).sendKeys("password");

		WebElement btn = driver.findElement(By.xpath("//input[@value='Login']"));

		waitForElementToBeClickable(btn,10);
	}
	public static void waitForElementToBeClickable(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	public static void waitForElementToBeClickable(WebElement ele,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}

}
