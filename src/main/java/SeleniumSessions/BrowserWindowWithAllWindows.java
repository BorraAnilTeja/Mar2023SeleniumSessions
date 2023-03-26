package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithAllWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		String parentWindowID =driver.getWindowHandle();
		
		WebElement linkedIn =driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fb =driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement tw =driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		
		linkedIn.click();
		fb.click();
		tw.click();
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			if(!windowID.equals(parentWindowID)) {
				driver.close();
				
			}
		}
			driver.switchTo().window(parentWindowID);
		}
		

	}


