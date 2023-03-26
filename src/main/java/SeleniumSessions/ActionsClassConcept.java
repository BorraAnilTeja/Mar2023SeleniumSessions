package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	            
		          //By.xpath("//div[text()='Add-ons']);
		         //By.xpath("//div[text()='Activities']");
		selectSubMenu("div","Add-ons","Activities");
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void selectSubMenu(String htmlTag,String parentMenu,String childMenu) throws InterruptedException {
		
		By parentMenuLocator = By.xpath("//"+htmlTag+"[text()='"+parentMenu+"']");
		By childMenuLocator = By.xpath("//"+htmlTag+"[text()='"+childMenu+"']");
		
        WebElement parentMenuElement =getElement(parentMenuLocator);
        
		
		Actions act = new Actions(driver);
		act.moveToElement(parentMenuElement).build().perform();
		
		Thread.sleep(2000);
		
		doClick(childMenuLocator);
		
		
		
	}

}
