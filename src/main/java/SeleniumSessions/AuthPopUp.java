package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {
static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
	
		doLogin("admin","admin");
		
		
	}
	public static boolean doLogin(String username,String password) {
		
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
	
	String mesg =driver.findElement(By.xpath("//div[@id='content']//p")).getText();
	
	if(mesg.contains("Congratulations! You must have the proper credentials.")) {
		return true;
	}
	return false;
	}

}
