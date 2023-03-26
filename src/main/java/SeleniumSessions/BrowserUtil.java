package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	
	public WebDriver  launchBrowser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser:"+browserName);
			break;
			
		}
		return driver;
	}
	
	

    public void launchUrl(String url) {
    	
    	if(url==null) {
    		System.out.println("url is null");
    		throw new FrameworkException("url is null");
    	} if(url.length()==0) {
    		System.out.println("url is blank");
    		throw new FrameworkException("url is blank");
    	}
    	 if (url.indexOf("http") !=0 && url.indexOf("https")!=0) {
    		System.out.println("http or https is missing");
    		throw new FrameworkException("http or https is missing");
    		
    	}
    	driver.get(url);
    }
public void launchUrl(URL url) {
    	String newurl =String.valueOf(url);
    	if(newurl==null) {
    		System.out.println("url is null");
    		throw new FrameworkException("url is null");
    	} if(newurl.length()==0) {
    		System.out.println("url is blank");
    		throw new FrameworkException("url is blank");
    	}
    	 if (newurl.indexOf("http") !=0 && newurl.indexOf("https")!=0) {
    		System.out.println("http or https is missing");
    		throw new FrameworkException("http or https is missing");
    		
    	}
    	driver.get(newurl);
    }
    public String getPageTitle() {
            
    	return	  driver.getTitle();
    }
    public void quitBrowser() {
    	driver.quit();
 
    }
    public void closeBrowser() {
    	driver.close();
    }

}
