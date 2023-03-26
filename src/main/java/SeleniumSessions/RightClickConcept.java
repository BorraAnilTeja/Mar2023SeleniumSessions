package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
    
	static WebDriver driver;
	 
       public static void main(String[] args) {
    	    driver = new ChromeDriver();
    	    
    	    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
    	    
    	   WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
    	   
    	   Actions act = new Actions(driver);
    	   act.contextClick(ele).build().perform();
    	   
    	 List<WebElement> contextClickList =  driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]/span"));
		System.out.println(contextClickList.size());
    	 for(WebElement e : contextClickList) {
    		 String text =e.getText();
    		 System.out.println(text);
    		 if(text.equals("Copy")) {
    			 e.click();
    			 break;
    		 }
    	 }
        
		
	}

}
