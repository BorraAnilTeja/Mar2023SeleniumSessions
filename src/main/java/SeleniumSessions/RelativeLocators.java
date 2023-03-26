package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
		
	     	driver.get("https://www.aqi.in/");
		
	        WebElement ele  =driver.findElement(By.xpath("(//a[text()='Raipur, India'])[1]"));
	       
	        //right of ele 
	        String rightIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();
	        System.out.println(rightIndex);
	        
	        //left of ele 
	        String leftRank = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
	        System.out.println(leftRank);
	        
	        //below of ele
	        
	        String aboveCity =driver.findElement(RelativeLocator.with(By.tagName("a")).above(ele)).getText();
	        System.out.println(aboveCity);
	      
	        //below of ele 
	      
	        String belowCity=  driver.findElement(RelativeLocator.with(By.tagName("a")).below(ele)).getText();	      
	        System.out.println(belowCity);
	        
	        
	        
	        
	}

}
