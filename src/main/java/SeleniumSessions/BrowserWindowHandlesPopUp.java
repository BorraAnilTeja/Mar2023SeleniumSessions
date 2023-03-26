package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandlesPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		WebElement linkedIn =driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		linkedIn.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String>it =handles.iterator();
		
		String parentWindowID = it.next();
		System.out.println("Parent window id is :"+parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Parent window id is :"+childWindowID);
		
		//switch to child window
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		//switch to parent window
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
