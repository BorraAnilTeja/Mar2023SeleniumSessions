package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String label =driver.findElement(By.xpath("//input[@id='input-email']/preceding-sibling::label")).getText();
	    System.out.println(label);
	    
	    driver.get("https://www.amazon.in/");
	    
	    List<WebElement> list =driver.findElements(By.xpath("//div[text()='Get to Know Us']/following-sibling::ul//a"));
	    
	    for(WebElement e : list) {
	    	String text = e.getText();
	    	System.out.println(text);
	    }
	    driver.get("https://selectorshub.com/xpath-practice-page/");
	    
	    driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']")).click();
	  
	    driver.get("https://www.espncricinfo.com/series/australia-in-india-2022-23-1348637/india-vs-australia-3rd-test-1348654/full-scorecard");
	  //span[@class='ds-flex ds-cursor-pointer ds-items-center']/ancestor::td/preceding-sibling::td/a
	    
	   String text = driver.findElement(By.xpath(" //span[@class='ds-flex ds-cursor-pointer ds-items-center']/ancestor::td/preceding-sibling::td/a")).getText();
	   
	   System.out.println(text);
	}

}
