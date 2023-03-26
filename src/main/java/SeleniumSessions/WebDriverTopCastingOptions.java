package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTopCastingOptions {
	static WebDriver driver;

	public static void main(String[] args) {

		//A. creating the object of browser driver class
		//valid top casting and we use it for local specific browser execution
		//1. 
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
//		ChromeDriver driver = new ChromeDriver();

		//2.
//		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
//		FirefoxDriver driver = new FirefoxDriver();
		
		//3. 
//		System.setProperty("webdriver.edge.driver", "/Users/naveenautomationlabs/Downloads/edgedriver");
//		EdgeDriver driver = new EdgeDriver();
		
		//B. top casting: cross browser testing
		//valid top casting and we use it for local execution
		//to run test cases locally
		
		String browser ="chrome";
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Please pass the right browser:"+browser);
		}
		
		
		driver.get("https://www.google.com");
		
		String title =driver.getTitle();
		
		System.out.println("page title is :"+title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
			
			
		}
		driver.quit();
	
	}

}
