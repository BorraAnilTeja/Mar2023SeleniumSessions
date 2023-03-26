package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver =br.launchBrowser("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		System.out.println(br.getPageTitle());
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		
		By firstName =By.id("input-firstname");
		By lastName =By.id("input-lastname");
		By emailId =By.id("input-email");
		By telephone =By.id("input-telephone");
		By password =By.id("input-password");
		By confirm_Password =By.id("input-confirm");
		
		eleUtil.doSendKeys(firstName, "Anil");
		eleUtil.doSendKeys(lastName, "Teja");
		eleUtil.doSendKeys(emailId, "Anil@gmail.com");
		eleUtil.doSendKeys(telephone, "9809900099");
		eleUtil.doSendKeys(password, "Anil@123");
		eleUtil.doSendKeys(confirm_Password, "Anil@123");
		
		br.quitBrowser();

		
	}
	

}
