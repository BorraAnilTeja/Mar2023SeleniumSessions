package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
 static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//String hrefVal = driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
		
		By href = By.id("nav-logo-sprites");
		By aria = By.id("nav-logo-sprites");
	
		ElementUtil eleUtil = new ElementUtil(driver);
	    String hrefVal=	eleUtil.doGetAttributeValue(href, "href");
		String ariaVal =eleUtil.doGetAttributeValue(aria, "aria-label");
     
		System.out.println(hrefVal);
        System.out.println(ariaVal);

	}

}
