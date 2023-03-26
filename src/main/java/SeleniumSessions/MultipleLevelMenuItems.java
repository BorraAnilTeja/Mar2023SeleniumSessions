package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelMenuItems {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
	    By parentMenu = By.xpath("//a[@qa='categoryDD']");
	    selectLevel4MenuItems(parentMenu,"a","Beverages","Tea","Green Tea");
		
	}
	public static void selectLevel4MenuItems(By parentMenuLocator,String htmlTag,String level1Menu,String level2Menu,String level3Menu) throws InterruptedException {

		Actions act = new Actions(driver);
		
		WebElement parentMenu =driver.findElement(parentMenuLocator);
		act.moveToElement(parentMenu).build().perform();
		Thread.sleep(2000);
		

		WebElement level1 =driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level1Menu+"'])[2]"));
		act.moveToElement(level1 ).build().perform();
		Thread.sleep(2000);
		

		WebElement level2 =driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level2Menu+"'])[2]"));
		act.moveToElement(level2).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//"+htmlTag+"[text()='"+level3Menu+"'])[2]")).click();
		

	}

}
