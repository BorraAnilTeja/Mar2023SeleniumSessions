package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
static WebDriver driver ;


	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		By edition = By.id("payment_plan_id");
		retryingElement(edition,10,2).click();
		

		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement retryingElement(By locator,int timeout,int intervalTime) {
		WebElement  element = null;
		int attempts=0;
		
		while(attempts<timeout) {
			try {
		element=	getElement(locator);
		System.out.println("ele is found in attempt :"+attempts);
		break;
		}
			catch(NoSuchElementException e) {
				System.out.println("Element not found on the page in attempts:"+ attempts);
				try {
					Thread.sleep(intervalTime);
				}
				catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		
		
	}
		if(element==null) {
			System.out.println("element is not found tried for attempts:"+attempts+"secs"+"with interval of :"+intervalTime+"secs");
			throw new FrameworkException("TimeOutException");
		}
		return element;
	}
}
