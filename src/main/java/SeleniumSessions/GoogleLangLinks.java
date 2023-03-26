package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {
static WebDriver driver;
	public static void main(String[] args) {

		   driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in");
			
			By lang = By.xpath("//div[@id='SIvCob']/a");
			
			
	    ElementUtil eleUtil=new ElementUtil(driver);
	    
	    
	    
	    eleUtil.doClickOnElement(lang, "తెలుగు");
			
			
				
			}
			
	}


