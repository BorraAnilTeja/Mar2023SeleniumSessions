package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By sourceLocator = By.id("draggable");
		By targetLocator = By.id("droppable");
		
		doActionsDragAndDrop(sourceLocator,targetLocator);
	

	}public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsDragAndDrop(By sourceLocator,By targetLocator) {
		
		WebElement sourceEle =getElement(sourceLocator);
		WebElement targetEle =getElement(targetLocator);
		
		Actions act = new Actions(driver);
		//1
	//	act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
		//2
		act.dragAndDrop(sourceEle, targetEle).build().perform();
	
		
		
		
	}

}
